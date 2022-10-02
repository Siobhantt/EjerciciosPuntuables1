package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable4 {
//Crea un programa que pida la base y la altura de un triángulo y muestre su área. (AT = base*altura/2)

	public static void main(String[] args) {
		//Declaramos la variables
		double baseUser, alturaUser, areaUser;
		
		//Declaramos el scanner
		Scanner leeTr = new Scanner(System.in);
		
		//Solicitamos al usuario la base y la altura y guardamos lo que introduzca el usuario en la variables correspondientes
		System.out.println("Por favor introduzca la base del triangulo: ");
		baseUser = leeTr.nextDouble();
		System.out.println("Por favor introduzca la altura del triangulo: ");
		alturaUser = leeTr.nextDouble();
		
		//Realizamos la operacion
		
		areaUser = (baseUser * alturaUser)/2;
		
		//Imprimimos el resultado
		System.out.println("El area del triangulo es: " + areaUser);
		
		//cerramos scanner
		
		leeTr.close();
		// TODO Auto-generated method stub

	}

}
