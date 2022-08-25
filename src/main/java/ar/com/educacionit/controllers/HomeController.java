package ar.com.educacionit.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Repository
//@Service 

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String Home() {
		//ir a la pagina home.html
		return "home";
	}
	
	
}
