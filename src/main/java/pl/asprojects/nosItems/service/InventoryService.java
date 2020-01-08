package pl.asprojects.nosItems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.asprojects.nosItems.model.CharacterEntity;
import pl.asprojects.nosItems.model.InventoryEntity;
import pl.asprojects.nosItems.model.InventoryItemEntity;
import pl.asprojects.nosItems.repository.InventoryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    public InventoryEntity createEmptyInventory(CharacterEntity owner) {
        return inventoryRepository.save(new InventoryEntity(0, owner, new ArrayList<>()));

    }
}
