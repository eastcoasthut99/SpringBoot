package com.example.SpringDynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/list")
	public String showList(Model model) {
		ArrayList<String> al = new ArrayList<>();
		al.add("One");
		al.add("Two");
		al.add("Threeeee");
		al.add("Fourrr");
		al.add("Fiveee");
		al.add("");
		model.addAttribute("numbers", al);
		return "list";
		
	}

	 @RequestMapping("/emp")
	 public String showEmp(Model model) {
	 List<employees> al = Arrays.asList(
					                     new employees("Peter",28,"Admin"),
					                     new employees("Joe",32,"Marketing"),
					                     new employees("Marie",48,"Sales")
					                     );
	   model.addAttribute("emp", al);	
	   return "emp";
     }
	
	
}
