package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.cuentas;

public class Accounts {

	// Recoger en un arraylist la tabla de las cuentas con sus datos
	public ArrayList<cuentas> getAllcuentas() {
		ResultSet resultados = conexion.EjecutarSentencia("SELECT * FROM cuentas");
		ArrayList<cuentas> cuentas = new controlador.Helpercuentas().ResultSet2ArrayList(resultados);
		return cuentas;
	}

	//Tener la información de la cuenta que seleccionemos
	public boolean checkcuentas(String nombrecuenta) {
		ResultSet cuentasBD = conexion.EjecutarSentencia("SELECT * FROM cuentas WHERE nombrecuenta= '" + nombrecuenta + "';");
		try {
			return cuentasBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	
	//Registrar una cuenta en la bbdd
	public boolean insertcuenta(String nombrecuenta) throws SQLException {
		conexion.EjecutarUpdate("INSERT INTO cuentas (ID_USUARIO, NOMBRECUENTA, SALDO, ID_CUENTA) VALUES (1, '"+ nombrecuenta + "', 0 , 5);");
		return true;
	}
	//Registrar el saldo de una cuenta en la bbdd
	public boolean updatecuenta(double saldo) throws SQLException {
		conexion.EjecutarUpdate("Update cuentas set saldo = '" + saldo + "' where id_cuenta = 5;");
		return true;
	}
	//Eliminar una cuenta de la bbdd
	public boolean deletecuenta(String nombrecuenta) throws SQLException {
		conexion.EjecutarUpdate("DELETE from cuentas WHERE nombrecuenta = '" + nombrecuenta + "';");
		return true;
	}

}
