package com.senati.lab402;

public class ImplementaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear un objeto policia con calse de persona
		persona policia = new persona ();
		policia.id = 1;
		policia.nombre  =  "Roberto";
		policia.apellido = "Gonzales";
		policia.sexo = true;
		policia.ecivil = 'S';
		
		System.out.println(policia.toString());
	}

}
