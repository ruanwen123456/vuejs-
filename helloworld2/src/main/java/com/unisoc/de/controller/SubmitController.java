package com.unisoc.de.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class SubmitController {

	@GetMapping("/passValue")
	public String passValue() {
		
		return "passValue";
	}
	
	@PostMapping("/submitDemo")
	@ResponseBody
	public String submitDemo(HttpServletRequest request) {
		
		return request.getParameter("demotext");
	}
	
}
