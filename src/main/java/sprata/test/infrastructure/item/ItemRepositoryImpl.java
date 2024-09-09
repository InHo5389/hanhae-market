package sprata.test.infrastructure.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import sprata.test.domain.item.Item;
import sprata.test.domain.item.ItemRepository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {

    private final ItemJpaRepository itemJpaRepository;

    @Override
    public Item save(Item item) {
        return itemJpaRepository.save(item);
    }

    @Override
    public List<Item> findAll(){
        return itemJpaRepository.findAll();
    }

    @Override
    public Optional<Item> findById(Long id){
        return itemJpaRepository.findById(id);
    }

    @Override
    public void deleteById(Long id){
        itemJpaRepository.deleteById(id);
    }
}
