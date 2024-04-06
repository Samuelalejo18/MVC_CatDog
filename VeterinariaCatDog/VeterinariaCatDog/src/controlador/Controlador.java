package controlador;

import modelo.Gato;
import modelo.Hamster;
import modelo.Mascota;
import modelo.Perro;
import modelo.Veterinaria;
import vista.Ventana;

public class Controlador {
	Veterinaria veterinaria = new Veterinaria(new Mascota[15]);
	Mascota[] mascotas = veterinaria.getMascotas();
	Ventana objVentana = new Ventana();

	public Controlador() {
	}

	public void funcionar() {
		registrarMascotas();
		int opcion = -1;

		while (opcion != 0) {

			objVentana.opciones();
			opcion = objVentana.pedirOpcion();
			switch (opcion) {
			case 1: {
				opcionesMascotas();
				break;
			}
			case 2:
				objVentana.mostrarTitulo();
				for (int mascota= 0; mascota < mascotas.length; mascota++) {
					if(mascotas[mascota].getDiasHospitalizados()>1) {
						String tipoMascota = hallarTipoMascota(mascotas[mascota]);
						objVentana.imprimirTabla(tipoMascota,mascotas[mascota].getNombre(),mascotas[mascota].getRaza(),mascotas[mascota].getEdad(),
								mascotas[mascota].getDueno(), mascotas[mascota].getTelefonoDueno(), mascotas[mascota].getValorTratamiento(),
								mascotas[mascota].getDiasHospitalizados());
					}
				
				}
				
				

				break;
			case 3: 
			
				objVentana.mostrarTitulo2();
				int contadorContendor1=0;
				for (int mascota= 0; mascota < mascotas.length; mascota++) {
					if( mascotas[mascota].getNombre()==null) {
						
						objVentana.imprimirTablaDisponible(++contadorContendor1);
						
					}else {
						String tipoMascota = hallarTipoMascota(mascotas[mascota]);
						objVentana.imprimirTablaDisponibleOcupado(++contadorContendor1,tipoMascota,mascotas[mascota].getNombre(),mascotas[mascota].getRaza(),mascotas[mascota].getEdad(),
								mascotas[mascota].getDueno(), mascotas[mascota].getTelefonoDueno(), mascotas[mascota].getValorTratamiento(),
								mascotas[mascota].getDiasHospitalizados());
					}
				}
				
				break;
			case 4: 
				Mascota mascotaDeAlta= veterinaria.altaMascota(objVentana.pedirNombre());
				objVentana.tituloMascotaDeAlta();
				String tipoMascota = hallarTipoMascota(mascotaDeAlta);
				objVentana.imprimirTablaDeAlta(tipoMascota, mascotaDeAlta.getNombre(), mascotaDeAlta.getRaza(), mascotaDeAlta.getEdad(), mascotaDeAlta.getDueno(),mascotaDeAlta.getValorTratamiento(),mascotaDeAlta.getDiasHospitalizados(),mascotaDeAlta.getValorTotal() );
			break;
			case 5:
				objVentana.imprimirCantidadMascotas(veterinaria.cantidadPerro(),veterinaria.cantidadGato(), veterinaria.cantidadHamster());
			
			default:

			}
		}

	}

	public void opcionesMascotas() {
		int opcion = -1;

		while (opcion != 0) {

			objVentana.opcionesMascota();
			opcion = objVentana.pedirOpcion();
			switch (opcion) {
			case 1: {
				Perro perro = new Perro(objVentana.pedirNombre(), objVentana.pedirRaza(), objVentana.pedirEdad(),
						objVentana.pedirDueno(), objVentana.pedirTelefonoDueno(), objVentana.pedirValorTramiento(),
						objVentana.pedirDiasHospitalizados());
				int compartimiento = objVentana.pedirCompartimiento();
				objVentana.imprimirMascotaAgregada(veterinaria.agregarMascota(compartimiento, perro));
				;
				break;
			}
			case 2: {
				Gato gato = new Gato(objVentana.pedirNombre(), objVentana.pedirRaza(), objVentana.pedirEdad(),
						objVentana.pedirDueno(), objVentana.pedirTelefonoDueno(), objVentana.pedirValorTramiento(),
						objVentana.pedirDiasHospitalizados());
				int compartimiento = objVentana.pedirCompartimiento();
				objVentana.imprimirMascotaAgregada(veterinaria.agregarMascota(compartimiento, gato));
				;
				break;
			}
			case 3: {
				Hamster hamster = new Hamster(objVentana.pedirNombre(), objVentana.pedirRaza(), objVentana.pedirEdad(),
						objVentana.pedirDueno(), objVentana.pedirTelefonoDueno(), objVentana.pedirValorTramiento(),
						objVentana.pedirDiasHospitalizados());
				int compartimiento = objVentana.pedirCompartimiento();
				objVentana.imprimirMascotaAgregada(veterinaria.agregarMascota(compartimiento, hamster));
				;
				break;
			}
			case 0: {
				break;
			}

			}
		}

	}

	public String hallarTipoMascota(Mascota mascota) {
		String tipoMascota = "no existe";
		if (mascota instanceof Perro) {
			tipoMascota = "Perro";
		} else if (mascota instanceof Gato) {
			tipoMascota = "Gato";

		} else if (mascota instanceof Hamster) {
			tipoMascota = "Hamster";
		}
		return tipoMascota;
	}

	public void registrarMascotas() {

		mascotas[0] = new Perro("Jake", "Labrador", 4, "Alejandro ", 123456789, 100000, 4);
		mascotas[6] = new Gato("Lukas", "criollo", 12, "Leider", 78913, 40000, 10);
		mascotas[12] = new Hamster("dienton", "criollo", 4, "Pedro", 45645687, 30000, 6);
		mascotas[14] = new Perro("Walter", "Labrador criollo", 1, "Tomas ", 1289, 150000, 10);
		mascotas[8] = new Gato("Cloe", "Persa", 4, "Laura", 789553, 250000, 7);
	}

}
