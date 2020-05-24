package vistas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.List;
import java.awt.Choice;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class elegircuenta extends JFrame {

	public JPanel contentPane;

	/**
	 * Lanzar la aplicación.
	 */
	public void run() {
		try {
			elegircuenta window = new elegircuenta();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear el frame.
	 */
	public elegircuenta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icono 4 - copia.jpg"));
		setTitle("Banco Popular/cuentas");
		getContentPane().setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 726, 484);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnCerrarSesion = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesion.setForeground(new Color(255, 255, 255));
		btnCerrarSesion.setBackground(new Color(0, 0, 255));
		btnCerrarSesion.setBounds(521, 186, 166, 106);
		getContentPane().add(btnCerrarSesion);

		JLabel lblCUENTAS = new JLabel("CUENTAS");
		lblCUENTAS.setForeground(Color.BLUE);
		lblCUENTAS.setBackground(Color.WHITE);
		lblCUENTAS.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblCUENTAS.setBounds(328, 28, 230, 106);
		getContentPane().add(lblCUENTAS);

		JButton btnAgregarCuenta = new JButton("Agregar cuenta");
		btnAgregarCuenta.setForeground(new Color(255, 255, 255));
		btnAgregarCuenta.setBackground(new Color(0, 0, 255));
		btnAgregarCuenta.setBounds(35, 160, 166, 62);
		getContentPane().add(btnAgregarCuenta);

		JButton btnEliminarCuenta = new JButton("Eliminar cuenta");
		btnEliminarCuenta.setForeground(new Color(255, 255, 255));
		btnEliminarCuenta.setBackground(new Color(0, 0, 255));
		btnEliminarCuenta.setBounds(35, 286, 166, 62);
		getContentPane().add(btnEliminarCuenta);

		JButton btncuenta1 = new JButton("E3298304743248");
		btncuenta1.setForeground(Color.WHITE);
		btncuenta1.setBackground(Color.BLUE);
		btncuenta1.setBounds(292, 160, 166, 62);
		getContentPane().add(btncuenta1);

		JLabel lblFondo = new JLabel("Fondo\r\n");
		lblFondo.setIcon(new ImageIcon("images\\fondo poligonos.jpg"));
		lblFondo.setBounds(-87, -21, 797, 497);
		getContentPane().add(lblFondo);

		// Acciones

		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Salir de la aplicacion
				dispose();
				// Ir a la ventana login
				new vistas.credenciales().setVisible(true);

			}
		});

		btnAgregarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ir a la ventana de agregar cuenta
				dispose();
				new vistas.AgregarCuenta().setVisible(true);
			}
		});

		btnEliminarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ir a la ventana de eliminar cuenta
				dispose();
				new vistas.EliminarCuenta().setVisible(true);
			}
		});

		btncuenta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new vistas.perfil_cuenta().setVisible(true);
			}
		});
	}
}
