package com.unisoc.de.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unisoc.de.model.Item;
import com.unisoc.de.service.ItemService;

@RequestMapping("/")
@Controller
public class ItemList {


	private ItemService itemService;
	
	@GetMapping("/itemList")
	public ModelAndView itemList(){
		
		ModelAndView mav = new ModelAndView();
		List<Item> itemList = itemService.getItems();
		
		//设置商品数据
		mav.addObject("itemList", itemList);
		//设置视图名字
		mav.setViewName("itemList");
		return mav;
	}

}
