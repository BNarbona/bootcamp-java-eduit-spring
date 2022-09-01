package ar.com.educacionit.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//@Repository
//prueba
@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String home (Model model) {
		
		model.addAttribute("clave","v1");
		
		model.addAttribute("PERSONA", new Persona("Brenda"));
		//ir a la pagina home.html
		return "home";
	}
	
	@PostMapping(value = "/home/post")
	public String homePost(
			@ModelAttribute("PERSONA") Persona persona //desde el front viene un objeto completo, tengo que usar el MmodelAttribute
			) {
		
		System.out.println("Viene del HTML con el valor: " + persona.nombre);
		return "redirect:/cupon/list"; //en lugar de ir a una vista, podemos hacer un rediret a la vista que queremos
	}
	
	 class Persona {
		private String nombre;

		public Persona(String nombre) {
			super();
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}	
	}
	
}