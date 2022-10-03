package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable7 {
/*Solicita al usuario tres distancias:
La primera, medida en milímetros.
La segunda, medida en centímetros.
La última, medida en metros.
Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
*/
	public static void main(String[] args) {
		
		//Declaramos las variables
		
		int milimetros, centimetros, metros;
		double totalLongitud;
		
		//Iniciamos el Scanner
		
		Scanner lee = new Scanner(System.in);
		
		//solicitamos al usuario las variables
		
		System.out.println("Introduzca los milimetros: ");
		milimetros = lee.nextInt();
		
		System.out.println("Introduzca los centimetros: ");
		centimetros = lee.nextInt();
		
		System.out.println("Introduzca los metros: ");
		metros = lee.nextInt();
		
		/*hacemos la operacion donde mltiplicamos los metros por 100 que son los centimetros
		mas los milimetros entre 10 más los centimetros.*/
		
		
		totalLongitud = (metros*100) + milimetros/10 + centimetros;
		
		System.out.println("La suma de las longitudes en centimetros es: " + totalLongitud);
		
		//cerramos el scanner
		
		lee.close();
		
		
		// TODO Auto-generated method stub

	}

}
