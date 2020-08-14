package com.entidades;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity

	
	

public class Pais {
	@Id
	@GeneratedValue
	
	private int id;
	private String nomPais;
	
	
	
	
	
	public Pais() {}





	public Pais(int id, String nomPais) {
		super();
		this.id = id;
		this.nomPais = nomPais;
	}





	public int getId() {
		return id;
	}





	public void setIdPais(int id) {
		this.id = id;
	}





	public String getNomPais() {
		return nomPais;
	}





	public void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}





	@Override
	public String toString() {
		return "Pais [id=" + id + ", nomPais=" + nomPais + "]";
	}





	
	
    
	
	

}

