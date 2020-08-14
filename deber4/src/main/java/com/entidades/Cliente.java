package com.entidades;





import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="PAis_ID")
	private Pais pais;
	
	
	
	public Cliente() {
	}
	
	

	



	







	public Cliente(String nombre, String apellidoP, String apellidoM, Pais pais) {
		super();
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.pais = pais;
	}















	public Pais getPais() {
		return pais;
	}















	public void setPais(Pais pais) {
		this.pais = pais;
	}















	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    


	public String getApellidoP() {
		return apellidoP;
	}







	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}







	public String getApellidoM() {
		return apellidoM;
	}







	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}








}