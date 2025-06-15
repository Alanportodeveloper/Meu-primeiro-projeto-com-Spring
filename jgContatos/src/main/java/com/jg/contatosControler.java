package com.jg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class contatosControler {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

}
