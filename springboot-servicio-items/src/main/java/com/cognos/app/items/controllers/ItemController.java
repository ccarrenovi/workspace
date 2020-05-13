package com.cognos.app.items.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognos.app.items.model.Item;
import com.cognos.app.items.model.service.ItemService;

@RestController
public class ItemController {
    @Autowired
	private ItemService itemService;
	
    @GetMapping("/listar")
    public List<Item> listar(){
    	return itemService.findAll();
    }
    
    @GetMapping("/ver/{id}/cantidad/{cantidad}")
    public Item detalle(@PathVariable Long id,@PathVariable Integer cantidad) {
    	return itemService.findbyId(id, cantidad);
    }
}

