package com.narval.Dto.form;

import java.sql.Timestamp;

public class horarioForm {

	private String horaApertura; 
	private String horaCierre; 
	private int maxAforo;
	private String Servicio;
	private String vinicola;
	private String dias;
	public String getHoraApertura() {
		return horaApertura;
	}
	public void setHoraApertura( String horaApertura) {
		this.horaApertura = horaApertura;
	}
	public String getHoraCierre() {
		return horaCierre;
	}
	public void setHoraCierre( String horaCierre) {
		this.horaCierre = horaCierre;
	}
	public int getMaxAforo() {
		return maxAforo;
	}
	public void setMaxAforo(int maxAforo) {
		this.maxAforo = maxAforo;
	}
	public String getServicio() {
		return Servicio;
	}
	public void setServicio(String servicio) {
		Servicio = servicio;
	}
	public String getVinicola() {
		return vinicola;
	}
	public void setVinicola(String vinicola) {
		this.vinicola = vinicola;
	}
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	
	
}
