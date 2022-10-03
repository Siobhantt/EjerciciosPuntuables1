package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable6 {
	//Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
	//La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario

	public static void main(String[] args) {
		//Declaramos las variables
		
		int segundosUser , minutos, horas;
		
		//declaramos el scanner
		
		Scanner lee = new Scanner(System.in);
		
		//Solicitamos al usuario que introduzca los segundos y lo guardamos en la variable segundos
		
		System.out.println("Por favor introduzca los segundos: ");
		segundosUser = lee.nextInt();
		
		/*asignamos los valores de horas y minutos sabiendo que una hora son 3600 segundos y un minuto son 60 segundos
		*/
		
		horas = segundosUser / 3600; //el resultado de esta operacion me da el cociente que son la cantidad de horas
		segundosUser = segundosUser % 3600; //el resultado de esta operacion me da el resto que son la cantidad de segundos restantes
		
		minutos = segundosUser / 60; //el resultado de esta operacion me da el cociente que son los minutos
		segundosUser = segundosUser % 60; //el resultado de esta operacion me da el resto que son los segundos
		
		
		//Imprimimos en pantalla
		
		System.out.println("HORAS: " + horas);
		System.out.println("MINUTOS: " + minutos);
		System.out.println("SEGUNDOS: " + segundosUser);
		//cerramos el escanner
		
		lee.close();
		
		// TODO Auto-generated method stub

	}

}
