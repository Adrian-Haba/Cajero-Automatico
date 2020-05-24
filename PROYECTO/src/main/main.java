package main;

import bbdd.conexion;
import vistas.credenciales;


public class main {

	public static void main(String[] args) {
		/*Conecto con la base de datos*/
		conexion.Conectar();
		/*Mostrar primera pantalla*/
		credenciales.run();
	}

}

