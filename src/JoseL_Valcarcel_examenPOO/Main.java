package JoseL_Valcarcel_examenPOO;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\n > Bievenido a Calculadora <");

		MenuPrincipal();

	}

	static void MenuPrincipal() {

		double Numero1 = 0, Numero2 = 0;
		double Introducir1, Introducir2, Condicion = 1;

		Calculadora miCalculadora = new Calculadora(Numero1, Numero2);

		int SeleccionFuncion, SeleccionFuncion2;

		System.out.println("\n-> Seleccione una Funcion a Realizar");
		System.out.println(" \n [ 1 ] > Sumar\n [ 2 ] > Restar\n [ 3 ] > Multiplicar");
		System.out.println(" [ 4 ] > Dividir\n [ 5 ] > Obtener el Resto");
		System.out.println(" [ 6 ] > Obtener el Exponencial de un Numero");
		System.out.println(" [ 7 ] > Salir de la Calculadora \n");

		SeleccionFuncion = sc.nextInt();

		if (SeleccionFuncion == 1) {

			System.out.println("Ha sido Seleccionada la Funcion [ 1 ] - Suma\n");
			System.out.print("Introduzca el Primer Valor -> ");
			Introducir1 = sc.nextInt();
			miCalculadora.setNumero1(Introducir1);

			System.out.print("Introduzca el Segundo Valor -> ");
			Introducir2 = sc.nextInt();
			miCalculadora.setNumero2(Introducir2);

			System.out.println("\nEl resultado de la Suma es -> [ "
					+ miCalculadora.Sumar(miCalculadora.getNumero1(), miCalculadora.getNumero2()) + " ]");

			System.out.println("\nDesea Realizar otra Operacion?");
			System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

			while (Condicion == 1) {

				SeleccionFuncion2 = sc.nextInt();

				if (SeleccionFuncion2 == 1) {
					MenuPrincipal();
				}

				if (SeleccionFuncion2 == 2) {
					System.err.println("Saliendo...");
					Condicion = 0;
				}

				if (SeleccionFuncion2 <= 0 || SeleccionFuncion2 > 2) {
					System.err.println("Seleccione una Funcion Valida");

					System.out.println("\nDesea Realizar otra Operacion?");
					System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

				}

			}

		}

		if (SeleccionFuncion == 2) {

			System.out.println("Ha sido Seleccionada la Funcion [ 2 ] - Resta\n");
			System.out.print("Introduzca el Primer Valor -> ");
			Introducir1 = sc.nextInt();
			miCalculadora.setNumero1(Introducir1);

			System.out.print("Introduzca el Segundo Valor -> ");
			Introducir2 = sc.nextInt();
			miCalculadora.setNumero2(Introducir2);

			System.out.println("El resultado de la Resta es -> [ "
					+ miCalculadora.Restar(miCalculadora.getNumero1(), miCalculadora.getNumero2()) + " ]");

			System.out.println("\nDesea Realizar otra Operacion?");
			System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

			while (Condicion == 1) {

				SeleccionFuncion2 = sc.nextInt();

				if (SeleccionFuncion2 == 1) {
					MenuPrincipal();
				}

				if (SeleccionFuncion2 == 2) {
					System.err.println("Saliendo...");
					Condicion = 0;
				}

				if (SeleccionFuncion2 <= 0 || SeleccionFuncion2 > 2) {
					System.err.println("Seleccione una Funcion Valida");

					System.out.println("\nDesea Realizar otra Operacion?");
					System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

				}

			}

		}

		if (SeleccionFuncion == 3) {

			System.out.println("Ha sido Seleccionada la Funcion [ 3 ] - Multiplicar\n");
			System.out.print("Introduzca el Primer Valor -> ");
			Introducir1 = sc.nextInt();
			miCalculadora.setNumero1(Introducir1);

			System.out.print("Introduzca el Segundo Valor -> ");
			Introducir2 = sc.nextInt();
			miCalculadora.setNumero2(Introducir2);

			System.out.println("El resultado de la Multiplicacion es -> [ "
					+ miCalculadora.Multiplicar(miCalculadora.getNumero1(), miCalculadora.getNumero2()) + " ]");

			System.out.println("\nDesea Realizar otra Operacion?");
			System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

			while (Condicion == 1) {

				SeleccionFuncion2 = sc.nextInt();

				if (SeleccionFuncion2 == 1) {
					MenuPrincipal();
				}

				if (SeleccionFuncion2 == 2) {
					System.err.println("Saliendo...");
					Condicion = 0;
				}

				if (SeleccionFuncion2 <= 0 || SeleccionFuncion2 > 2) {
					System.err.println("Seleccione una Funcion Valida");

					System.out.println("\nDesea Realizar otra Operacion?");
					System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

				}

			}
		}

		if (SeleccionFuncion == 4) {

			System.out.println("Ha sido Seleccionada la Funcion [ 4 ] - Division\n");
			System.out.print("Introduzca el Primer Valor -> ");
			Introducir1 = sc.nextInt();
			miCalculadora.setNumero1(Introducir1);

			System.out.print("Introduzca el Segundo Valor -> ");
			Introducir2 = sc.nextInt();
			miCalculadora.setNumero2(Introducir2);

			System.out.println("El resultado de la Division es -> [ "
					+ miCalculadora.Dividir(miCalculadora.getNumero1(), miCalculadora.getNumero2()) + " ]");

			System.out.println("\nDesea Realizar otra Operacion?");
			System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

			while (Condicion == 1) {

				SeleccionFuncion2 = sc.nextInt();

				if (SeleccionFuncion2 == 1) {
					MenuPrincipal();
				}

				if (SeleccionFuncion2 == 2) {
					System.err.println("Saliendo...");
					Condicion = 0;
				}

				if (SeleccionFuncion2 <= 0 || SeleccionFuncion2 > 2) {
					System.err.println("Seleccione una Funcion Valida");

					System.out.println("\nDesea Realizar otra Operacion?");
					System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

				}

			}
		}

		if (SeleccionFuncion == 5) {

			System.out.println("Ha sido Seleccionada la Funcion [ 5 ] - Obtener el Resto\n");
			System.out.print("Introduzca el Primer Valor -> ");
			Introducir1 = sc.nextInt();
			miCalculadora.setNumero1(Introducir1);

			System.out.print("Introduzca el Segundo Valor -> ");
			Introducir2 = sc.nextInt();
			miCalculadora.setNumero2(Introducir2);

			System.out.println("El Resto de Ambos numeroes es -> [ "
					+ miCalculadora.Resto(miCalculadora.getNumero1(), miCalculadora.getNumero2()) + " ]");

			System.out.println("\nDesea Realizar otra Operacion?");
			System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

			while (Condicion == 1) {

				SeleccionFuncion2 = sc.nextInt();

				if (SeleccionFuncion2 == 1) {
					MenuPrincipal();
				}

				if (SeleccionFuncion2 == 2) {
					System.err.println("Saliendo...");
					Condicion = 0;
				}

				if (SeleccionFuncion2 <= 0 || SeleccionFuncion2 > 2) {
					System.err.println("Seleccione una Funcion Valida");

					System.out.println("\nDesea Realizar otra Operacion?");
					System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

				}

			}
		}

		if (SeleccionFuncion == 6) {

			System.out.println("Ha sido Seleccionada la Funcion [ 6 ] - Obtener el Exponencial\n");
			System.out.print("Introduzca el Primer Valor -> ");
			Introducir1 = sc.nextInt();
			miCalculadora.setNumero1(Introducir1);

			System.out.print("Introduzca el Segundo Valor -> ");
			Introducir2 = sc.nextInt();
			miCalculadora.setNumero2(Introducir2);

			System.out.println("El Resto de Ambos numeroes es -> [ "
					+ miCalculadora.Exponencial(miCalculadora.getNumero1(), miCalculadora.getNumero2()) + " ]");

			System.out.println("\nDesea Realizar otra Operacion?");
			System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

			while (Condicion == 1) {

				SeleccionFuncion2 = sc.nextInt();

				if (SeleccionFuncion2 == 1) {
					MenuPrincipal();
				}

				if (SeleccionFuncion2 == 2) {
					System.err.println("Saliendo...");
					Condicion = 0;
				}

				if (SeleccionFuncion2 <= 0 || SeleccionFuncion2 > 2) {
					System.err.println("Seleccione una Funcion Valida");

					System.out.println("\nDesea Realizar otra Operacion?");
					System.out.println("\n[ 1 ] -> Si\n[ 2 ] -> No ");

				}

			}
		}

		if (SeleccionFuncion == 7) {
			System.err.println("\nSaliendo...");
		}

		if (SeleccionFuncion <= 0 || SeleccionFuncion > 7) {
			System.err.println("\nSeleccione una funcion Valida por favor");
			MenuPrincipal();
		}

		//https://github.com/JoseLVP/Examen_POO.git
		//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
		
	}

}
