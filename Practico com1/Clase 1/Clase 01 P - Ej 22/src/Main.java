import java.util.Scanner;

/* Diseñar en Pseudocodigo y codificar en C un algoritmo que permita ingresar 10
números, ninguno de ellos igual a cero. Se pide sumar los positivos, obtener el
producto de los negativos y luego mostrar ambos resultados. 
*/


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int acum_pos = 0;
		int acum_neg = 1;
		
		for(int i = 0; i < 10; i++) {
			
			int numero = 0;			
			while(numero == 0) {
				System.out.println("Ingerese el "+(i+1)+"° numero: ");
				numero = sc.nextInt();
			};
			if(numero > 0) {
				acum_pos = acum_pos + numero;
			}else {
				acum_neg = acum_neg * numero;
			}
			
		}
		System.out.println("La suma de los positivos es: "+acum_pos);
		System.out.println("El producto de los negativos es: "+acum_neg);

	}

}
