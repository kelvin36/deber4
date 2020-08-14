package com.entidades;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;


@Entity
public class Pais {
	@Id
	@GeneratedValue
	private int id;
	private String nombrePais;
	@OneToMany(mappedBy  ="pais", cascade=CascadeType.ALL )
	private List<Cliente> cliente= new ArrayList<>();
	
	

	
	
	
	public Pais() {
	}
	
	

	


	public Pais(String nombrePais) {
		super();
		this.nombrePais = nombrePais;
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}






	public String getNombrePais() {
		return nombrePais;
	}






	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}






	public List<Cliente> getCliente() {
		return cliente;
	}






	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	
}