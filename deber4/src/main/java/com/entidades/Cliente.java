package com.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity

	
	

public class Cliente {
	@Id
	@GeneratedValue
	
	private int id;
	private String nomCliente;
	private String appatCliente;
	private String apmatCliente;
	
	
	public Cliente() {}

	

	public Cliente(int id, String nomCliente, String appatCliente, String apmatCliente) {
		super();
		this.id = id;
		this.nomCliente = nomCliente;
		this.appatCliente = appatCliente;
		this.apmatCliente = apmatCliente;
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNomCliente() {
		return nomCliente;
	}



	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}



	public String getAppatCliente() {
		return appatCliente;
	}



	public void setAppatCliente(String appatCliente) {
		this.appatCliente = appatCliente;
	}



	public String getApmatCliente() {
		return apmatCliente;
	}



	public void setApmatCliente(String apmatCliente) {
		this.apmatCliente = apmatCliente;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomCliente=" + nomCliente + ", appatCliente=" + appatCliente + ", apmatCliente="
				+ apmatCliente + "]";
	}



	



	

    
	
}

