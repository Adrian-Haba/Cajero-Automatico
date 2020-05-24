package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.usuarios;

public class Users {
	// Recoger en un arraylist la tabla de los usuarios con sus datos
	public ArrayList<usuarios> getAllusuarios() {
		ResultSet resultados = conexion.EjecutarSentencia("SELECT * FROM usuarios");
		ArrayList<usuarios> usuarios = new controlador.Helperusuarios().ResultSet2ArrayList(resultados);
		return usuarios;
	}

	// Comprobar si el usuario y la contraseña que introduzcamos están registrados
	// en la bbdd
	public boolean checkusuarioAndPass(String usuario, String contrasena) {
		ResultSet usuarioBD = conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE usuario='" + usuario + "' AND contrasena='" + contrasena + "';");
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}

	// Registrar un usuario en la bbdd con su contraseña
	public boolean insertusuario(String usuario, String contrasena) throws SQLException {
		conexion.EjecutarUpdate("INSERT INTO usuarios (ID, USUARIO, CONTRASENA) VALUES (4, '" + usuario + "', '" + contrasena + "');");
		return true;
	}

	// Eliminar un usuario
	public boolean deleteusuario(String usuario) throws SQLException {
		conexion.EjecutarUpdate("DELETE FROM usuarios WHERE usuario = '" + usuario + "';");
		return true;
	}

}
