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
import java.sql.SQLException;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class AgregarCuenta extends JFrame {

	/**
	 * Lanzar la aplicación.
	 */
	public void run() {
		try {
			AgregarCuenta window = new AgregarCuenta();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear la aplicación.
	 */
	public AgregarCuenta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icono 4 - copia.jpg"));
		setTitle("Banco Popular/Agregar Cuenta");
		initialize();
	}

	/**
	 * Inicializar los contenidos del JFrame.
	 */
	private void initialize() {
		getContentPane().setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 792, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setBackground(new Color(0, 0, 255));
		btnAceptar.setBounds(200, 323, 194, 62);
		getContentPane().add(btnAceptar);

		JButton btnAtras = new JButton("Atras");
		btnAtras.setForeground(new Color(255, 255, 255));
		btnAtras.setBackground(new Color(0, 0, 255));
		btnAtras.setBounds(423, 323, 221, 62);
		getContentPane().add(btnAtras);

		JLabel lblnombrecuenta = new JLabel("Nombre de la cuenta");
		lblnombrecuenta.setBounds(153, 149, 137, 51);
		getContentPane().add(lblnombrecuenta);

		JLabel lblBancoPopular = new JLabel("Agregar cuenta");
		lblBancoPopular.setForeground(Color.BLUE);
		lblBancoPopular.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblBancoPopular.setBackground(Color.WHITE);
		lblBancoPopular.setBounds(315, 11, 230, 106);
		getContentPane().add(lblBancoPopular);

		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setIcon(new ImageIcon("images\\fondo poligonos.jpg"));
		lblFondo.setBounds(0, -21, 776, 480);
		getContentPane().add(lblFondo);

		JTextPane textocuenta = new JTextPane();
		textocuenta.setBounds(300, 161, 177, 26);
		getContentPane().add(textocuenta);

		// Acciones

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new vistas.elegircuenta().setVisible(true);
			}
		});

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al controlador
				String nombrecuenta = textocuenta.getText();
				try {
					new controlador.accounts().insertcuenta(nombrecuenta);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				dispose();
				new vistas.elegircuenta().setVisible(true);
			}
		});

	}
}