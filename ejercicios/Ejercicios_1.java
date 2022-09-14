package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

import utils.EjercicioCinco;

public class Ejercicios_1 {
	public static void main(String[] args) {
		
		/*
		 * 1.- Decalara e inicializa dos variables. Uno de tipo cadena de texto para un
		 * nombre y otra de tipo entero para una edad. Crea una salida por consola con
		 * el texto "Los datos del empleado son " concatenado con el valor de dichas
		 * variables
		 */
			String nombre = "Nombre";
			int edad = 0;
			
			System.out.println("Los datos del empleado son " + nombre + ", " + edad);

		/*
		 * 2.- Crea una etructura condicional que evalúe si una edad introducida por
		 * consola es mayor o igual a 18, si es así, imprimir por la consola:
		 * "Eres  mayor de edad" caso contrario imprimir "eres menor de edad".
		 */
			Scanner escaner = new Scanner(System.in);
			
			System.out.println("Introduce tu edad: ");
			int esMayorDeEdad = escaner.nextInt();
			
			if(esMayorDeEdad >= 18) {
				System.out.println("Eres mayor de edad");
			} else {
				System.out.println("Eres menor de edad");
			}

		/*
		 * 3.- Crea un programa en java que pida dos datos por la consola al usuario:
		 * nombre e email. Imprime el valor de estas variables por consola.
		 */
			String nombreUsuario, emailUsuario;
			
			System.out.println("Introduce tu nombre: ");
			nombreUsuario = escaner.next();
			
			System.out.println("Introduce tu email: ");
			emailUsuario = escaner.next();
			
			System.out.println("Nombre: " + nombreUsuario + ", email: " + emailUsuario);

		/*
		 * 4.- Crea un programa en java que pida introducir un número por consola. El
		 * programa pedirá siempre un número mientras que éste no sea el 5 y cuando así
		 * sea imprimir "Fin del programa" terminando asi dicho programa
		 */
			
			int numeroQueNoEsCinco = 0;
			while (numeroQueNoEsCinco != 5) {
				System.out.println("Introduce un numero: ");
				numeroQueNoEsCinco = escaner.nextInt();
				
				if(numeroQueNoEsCinco == 5) {
					System.out.println("Fin del programa");
				}
			}

		/*
		 * 5.- Crea un programa que pida un número por consola entre el 1 y el 50. Si el
		 * número está fuera de este rango imprimir "El número no es válido" y seguir
		 * pidiendo números hasta que el número esté en ese rango. Si el número es
		 * válido crea la lógica para verificar si dicho número es par o impar. Si es
		 * par imprimir por consola "Número par" y, si es impar, "Número impar". La
		 * lógica para averiguar si el número es par o impar debe de estar fuera del
		 * archivo que contiene el método main en una carpeta llamada "utils" y en una
		 * clase llamada EjercicioCinco Además esta lógica debe estar ejecutada a través
		 * de un método.
		 */
			int numeroBucle = 1;	
			
			while (numeroBucle > 0 && numeroBucle < 50) {
				System.out.println("Introduce un numero entre el 1 y el 50: ");
				numeroBucle = escaner.nextInt();
				
				if (numeroBucle > 0 && numeroBucle < 50) {
					if(EjercicioCinco.esPar(numeroBucle)) {
						System.out.println("Numero par");
					}else {
						System.out.println("es impar");
					}
				} else {
					System.out.println("El numero no es valido");
				}
				
				
			}

			
		/*
		 * 6.- Crea un array de 5 elementos cuyos valores sean nombres de personas.
		 * Imprime los elementos del array a través de un bucle for
		 */
			String[] nombres = {"nombre1", "nombre2", "nombre3","nombre4","nombre5"};
			
			for (int i = 0; i < nombres.length; i++) {
				System.out.println(nombres[i]);
			}
			

		/*
		 * 7.- Repite el ejercicio anterior pero realiza la iteración e impresión de los
		 * elementos del array a través de un bucle for mejorado.
		 */
			
			for (String nombrePersona : nombres) {
				System.out.println(nombrePersona);
			}
			
			escaner.close();
		
	}
	

}
