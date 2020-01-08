package pl.asprojects.nosItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asprojects.nosItems.model.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {
}
