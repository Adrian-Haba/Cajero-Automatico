package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class EliminarCuenta extends JFrame {

	/**
	 * Lanzar la aplicación.
	 */
	public void run() {
		try {
			EliminarCuenta window = new EliminarCuenta();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear la aplicación.
	 */
	public EliminarCuenta() {
		initialize();
	}

	/**
	 * Inicializar los contenidos del JFrame.
	 */
	private void initialize() {
		setTitle("Banco Popular/Eliminar Cuenta");
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icono 4 - copia.jpg"));
		getContentPane().setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 656, 456);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblEli_cuenta = new JLabel("Eliminar cuenta");
		lblEli_cuenta.setForeground(Color.BLUE);
		lblEli_cuenta.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblEli_cuenta.setBackground(Color.WHITE);
		lblEli_cuenta.setBounds(246, 11, 169, 106);
		getContentPane().add(lblEli_cuenta);

		JLabel lbltextoaviso = new JLabel(
				"<html>Esta accion eliminar\u00E1 permanentemente esta cuenta. Le recordamos retirar su saldo o transferirlo a una de sus cuentas ya que el saldo que se quede almacenado tras el borrado de cuenta, se lo quedar\u00E1 el banco. Dicho esto, desea proceder a la eliminaci\u00F3n de su cuenta?<html>");
		lbltextoaviso.setToolTipText("");
		lbltextoaviso.setBounds(154, 158, 351, 87);
		getContentPane().add(lbltextoaviso);

		JButton btnSi = new JButton("Si");
		btnSi.setForeground(Color.WHITE);
		btnSi.setBackground(Color.BLUE);
		btnSi.setBounds(154, 272, 158, 66);
		getContentPane().add(btnSi);

		JButton btnNo = new JButton("No");
		btnNo.setForeground(Color.WHITE);
		btnNo.setBackground(Color.BLUE);
		btnNo.setBounds(371, 271, 158, 69);
		getContentPane().add(btnNo);

		JLabel lblnomcuenta = new JLabel("Nombre de la cuenta");
		lblnomcuenta.setBounds(91, 96, 137, 51);
		getContentPane().add(lblnomcuenta);

		JLabel lblFondoTexto = new JLabel("");
		lblFondoTexto.setIcon(new ImageIcon("images\\fondo blanco.jpg"));
		lblFondoTexto.setBounds(132, 148, 404, 97);
		getContentPane().add(lblFondoTexto);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("images\\fondo poligonos.jpg"));
		lblFondo.setBounds(0, 0, 640, 417);
		getContentPane().add(lblFondo);

		JTextPane panelcuenta = new JTextPane();
		panelcuenta.setBounds(238, 111, 177, 26);
		getContentPane().add(panelcuenta);

		// Acciones

		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cuenta no eliminada, volviendo a la elección de cuenta");
				dispose();
				new vistas.elegircuenta().setVisible(true);
			}
		});

		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombrecuenta = panelcuenta.getText();
				try {
					new controlador.accounts().deletecuenta(nombrecuenta);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				dispose();
				new vistas.elegircuenta().setVisible(true);
			}
		});

	}
}