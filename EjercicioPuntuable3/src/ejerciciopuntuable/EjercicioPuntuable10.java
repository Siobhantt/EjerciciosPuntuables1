package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable10 {
/*La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante escribe un algoritmo en un papel y lo lanza,
 *  ganando quien consiga lanzarlo más lejos.
 *   La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee),
 *    pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales).
 *     Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm.
Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera correspondiente en centímetros.
 Utiliza la conversión de tipos.
*/
	public static void main(String[] args) {
		//Declaracion de variables
		
		double longitudMts;
		int longitudCm;
		
		//Declaramos el scanner
		
		Scanner lee = new Scanner(System.in);
		
		//Solicitamos la longitud del lanzamiento
		System.out.println("Por favor inserte la longitud del lanzamiento en metros: ");
		longitudMts = lee.nextDouble();
		
		//Realizamos la operacion y hacemos casting en la variable longitudCm en int para que se imprima el valor sin decimales.
		longitudCm = (int) (longitudMts * 100);
		
		//imprimimos
		System.out.println("La longitud del lanzamientos en cm es: " + longitudCm);
		
		//cerramos el scanner
		 lee.close();
		 
		// TODO Auto-generated method stub

	}

}
