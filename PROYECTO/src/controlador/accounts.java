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

	// Ingreso de dinero: recoger el saldo de la bbdd, recoger el dinero ingresado,
	// sumarlo y actualizarlo en la bbdd
	public double ingresardinero(double ingresodinero) throws SQLException {
		boolean addmoney = new modelo.Accounts().updatesaldoingresado(ingresodinero);
		if (addmoney) {
			JOptionPane.showMessageDialog(null, "Dinero ingresado");
			JOptionPane.showMessageDialog(null, "Se le va a mostrar su recibo por pantalla");
		}
		return ingresodinero;
	}

	// Retirada de dinero: recoger el saldo de la bbdd, recoger el dinero indicado a
	// retirar, restarlo y actualizarlo en la bbdd
	public double retirardinero(double retiradadinero) throws SQLException {
		boolean removemoney = new modelo.Accounts().updatesaldoretirado(retiradadinero);
		if (removemoney) {
			JOptionPane.showMessageDialog(null, "Dinero retirado");
			JOptionPane.showMessageDialog(null, "Se le va a mostrar su recibo por pantalla");
		}
		return retiradadinero;
	}

}
