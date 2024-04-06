package vista;

import java.util.Scanner;

public class Ventana {

	public static Scanner sc = new Scanner(System.in);

	public void mostrarTitulo() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("   %20s %20s %20s %20s %20s %25s %25s %25s %n", "tipo mascota", "nombre", "raza", "edad",
				"dueño", "telefono dueño", "valor del tratamiento", "dias hospitalizados");

	}

	public static void imprimirTabla(String tipoMascota, String nombre, String raza, int edad, String dueno,
			int telefonoDueno, int valorTramiento, int diasHospitalizados) {

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format(" %20s %20s %20s %20d %20s %25d %25d %25d %n", tipoMascota, nombre, raza, edad, dueno,
				telefonoDueno, valorTramiento, diasHospitalizados);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
	}
	
	public  static void mostrarTitulo2() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("%20s   %20s %20s %20s %20s %20s %25s %25s %25s %n","numero compartimiento", "tipo mascota", "nombre", "raza", "edad",
				"dueño", "telefono dueño", "valor del tratamiento", "dias hospitalizados");

	}
	
	
	public static void imprimirTablaDisponible(int numeroCompartimiento) {

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("%20d %20s %20s %20s %20s %20s %25s %25s %25s %n", numeroCompartimiento,"Disponible", "Disponible","Disponible", "Disponible", "Disponible",
				"Disponible", "Disponible", "Disponible");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
	}
	
	public static void imprimirTablaDisponibleOcupado(int numeroCompartimiento, String tipoMascota, String nombre, String raza, int edad, String dueno,
			int telefonoDueno, int valorTramiento, int diasHospitalizados) {

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("%20d %20s %20s %20s %20d %20s %25d %25d %25d %n", numeroCompartimiento, tipoMascota, nombre, raza, edad, dueno,
				telefonoDueno, valorTramiento, diasHospitalizados);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
	}
	
	public static void tituloMascotaDeAlta() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("   %20s %20s %20s %20s %20s %25s %25s %25s %n", "tipo mascota", "nombre", "raza", "edad",
				"dueño",  "valor del tratamiento", "dias hospitalizados", "Costo Total");

	}
	
	public static void imprimirTablaDeAlta(String tipoMascota, String nombre, String raza, int edad, String dueno,
			 int valorTramiento, int diasHospitalizados, int valorTotal) {

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format(" %20s %20s %20s %20d %20s %25d %25d %25d %n", tipoMascota, nombre, raza, edad, dueno,
				 valorTramiento, diasHospitalizados,  valorTotal);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
	}
	
	
	public static int pedirOpcion() {

		int opcion = sc.nextInt();
		return opcion;
	}

	public static void opciones() {
		System.out.println("Bienvenido a la veterinaria CatDog");
		System.out.println("Seleccione una opción:");
		System.out.println("1 - Agregar Mascota");
		System.out.println("2 - Mostrar Mascotas hospitalizadas");
		System.out.println("3 - Ocupación Actual Y Espacios Disponibles");
		System.out.println("4 - dar de alta Mascota");
		System.out.println("5 - cantidad de mascotas");
		System.out.println("0 - Fin de la consulta");
	}

	public static void opcionesMascota() {
		System.out.println("Seleccione la mascota que quiere agregar:");
		System.out.println("1 - Perro");
		System.out.println("2 - Gato");
		System.out.println("3 - Hamster");
		System.out.println("0 - no ingresar mas");
	}

	public static String pedirNombre() {
		System.out.println("ingrese nombre: ");
		String nombre = sc.next();
		return nombre;
	}

	public static String pedirRaza() {
		System.out.println("ingrese raza: ");
		String raza = sc.next();
		return raza;
	}

	public static int pedirEdad() {
		System.out.println("ingrese edad: ");
		int edad = sc.nextInt();
		return edad;
	}

	public static String pedirDueno() {
		System.out.println("ingrese dueno: ");
		String dueno = sc.next();
		return dueno;
	}

	public static int pedirTelefonoDueno() {
		System.out.println("ingrese telefono del dueño: ");
		int tlDueno = sc.nextInt();
		return tlDueno;
	}

	public static int pedirValorTramiento() {
		System.out.println("ingrese valor del tratamiento: ");
		int valorTramiento = sc.nextInt();
		return valorTramiento;
	}

	public static int pedirDiasHospitalizados() {
		System.out.println("ingrese la cantidad de dias hospitalizados: ");
		int diasHospitalizados = sc.nextInt();
		return diasHospitalizados;
	}

	public static int pedirCompartimiento() {
		System.out.println("ingrese el compartimiento ");
		int compartimiento = sc.nextInt();
		return compartimiento;
	}

	public static void imprimirMascotaAgregada(String mascotaAgregada) {
	System.out.println(mascotaAgregada);
	}
	
	public static void imprimirCantidadMascotas(int cantPerros,int cantGatos,int cantHamsters) {
		System.out.println("cantidad de perros: "+ cantPerros);
		System.out.println("cantidad de gatos: "+ cantGatos);
		System.out.println("cantidad de hamsters: "+ cantHamsters);
		
	}
}
