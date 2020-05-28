package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Reti_importe extends JFrame {

	/**
	 * Lanzar la aplicación.
	 */
	public void run() {
		try {
			Reti_importe window = new Reti_importe();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear la aplicación.
	 */
	public Reti_importe() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icono 4 - copia.jpg"));
		setTitle("Banco Popular/Retirada");
		initialize();
	}

	/**
	 * Inicializar los contenidos del JFrame.
	 */
	private void initialize() {

		getContentPane().setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 679, 438);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setBackground(new Color(0, 0, 255));
		btnAceptar.setBounds(130, 323, 194, 62);
		getContentPane().add(btnAceptar);

		JButton btnAtras = new JButton("Atras");
		btnAtras.setForeground(new Color(255, 255, 255));
		btnAtras.setBackground(new Color(0, 0, 255));
		btnAtras.setBounds(405, 323, 221, 62);
		getContentPane().add(btnAtras);

		JTextPane txtRetirar = new JTextPane();
		txtRetirar.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txtRetirar.setBounds(316, 130, 92, 69);
		getContentPane().add(txtRetirar);

		JLabel lblReti_importe = new JLabel("Retirar importe");
		lblReti_importe.setForeground(Color.BLUE);
		lblReti_importe.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblReti_importe.setBackground(Color.WHITE);
		lblReti_importe.setBounds(273, 13, 230, 106);
		getContentPane().add(lblReti_importe);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("images\\fondo poligonos.jpg"));
		lblFondo.setBounds(0, 0, 663, 399);
		getContentPane().add(lblFondo);

		// Acciones

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new vistas.perfil_cuenta().setVisible(true);
			}
		});

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String retirar = txtRetirar.getText();
				double retiradadinero = Double.parseDouble(retirar);
				try {
					new controlador.accounts().retirardinero(retiradadinero);
					new Fichero.Fichero_Recibo_Retirada(retiradadinero);
				} catch (SQLException | IOException e1) {
					e1.printStackTrace();
				}
				dispose();
				new vistas.perfil_cuenta().setVisible(true);
			}
		});
	}
}