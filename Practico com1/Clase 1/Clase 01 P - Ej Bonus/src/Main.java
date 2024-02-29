import java.util.Scanner;

/*
 * Preunguntar al usuario cuantos numeros va a ingresar 
 * ingresar dichos numeros
 * luego le hacemos elegir un numero
 * y mostramos por pantalla cuantas veces se ingreso
 * ese numero
 * */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tamaño que tendrá el vector");
		double[] numeros;
		numeros = new double[   sc.nextInt()   ];
		System.out.println("El vector mide: "+numeros.length);
		
		for( int i = 0;   i < numeros.length ; i++   ) {
			System.out.println("Ingrese un numero para el indice "+i);
			numeros[i] = sc.nextDouble();			
		}
		
		System.out.println("¿Que numero desea buscar?");
		double numero = sc.nextDouble();
		int contador = 0;
		for( int i = 0;   i < numeros.length ; i++   ) {
			if( numero == numeros[i] ) {
				contador++;
			}
		}
		System.out.println("El numero se repite "+contador+" veces.");
	

	}

}
