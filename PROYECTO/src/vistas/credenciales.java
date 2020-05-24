package vistas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;

import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class credenciales extends JFrame {

	private JPasswordField passwordField;
	private JTextPane usertexto;

	/**
	 * Lanzar la aplicación.
	 */
	public static void run() {
		try {
			credenciales window = new credenciales();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear la aplicación.
	 */
	public credenciales() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icono 4 - copia.jpg"));
		initialize();
	}

	/**
	 * Inicializar los contenidos del JFrame.
	 */
	private void initialize() {
		setTitle("Banco Popular/login");
		getContentPane().setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 750, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(0, 0, 255));
		btnIniciarSesion.setBounds(197, 323, 150, 62);
		getContentPane().add(btnIniciarSesion);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(0, 0, 255));
		btnSalir.setBounds(563, 323, 161, 62);
		getContentPane().add(btnSalir);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(156, 114, 110, 51);
		getContentPane().add(lblUsuario);

		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setBounds(156, 177, 123, 44);
		getContentPane().add(lblContrasena);

		usertexto = new JTextPane();
		usertexto.setBounds(275, 128, 177, 26);
		getContentPane().add(usertexto);

		passwordField = new JPasswordField();
		passwordField.setBounds(275, 186, 175, 26);
		getContentPane().add(passwordField);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setBackground(Color.BLUE);
		btnRegistrarse.setBounds(10, 323, 150, 62);
		getContentPane().add(btnRegistrarse);

		JButton btnBorraruser = new JButton("Eliminar usuario");
		btnBorraruser.setForeground(Color.WHITE);
		btnBorraruser.setBackground(Color.BLUE);
		btnBorraruser.setBounds(381, 323, 150, 62);
		getContentPane().add(btnBorraruser);

		JLabel lbllogo = new JLabel("logo");
		lbllogo.setIcon(new ImageIcon("images\\icono 2.png"));
		lbllogo.setBounds(197, 0, 304, 129);
		getContentPane().add(lbllogo);

		JLabel lblFondo = new JLabel("Fondo");
		lblFondo.setIcon(new ImageIcon("images\\fondo poligonos.jpg"));
		lblFondo.setBounds(-35, -52, 1007, 530);
		getContentPane().add(lblFondo);

		// Acciones

		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al controlador
				String user = usertexto.getText();
				String password = passwordField.getText();
				try {
					new controlador.login().insertusuario(user, password);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Llamar al controlador
				String user = usertexto.getText();
				String password = passwordField.getText();
				new controlador.login().checkusuario(user, password);
				dispose();

			}
		});

		btnBorraruser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = usertexto.getText();
				String password = passwordField.getText();
				try {
					new controlador.login().deleteusuario(user);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
