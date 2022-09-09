package ar.com.educacionit.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.services.SociosService;

@Controller
@RequestMapping("/socio")
public class SociosController {

	//D.I
	@Autowired
	private SociosService sociosService;
	
	@GetMapping("/all")
	public String all(Model model) {
		
		List<Socios> socios = this.sociosService.buscarTodos();
		System.out.println(socios);
		model.addAttribute("socios", socios);
		return "socios";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam(name="idSocio", required= true) Long idSocio) {
		
		this.sociosService.eliminar(idSocio);
		
		return "redirect:/socio/all";
	}
	
	@GetMapping("/edit/{id}")
	public String preEdit(
			@PathVariable(name="id", required= true) Long id,
			Model model){
		
		Socios socios = this.sociosService.buscarSocio(id);
		model.addAttribute("SOCIO", socios);
		return "edit";
	}
	
	@PostMapping("/edit")
	public String editar(
		@Valid
		@ModelAttribute(name="SOCIO") Socios socio,
		BindingResult result,
		Model modelAndView
			){
		
		//ModelAndView modelAndView = new ModelAndView("edit"); //aca va la vista o un redirect
		
		if(result.hasErrors()) {
			modelAndView.addAttribute("SOCIO", socio); // guardo el socio que vino, sino lo pierdo
			return "edit";
		}
		
		modelAndView.addAttribute("SOCIO", socio);  //enviamos el objeto a mostrar (ahora va vacio para que no se rompa)
		return "edit";
	}

}
