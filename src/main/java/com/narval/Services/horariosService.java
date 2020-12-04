package com.narval.Services;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.narval.Dto.form.PuntoTuristicoForm;
import com.narval.Dto.form.horarioForm;
import com.narval.repository.HorarioRepository;

@Service
public class horariosService {
	@Autowired
	HorarioRepository horarioRepository;
	@Autowired
	UserService userService;
	public void Addhorario(horarioForm horarioForm) {
	
		
		UserDetails userDetails=userService.currentUserDetails();
        int id=userService.getIdByEmail(userDetails.getUsername());
		String horaApertura=horarioForm.getHoraApertura();
		String horaCierre=horarioForm.getHoraCierre();
		int maxAforo=horarioForm.getMaxAforo();
		String servicio=horarioForm.getServicio();
		String vinicola=horarioForm.getVinicola();
		String dias=horarioForm.getDias();
		System.out.println(id);
		System.out.println(horaApertura);
		System.out.println(horaCierre);
		System.out.println(maxAforo);
		System.out.println(servicio);
		System.out.println(vinicola);
		System.out.println(dias);
		horarioRepository.horario(horaApertura, horaCierre, maxAforo, servicio, id, dias);

	
		
		

	
	}
}
