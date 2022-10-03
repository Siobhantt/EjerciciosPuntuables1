package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable1 {
/*Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado al entero más próximo.
 *  (SIN UTILIZAR Math.round())
*/
	
	public static void main(String[] args) {
		//Declaramos las variables
		
				double numeroEntradaUser; //donde guardaremos lo que introducirá el usuario
				final double AYUDA_REDONDEO; //Establecemos lo que nos ayudara a rendondear el numero que será 0,5
				double numeroRedondeado; //Aqui guardaremos el resultado
				
				//Declaramos el scanner
				
				Scanner lee = new Scanner(System.in); 
				
				//Solicitamos al usuario el numero
				
				System.out.println("Por favor introduzca un numero con decimales: ");
				numeroEntradaUser = lee.nextDouble();
			
				//declaramos la constante que nos ayudará con el redondeo
				
				AYUDA_REDONDEO = 0.5;
				
				//Procedemos a hacer la operacion:sumamos al numero que queremos redondear la constante de AYUDA_REDONDEO
				//guardamos en la variable numeroRedondeado el resultado
				
				numeroRedondeado = numeroEntradaUser + AYUDA_REDONDEO;
				
				//Imprimimos en pantalla el resultado
				
				System.out.println("El entero mas proximo es: " + (int) numeroRedondeado);
				
				//Cerramos el scanner!!!
				
				lee.close();
		// TODO Auto-generated method stub

	}

}
