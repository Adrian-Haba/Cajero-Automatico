package vistas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Ulti_movimientos extends JFrame {
	private JTable table;

	/**
	 * Lanzar la aplicación.
	 */

	public void run() {
		try {
			Ulti_movimientos window = new Ulti_movimientos();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear la aplicación.
	 */
	public Ulti_movimientos() {
		initialize();
	}

	/**
	 * Inicializar los contenidos del JFrame.
	 */
	private void initialize() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icono 4 - copia.jpg"));
		setTitle("Banco Popular/\u00DAltimos movimientos");
		getContentPane().setBackground(SystemColor.activeCaption);
		setBounds(100, 100, 655, 429);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(239, 285, 221, 62);
		btnAtras.setForeground(new Color(255, 255, 255));
		btnAtras.setBackground(new Color(0, 0, 255));

		JLabel lblUlti_movs = new JLabel("Ultimos movimientos");
		lblUlti_movs.setBounds(239, 11, 230, 106);
		lblUlti_movs.setForeground(Color.BLUE);
		lblUlti_movs.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblUlti_movs.setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		getContentPane().add(lblUlti_movs);
		getContentPane().add(btnAtras);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 115, 619, 146);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { 1, 1, 2019 + "-" + 9 + "-" + 01, "Pago mensual", -12.95, 445.10 },
						{ 1, 2, 2019 + "-" + 9 + "-" + 04, "Sueldo mes", 120.38, 565.48 },
						{ 1, 3, 2019 + "-" + 9 + "-" + 10, "Bar La Esquinita", -5.99, 559.49 },
						{ 1, 4, 2019 + "-" + 9 + "-" + 11, "Gasto Mercadona", -25.30, 534.19 }, },
				new String[] { "id_cuenta", "id_movimiento", "fecha", "concepto", "importe", "saldo" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(91);
		scrollPane.setViewportView(table);

		JLabel lblfondo = new JLabel("");
		lblfondo.setBounds(0, 0, 639, 390);
		lblfondo.setIcon(new ImageIcon("images\\fondo poligonos.jpg"));
		getContentPane().add(lblfondo);

		// ACCIONES

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new vistas.perfil_cuenta().setVisible(true);
			}
		});
	}
}