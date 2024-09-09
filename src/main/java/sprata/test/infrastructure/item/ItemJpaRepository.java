package sprata.test.infrastructure.item;

import org.springframework.data.jpa.repository.JpaRepository;
import sprata.test.domain.item.Item;

public interface ItemJpaRepository extends JpaRepository<Item,Long> {
}
