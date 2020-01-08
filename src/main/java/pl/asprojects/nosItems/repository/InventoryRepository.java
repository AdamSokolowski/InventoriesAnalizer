package pl.asprojects.nosItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asprojects.nosItems.model.InventoryEntity;

import java.util.List;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {
    List<InventoryEntity> findByItemListItemName(String itemName);
}
