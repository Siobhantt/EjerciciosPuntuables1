package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable8 {
	/*Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que hay que cobrar en la taquilla
	 por la compra de una serie de entradas (cuyo número será introducido por el usuario). 
	Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€.
	 En el caso de que el importe total sea igual o superior a 100€, se aplicará automáticamente un bono descuento del 5%.

*/
	public static void main(String[] args) {
		//declaramos las variables
		int infantil, adultos;
		final double PRECIOINF, PRECIOADULT;
		double totalEntradas;
		double descuento;
		
		//declaramos el scanner
		Scanner lee = new Scanner(System.in);
		
		//leemos la cantidad de entradas que introducira el usuario
		System.out.println("Por favor introduzca las entradas infantiles: ");
		infantil = lee.nextInt();
		
		System.out.println("Por favor introduzca las entradas de Adultos: ");
		adultos = lee.nextInt();
		
		//introducimos el precio de las entradas en sus constantes correspondientes
		
		PRECIOINF = 15.15;
		PRECIOADULT = 20;
		
		//Procedemos a multiplicar los precios por la cantidad
		
		totalEntradas = (infantil*PRECIOINF) + adultos*PRECIOADULT;
		
		//Variable del descuento
		
		descuento = totalEntradas - (totalEntradas * 0.05);
		
		//Establecemos el operardor ternario para el descuento
		
		
		totalEntradas = 100>=totalEntradas ? descuento : totalEntradas;
		
		
		//Imprimimos en pantalla el total
		
		System.out.println("El total de sus entradas es: " + totalEntradas);
		
		//cerramos el scanner
		
		lee.close();
		
		
		// TODO Auto-generated method stub

	}

}
