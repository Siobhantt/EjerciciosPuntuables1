package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable6 {
	//Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
	//La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario

	public static void main(String[] args) {
		//Declaramos las variables
		
		int segundos , minutos, horas;
		//declaramos el scanner
		
		Scanner lee = new Scanner(System.in);
		
		//Solicitamos al usuario que introduzca los segundos y lo guardamos en la variable segundos
		
		System.out.println("Por favor introduzca los segundos: ");
		segundos = lee.nextInt();
		
		//asiganmos los valores
		
		horas = segundos / 3600;
		minutos = segundos / 60;
		
		//Imprimimos en pantalla
		
		System.out.println("HORAS: " + horas);
		System.out.println("MINUTOS: " + minutos);
		System.out.println("SEGUNDOS: " + segundos);
		//cerramos el escanner
		
		lee.close();
		
		// TODO Auto-generated method stub

	}

}
