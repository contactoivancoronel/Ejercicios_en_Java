import java.util.Scanner;

/*ingresar 5 numeros y calcular su media
*/
public class Main {

	
	public static void main(String[] args) {
		
		double acumulador = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		for( int i = 0; i < 5 ; i++  ) {
			System.out.println("Ingrese el "+(i+1)+"° valor" );
			acumulador = acumulador + sc.nextDouble();			
		}
		System.out.println("La media es: "  + (acumulador/5) );
		sc.close();
	}

}
