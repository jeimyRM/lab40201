package com.senati.lab402;

public class persona {
	//DECLARACION DE ATRIBUTOS
	int id;
	String nombre;
	String apellido;
	boolean sexo;
	char ecivil;
	public persona() {
		super();
	}
	public persona(int id, String nombre, String apellido, boolean sexo, char ecivil) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.ecivil = ecivil;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public char getEcivil() {
		return ecivil;
	}
	public void setEcivil(char ecivil) {
		this.ecivil = ecivil;
	}
	@Override
	public String toString() {
		return "persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", ecivil="
				+ ecivil + "]";
	}
	
	
}
