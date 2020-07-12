package com.avm.core.Service;

import com.avm.core.model.Inventory;
import com.avm.core.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;

    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getInventory() {
        return (List<Inventory>) inventoryRepository.findAll();
    }
}
