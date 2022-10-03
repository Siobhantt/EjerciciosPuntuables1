package ejerciciopuntuable;

import java.util.Scanner;

public class EjercicioPuntuable2 {

	/*Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que sea múltiplo de 7. 
	Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. En el caso de 13 habría que sumarle 1.
	Usa el operador módulo (%) para calcularlo*/
	public static void main(String[] args) {
	
		//Declaramos las variables
		
		int numeroUsuario, calculoNecesario, restante; //donde guardaremos el numero que introducirá el usuario

	
		//Declaramos el Scanner
		
		Scanner lee = new Scanner(System.in);
		
		//Solicitamos al usuario el numero
		
		System.out.println("Por favor introduzca el numero: ");
		numeroUsuario = lee.nextInt(); 
		
		/*en la variable restante vamos a guardar el resultado de numeroUsuario%7, que será el resto de esa division
		en calculoNecesario guardaremos el ternario en donde si restante es igual a 0 nos colocará 0 y
		en caso contrario nos devolverá 7 menos el restante*/
		
		restante = numeroUsuario %7;
		calculoNecesario = restante == 0 ? 0 : 7 - restante;
		
		
		//Imprimimos en pantalla
		System.out.println("La cantidad necesaria para que sea multiplo de 7 es: " + calculoNecesario);
		
		//cerramos scanner
		
		lee.close();
		
		// TODO Auto-generated method stub

	}

}
