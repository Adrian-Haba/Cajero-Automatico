package controlador;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import beans.cuentas;

public class accounts {

	// Insertar una cuenta en la BBDD
	public void insertcuenta(String nombrecuenta) throws SQLException {
		boolean register = new modelo.Accounts().insertcuenta(nombrecuenta);
		if (register) { // Registro de cuentas
			JOptionPane.showMessageDialog(null, "Cuenta registrada, ya puede usarla");
		}
	}

	public void deletecuenta(String nombrecuenta) throws SQLException {
		boolean delete = new modelo.Accounts().deletecuenta(nombrecuenta);
		if (delete) { // Eliminar cuenta
			JOptionPane.showMessageDialog(null, "Cuenta eliminada, volviendo a la elección de cuenta");
		}
	}

	// SELECT CUENTAS
	/*
	 * public void checkcuentas(String nombrecuenta) { boolean check = new
	 * modelo.Accounts().checkcuentas(nombrecuenta);
	 * 
	 * if(check) { JOptionPane.showMessageDialog(null, "Usuario correcto"); new
	 * vistas.elegircuenta().setVisible(true); }else { // Sino error
	 * JOptionPane.showMessageDialog(null, "Usuario no encontrado"); }
	 * 
	 * }
	 */

	// Ingreso de dinero: recoger el saldo de la bbdd, recoger el dinero ingresado, sumarlo y actualizarlo en la bbdd
	public double ingresardinero(double saldo) throws SQLException {

		double saldoupdate = 0;

		saldoupdate = saldo + saldo;
		new modelo.Accounts().updatecuenta(saldoupdate);
		JOptionPane.showMessageDialog(null, "Dinero ingresado");

		return saldo;
	}

	// Retirada de dinero: recoger el saldo de la bbdd, recoger el dinero indicado a retirar, restarlo y actualizarlo en la bbdd
	public double retirardinero(double saldo) throws SQLException {

		double saldoupdate = 0;

		saldoupdate = saldo - saldo;

		new modelo.Accounts().updatecuenta(saldoupdate);
		JOptionPane.showMessageDialog(null, "Dinero retirado");

		return saldo;
	}

}
