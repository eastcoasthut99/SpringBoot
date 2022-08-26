package com.example.curryLeaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("/data")
	public String showData(Model model, @RequestParam Integer age, @RequestParam (required=false, defaultValue="100")Integer height) {
		model.addAttribute("age", age);
		return "test";
		
		
	}
}
