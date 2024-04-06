package modelo;

import java.util.Arrays;

public class Veterinaria {
	Mascota mascotas[] = new Mascota[15];

	public Veterinaria() {

	}

	public Veterinaria(Mascota[] mascotas) {
		this.mascotas = mascotas;
		for (int i = 0; i < mascotas.length; i++) {
			this.mascotas[i] = new Mascota();
		}
	}

	public Mascota[] getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota[] mascotas) {
		this.mascotas = mascotas;
	}



	public String agregarMascota(int indice, Mascota mascota) {
	    String mascotaAgregada = "";
	    if (indice < 0  || indice >=  mascotas.length) {
	    	mascotaAgregada = "compartimiento fuera del rango";
	    	
	    } 
	    
	    if (mascotas[indice] != null) { 
       	 mascotaAgregada = "compartimiento ocupado";
       } else {
       	mascotas[indice] = mascota;
           mascotaAgregada = mascota.getNombre() + " agregada en el compartimiento " + indice;
       }
	    return mascotaAgregada;
	}
	public Mascota altaMascota(String nombre) {
		 Mascota mascotaDeAlta = null;
		 
	
		    for (Mascota mascota : mascotas) {
		        String nombreMascota = mascota.getNombre();
		        if (nombreMascota != null && nombreMascota.equals(nombre)) {
		            mascotaDeAlta = mascota;
		            break;
		        }
		    }
		    
		    return mascotaDeAlta;
	}

	public int cantidadPerro() {
		int contadorPerros = 0;
		for (Mascota mascota : mascotas) {
			if (mascota instanceof Perro) {
				contadorPerros++;
			}
		}
		return contadorPerros;

	}

	public int cantidadGato() {
		int contadorGato = 0;
		for (Mascota mascota : mascotas) {
			if (mascota instanceof Gato) {
				contadorGato++;
			}
		}
		return contadorGato++;

	}



	public int cantidadHamster() {

		int contadorHamster = 0;
		for (Mascota mascota : mascotas) {
			if (mascota instanceof Hamster) {
				contadorHamster++;
			}
		}
		return contadorHamster;

	}

	@Override
	public String toString() {
		return "Veterinaria [mascotas=" + Arrays.toString(mascotas) + "]";
	}

}
