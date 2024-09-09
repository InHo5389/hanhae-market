package sprata.test.domain.item;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {
    Item save(Item item);
    List<Item> findAll();
    Optional<Item> findById(Long id);
    void deleteById(Long id);
}
