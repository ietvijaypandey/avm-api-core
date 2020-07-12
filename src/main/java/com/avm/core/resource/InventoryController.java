package com.avm.core.resource;

import com.avm.core.Service.InventoryService;
import com.avm.core.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "Hello Consumer, we are here to serve you.";
    }

    @PostMapping("/saveInventory")
    public Inventory saveInventoryDetails(@RequestBody Inventory inventory) {
        return inventoryService.saveInventory(inventory);
    }

    @GetMapping("/getInventory")
    public List<Inventory> getInventoryData() {
        return inventoryService.getInventory();
    }
}
