package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.cuentas;

public class Helpercuentas {
	
	public ArrayList<cuentas> ResultSet2ArrayList(ResultSet resultados) {
		// Ya tengo los datos de la BBDD
		// Voy a transformarlos a objetos
		ArrayList<cuentas> arraylist = new ArrayList<cuentas>();
		try {
			while(resultados.next()) {
				int id_user = resultados.getInt("id_usuario");
				String nombrecuenta = resultados.getString("nombrecuenta");
				double saldo = resultados.getDouble("saldo");
				int id_account = resultados.getInt("id_cuenta");
				arraylist.add(new cuentas(id_user, nombrecuenta, saldo, id_account));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de cuentas");
		}
		
		return arraylist;
	}

}