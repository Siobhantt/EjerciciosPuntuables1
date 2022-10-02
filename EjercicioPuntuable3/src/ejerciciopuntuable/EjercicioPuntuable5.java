package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable5 {
/*Dado el siguiente polinomio de segundo grado:
	y=ax2+bx+c
		Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.*/

	public static void main(String[] args) {
		//Declaramos las variables
		int a, b, c, x, y;
		
		//Declaramos el scanner
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos la solicitud al usuario
		System.out.println("Por favor introduzca el valor de a: ");
		a = lee.nextInt();
		
		System.out.println("Por favor introduzca el valor de b: ");
		b = lee.nextInt();
		
		System.out.println("Por favor introduzca el valor de c: ");
		c = lee.nextInt();
		
		System.out.println("Por favor introduzca el valor de x: ");
		x = lee.nextInt();
		
		 //procedemos a plantear la operacion y=ax2+bx+c, la guardamos en la variable y
		
		y = a*(x*x)+b*x+c;
		
		//Imprimimos en pantalla el resultado de Y
		
		System.out.println("El valor correspondiente a y es: " + y);

		
		//cerramos el scanner
		
		lee.close();
		
		// TODO Auto-generated method stub

	}

}
