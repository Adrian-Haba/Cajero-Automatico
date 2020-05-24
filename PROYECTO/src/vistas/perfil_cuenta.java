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
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class perfil_cuenta extends JFrame {

	/**
	 * Lanzar la aplicación.
	 */
	public void run() {
		try {
			perfil_cuenta window = new perfil_cuenta();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear la aplicación.
	 */
	public perfil_cuenta() {
		initialize();
	}

	/**
	 * Inicializar los contenidos del JFrame.
	 */
	private void initialize() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icono 4 - copia.jpg"));
		setTitle("Banco Popular/perfil de cuenta");
		getContentPane().setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 705, 398);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnSalircuenta = new JButton("Salir de esta cuenta");
		btnSalircuenta.setBackground(new Color(0, 0, 255));
		btnSalircuenta.setForeground(new Color(255, 255, 255));
		btnSalircuenta.setBounds(480, 232, 176, 62);
		getContentPane().add(btnSalircuenta);

		JLabel lblNewLabel = new JLabel("Perfil de la cuenta");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(281, 11, 230, 106);
		getContentPane().add(lblNewLabel);

		JButton btnIntroducir = new JButton("Introducir");
		btnIntroducir.setForeground(new Color(255, 255, 255));
		btnIntroducir.setBackground(new Color(0, 0, 255));
		btnIntroducir.setBounds(87, 148, 166, 62);
		getContentPane().add(btnIntroducir);

		JButton btnRetirar = new JButton("Retirar");
		btnRetirar.setBackground(new Color(0, 0, 255));
		btnRetirar.setForeground(new Color(255, 255, 255));
		btnRetirar.setBounds(87, 232, 166, 62);
		getContentPane().add(btnRetirar);

		JButton btnUltimosmovimientos = new JButton("Ultimos movimientos");
		btnUltimosmovimientos.setBackground(new Color(0, 0, 255));
		btnUltimosmovimientos.setForeground(new Color(255, 255, 255));
		btnUltimosmovimientos.setBounds(480, 146, 176, 66);
		getContentPane().add(btnUltimosmovimientos);

		JLabel lblfondo = new JLabel("");
		lblfondo.setIcon(new ImageIcon("images\\fondo poligonos.jpg"));
		lblfondo.setBounds(0, 0, 689, 359);
		getContentPane().add(lblfondo);

		// Acciones

		btnIntroducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new vistas.Intro_importe().setVisible(true);
			}
		});

		btnRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new vistas.Reti_importe().setVisible(true);
			}
		});
		btnSalircuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new vistas.elegircuenta().setVisible(true);
			}
		});
		btnUltimosmovimientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new vistas.Ulti_movimientos().setVisible(true);
			}
		});
	}
}