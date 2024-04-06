package modelo;

public class Mascota {

	private String nombre;
	private String raza;
	private int edad;
	private String dueno;
	private int telefonoDueno;
	protected int valorTratamiento;
	protected int diasHospitalizados;
	protected int valorTotal;

	public Mascota() {
		// TODO Auto-generated constructor stub
	}

	public Mascota(String nombre, String raza, int edad, String dueno, int telefonoDueno, int valorTratamiento,
			int diasHospitalizados) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.dueno = dueno;
		this.telefonoDueno = telefonoDueno;
		this.valorTratamiento = valorTratamiento;
		this.diasHospitalizados = diasHospitalizados;
		calcularCosto();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public int getTelefonoDueno() {
		return telefonoDueno;
	}

	public void setTelefonoDueno(int telefonoDueno) {
		this.telefonoDueno = telefonoDueno;
	}

	public int getValorTratamiento() {
		return valorTratamiento;
	}

	public void setValorTratamiento(int valorTratamiento) {
		this.valorTratamiento = valorTratamiento;
	}

	public int getDiasHospitalizados() {
		return diasHospitalizados;
	}

	public void setDiasHospitalizados(int diasHospitalizados) {
		this.diasHospitalizados = diasHospitalizados;
	}

	
	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int calcularCosto() {
		int calcularDiasHospitalizados = diasHospitalizados * 7500;
		valorTotal = valorTratamiento + calcularDiasHospitalizados;
		return  valorTotal;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", dueno=" + dueno
				+ ", telefonoDueno=" + telefonoDueno + ", valorTratamiento=" + valorTratamiento
				+ ", diasHospitalizados=" + diasHospitalizados  + "]";
	}

}
