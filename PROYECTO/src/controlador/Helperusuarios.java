package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.usuarios;

public class Helperusuarios {
	
	public ArrayList<usuarios> ResultSet2ArrayList(ResultSet resultados) {
		// Ya tengo los datos de la BBDD
		// Voy a transformarlos a objetos
		ArrayList<usuarios> arraylist = new ArrayList<usuarios>();
		try {
			while(resultados.next()) {
				int id = resultados.getInt("id");
				String user = resultados.getString("usuario");
				String password = resultados.getString("contrasena");
				arraylist.add(new usuarios(id, user, password));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		
		return arraylist;
	}

}