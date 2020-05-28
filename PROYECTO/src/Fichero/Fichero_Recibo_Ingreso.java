package Fichero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fichero_Recibo_Ingreso {

	public Fichero_Recibo_Ingreso(double ingresodinero) throws IOException {
		// Creamos el objeto que hará mostrar cuando se hizo el recibo, con fecha y hora
		java.util.Date fecha = new Date();
		// Generaremos un archivo txt que indique el dinero que hemos ingresado
		FileWriter fichero = new FileWriter("Fichero/Recibo.txt");
		try {
			// Crear el objeto que va a esribir el fichero
			for (int i = 0; i < 1; i += 1) {
				fichero.write("Se ha ingresado " + ingresodinero + " € en su cuenta el " + fecha);
			}
			fichero.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			String url = "C:\\\\Users\\\\adria\\\\eclipse-workspace\\\\PROYECTO\\Fichero\\Recibo.txt";
			ProcessBuilder p = new ProcessBuilder();
			p.command("cmd.exe", "/c", url);
			p.start();
		} catch (IOException e) {
			Logger.getLogger(Fichero_Recibo_Ingreso.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}
