package beans;

public class cuentas {
	
	//ATRIBUTOS

	int id_usuario;
	String nombrecuenta;
	double saldo;
	int id_cuenta;
	
	// METODOS
	
	public cuentas() {}
	public cuentas(int id_usuario, String nombrecuenta, double saldo, int id_cuenta) {
		this.id_usuario = id_usuario;
		this.nombrecuenta = nombrecuenta;
		this.saldo = saldo;
		this.id_cuenta = id_cuenta;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getnombrecuenta() {
		return nombrecuenta;
	}

	public void setnombrecuenta(String nombrecuenta) {
		this.nombrecuenta = nombrecuenta;
	}

	public double getsaldo() {
		return saldo;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}
	
	
}
