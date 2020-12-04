package com.narval.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.narval.Models.Horas;
import com.narval.Models.PuntoTuristico;


	@Repository
	public interface HorarioRepository extends CrudRepository<Horas, String> {
	
		@Procedure
		void horario(String horaApertura,String horaCierre,int maxAforo,String servicio,int vinicola,String dias);
	}


