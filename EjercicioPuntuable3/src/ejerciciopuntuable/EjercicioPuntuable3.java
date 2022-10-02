package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable3 {
	/*Modifica el ejercicio anterior para que, indicando dos números, por ejemplo, num1 y num2,
	 *  diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2.
	 */
	public static void main(String[] args) {
		
		//Declaramos las variables
		
		int primerNumeroUsuario, segundoNumeroUsuario, calculoNecesario, restante;
	
		//Declaramos el Scanner
		
		Scanner lee = new Scanner(System.in);
		
		//Solicitamos al usuario el primer y el segundo numero
		
		System.out.println("Por favor introduzca el primer numero: ");
		primerNumeroUsuario = lee.nextInt(); 
		
		System.out.println("Por favor introduzca el segundo numero: ");
		segundoNumeroUsuario = lee.nextInt(); 
		
		//Hacemos la operacion
		
		restante = primerNumeroUsuario %segundoNumeroUsuario;
		calculoNecesario = restante == 0 ? 0 : segundoNumeroUsuario - restante;
		
		//Imprimimos en pantalla
		System.out.println("La cantidad necesaria para que el primer numero introducido sea multiplo del segundo numero introducido es: " + calculoNecesario);
		
		//cerramos scanner
		
		lee.close();
		
		// TODO Auto-generated method stub

	}

}
