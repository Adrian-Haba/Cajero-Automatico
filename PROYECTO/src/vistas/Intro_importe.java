package vistas;

//import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Intro_importe extends JFrame {

	/**
	 * Lanzar la aplicación.
	 */

	public void run() {
		try {
			Intro_importe window = new Intro_importe();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear la aplicación.
	 */
	public Intro_importe() {
		setTitle("Banco Popular/introducir\n");
		initialize();
	}

	/**
	 * Inicializar los contenidos del JFrame.
	 */
	private void initialize() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icono 4 - copia.jpg"));
		getContentPane().setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 681, 429);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setBackground(new Color(0, 0, 255));
		btnAceptar.setBounds(119, 294, 194, 62);
		getContentPane().add(btnAceptar);

		JButton btnAtras = new JButton("Atras");
		btnAtras.setForeground(new Color(255, 255, 255));
		btnAtras.setBackground(new Color(0, 0, 255));
		btnAtras.setBounds(419, 294, 221, 62);
		getContentPane().add(btnAtras);

		JTextPane txtimporte = new JTextPane();
		txtimporte.setContentType("");
		txtimporte.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txtimporte.setBounds(316, 143, 90, 82);
		getContentPane().add(txtimporte);

		JLabel lblIntro_importe = new JLabel("Introducir importe");
		lblIntro_importe.setForeground(Color.BLUE);
		lblIntro_importe.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblIntro_importe.setBackground(Color.WHITE);
		lblIntro_importe.setBounds(253, 26, 230, 106);
		getContentPane().add(lblIntro_importe);

		JLabel lblfondo = new JLabel("");
		lblfondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblfondo.setIcon(new ImageIcon("images\\fondo poligonos.jpg"));
		lblfondo.setBounds(0, 0, 681, 390);
		getContentPane().add(lblfondo);

		// Acciones

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new vistas.perfil_cuenta().setVisible(true);
			}
		});

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreso = txtimporte.getText();
				double ingresodinero = Double.parseDouble(ingreso);
				try {
					new controlador.accounts().ingresardinero(ingresodinero);
					new Fichero.Fichero_Recibo_Ingreso(ingresodinero);
				} catch (SQLException | IOException e1) {
					e1.printStackTrace();
				}
				dispose();
				new vistas.perfil_cuenta().setVisible(true);
			}
		});
	}
}
