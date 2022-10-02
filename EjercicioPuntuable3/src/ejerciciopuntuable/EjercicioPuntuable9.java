package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable9 {
	/*Pide dos números al usuario. Deberá mostrarse true si ambos números son iguales y false en caso contrario.*/

	public static void main(String[] args) {
		//Declaramos las variables
		int numero1;
		int numero2;
		boolean result;
		
		//Declaramos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Solicitamos al usuario los numeros a comparar
		
		System.out.println("Por favor introduzca el primer numero a verificar: ");
		numero1 = lee.nextInt();
		
		System.out.println("Por favor introduzca el segundo numero a verificar: ");
		numero2 = lee.nextInt();
		
		//utilizamos el operador
		
		result = numero1==numero2 ? true : false;
		
		System.out.println("Los numeros son iguales: " + result + "!");
		
		//cerramos el scanner
		
		lee.close();
		
		// TODO Auto-generated method stub

		
	}

}
