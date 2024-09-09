package sprata.test.domain.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sprata.test.domain.item.dto.ItemCommand;
import sprata.test.domain.item.dto.ItemResponse;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemResponse.Create createPost(ItemCommand.Create command){
        return new ItemResponse.Create(itemRepository.save(command.toEntity()));
    }

    public List<ItemResponse.GetAll> getPostList(){
        List<Item> itemList = itemRepository.findAll();
        return itemList.stream()
                .map(ItemResponse.GetAll::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public ItemResponse.Put updatePost(ItemCommand.Put command,Long postId){
        Item item = itemRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("생성된 post가 없습니다."));

        item.changeItem(command.getUsername(), command.getTitle(), command.getContent(), command.getPrice());

        return new ItemResponse.Put(item);
    }

    public ItemResponse.Delete deletePost(Long postId){
        Item item = itemRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("생성된 post가 없습니다."));
        itemRepository.deleteById(item.getId());
        return new ItemResponse.Delete("삭제 완료");
    }
}
