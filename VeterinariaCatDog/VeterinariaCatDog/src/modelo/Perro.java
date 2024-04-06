package modelo;

public class Perro extends Mascota {

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, String raza, int edad, String dueno, int telefonoDueno, int valorTratamiento,
			int diasHospitalizados) {
		super(nombre, raza, edad, dueno, telefonoDueno, valorTratamiento, diasHospitalizados);
		calcularCosto();
	}

	@Override
	public int calcularCosto() {
		int calcularDiasHospitalizados = diasHospitalizados * 7500;
		valorTotal = valorTratamiento + calcularDiasHospitalizados;
		return valorTotal;
	}

}
