package pl.asprojects.nosItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asprojects.nosItems.model.CharacterEntity;
import pl.asprojects.nosItems.model.InventoryItemEntity;

import java.util.List;

public interface InventoryItemRepository extends JpaRepository<InventoryItemEntity, Integer> {

}
