package beans;

public class movimientos {

	// ATRIBUTOS

	int id_cuenta;
	int id_movimiento;
	String fecha;
	String concepto;
	double importe;
	double saldo;

	// METODOS

	public movimientos() {
	}

	public movimientos(int id_cuenta, int id_movimiento, String fecha, String concepto, double importe, double saldo) {
		this.id_cuenta = id_cuenta;
		this.id_movimiento = id_movimiento;
		this.fecha = fecha;
		this.concepto = concepto;
		this.importe = importe;
		this.saldo = saldo;
	}

	public int getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public int getId_movimiento() {
		return id_movimiento;
	}

	public void setId_movimiento(int id_movimiento) {
		this.id_movimiento = id_movimiento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
