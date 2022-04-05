package com.djonata.sistemaAcademico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.djonata.sistemaAcademico.repository.FaculdadeRepository;

@Controller
public class FaculdadeController {

	private FaculdadeRepository faculRepository;

	public FaculdadeController(FaculdadeRepository faculRepository) {
		this.faculRepository = faculRepository;
	}

	@GetMapping("/rh/faculdades")
	public String faculdades(Model model) {
		model.addAttribute("listaFaculdades", faculRepository.findAll());
		return "rh/faculdades/index";
	}
}
