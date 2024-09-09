package sprata.test.api.item;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sprata.test.api.item.dto.ItemRequest;
import sprata.test.domain.item.Item;
import sprata.test.domain.item.ItemService;
import sprata.test.domain.item.dto.ItemResponse;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/post")
    public ItemResponse.Create createPost(@RequestBody ItemRequest.Create request) {
        return itemService.createPost(request.toCommand());
    }

    @GetMapping("/post")
    public List<ItemResponse.GetAll> getAllPost() {
        return itemService.getPostList();
    }

    @PutMapping("/post/{id}")
    public ItemResponse.Put putBoard(@RequestBody ItemRequest.Put request,
                                     @PathVariable Long id) {
        return itemService.updatePost(request.toCommand(), id);
    }

    @DeleteMapping("/post/{id}")
    public ItemResponse.Delete deleteBoard(@PathVariable Long id) {
        return itemService.deletePost(id);
    }

}
