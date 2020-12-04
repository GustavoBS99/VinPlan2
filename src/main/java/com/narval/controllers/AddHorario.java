package com.narval.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.narval.Dto.form.PuntoTuristicoForm;
import com.narval.Dto.form.horarioForm;
import com.narval.Services.PuntoTuristicoService;
import com.narval.Services.horariosService;
@Controller
public class AddHorario {
	@Autowired
	horariosService horarioservice;
	@GetMapping("/AddHorario")
	public String login(Model model) {
		
		return "AddHorario";
		
	}
	@PostMapping("/AddHorario")
	public void addHorario(@ModelAttribute horarioForm horarioform, /*RedirectAttributes redirectAttributes,*/ Model model) {
		
		horarioservice.Addhorario(horarioform);
	
	}

}
