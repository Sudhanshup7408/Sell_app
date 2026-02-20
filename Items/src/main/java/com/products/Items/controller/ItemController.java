package com.products.Items.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.Items.Entity.Item;
import com.products.Items.repository.ItemRepository;

@RestController
@RequestMapping("/api/v1")
public class ItemController {
	
	private final ItemRepository repo;
	
	public ItemController(ItemRepository repo) {
		this.repo = repo;
	}
	
	//Add item to the inventory
	//Add category to the inventory
	
	//Update item to the list
	//Update the category
	
	//Get the whole list of the item
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return repo.findAll();
	}
	//Get the single item by the id 
	//Get the list of item by the category
	//Get the item by category and id
	//Get the list of categories

	//Removal of category
	//Removal of item

}
