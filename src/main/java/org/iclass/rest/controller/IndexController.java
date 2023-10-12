package org.iclass.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {

		return "index";			//index.html
	}
	
	@GetMapping("/join")
	public void join() {
		
	}
	

}
