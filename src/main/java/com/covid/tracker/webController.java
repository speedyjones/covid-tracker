package com.covid.tracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class webController {


	@GetMapping("/index")
	public String inedx(@RequestParam(value = "name", required = true, defaultValue = "World") String name, Model model)
	{
			model.addAttribute("name",name);
			System.out.println("Hello");
			return "index";
	}
	
		
	
}
