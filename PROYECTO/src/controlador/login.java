package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.usuarios;

public class login {
	
	// Registrar un usuario con su contraseña
	public void insertusuario(String usuario, String contrasena) throws SQLException {
		boolean register = new modelo.Users().insertusuario(usuario,contrasena);
		if(register) { //Registro de usuario
			JOptionPane.showMessageDialog(null, "Usuario registrado, ya puede iniciar sesión");
		}else { // Sino error
			JOptionPane.showMessageDialog(null, "Credenciales incompletas o incorrectas");
		}
	}
	
	//Eliminar un usuario
	public void deleteusuario(String usuario) throws SQLException {
		//Recoge el usuario y luego lo elimina
		boolean delete = new modelo.Users().deleteusuario(usuario);
		if (delete) {
			JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
		}
	}
	
	//Ver si al introducir un usuario y contraseña está registrado en la bbdd
	public void checkusuario(String usuario, String contrasena) {
		// Recoger los usuarios y comprueba si el usuario es correcto o no
		boolean check = new modelo.Users().checkusuarioAndPass(usuario, contrasena);  
		if(check) {
			JOptionPane.showMessageDialog(null, "Usuario correcto");
			new vistas.elegircuenta().setVisible(true);
		}else { // Sino error
			JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		}
	}
	
	public boolean checkusuarioOld(String usuario, String contrasena) {
		// Recoger los usuarios
		ArrayList<usuarios> usuarios = new modelo.Users().getAllusuarios();
		// Comprobar si usuario y contraseña son correctos
		for(usuarios Users : usuarios) {
			if(usuario.equals(Users.getusuario()) && contrasena.equals(Users.getcontrasena())) {
				JOptionPane.showMessageDialog(null, "Usuario correcto");
			}else { // Sino error
				JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			}
		}
		return true;
	}
	
}

