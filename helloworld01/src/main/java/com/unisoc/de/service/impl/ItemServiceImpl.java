package com.unisoc.de.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.unisoc.de.model.Item;
import com.unisoc.de.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Override
	public List<Item> getItems() {
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(1, "书籍1", 1999.0, new Date(), "很好"));
		itemList.add(new Item(2, "书籍2", 1999.0, new Date(), "很好2"));
		itemList.add(new Item(3, "书籍3", 1999.0, new Date(), "很好3"));
		itemList.add(new Item(4, "书籍4", 1999.0, new Date(), "很好4"));
		itemList.add(new Item(5, "书籍5", 1999.0, new Date(), "很好5"));
		return itemList;
	}

	
}
