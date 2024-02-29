import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String texto1 = "Hola";
		char caracter = texto1.charAt(0);
		int longitud = texto1.length();
		System.out.println(caracter);
		System.out.println(longitud);
		
		boolean contiene = texto1.contains("a");
		System.out.println(contiene);
		
		texto1.toUpperCase();
		
		texto1 = texto1.toUpperCase();
		
		Scanner sc  = new Scanner(System.in);
		
		String texto2, texto3;

		texto2 = sc.next();
		texto3 = sc.next();
		
		if( texto2 == texto3) {
			System.out.println("Son el mismo");
		}else if(texto2.equals(texto3)) {
			System.out.println("Son equivalentes");	
		}else if(texto2.equalsIgnoreCase(texto3)) {
			System.out.println("Ignorando las mayusculas, son el mismo");
		}
		else {
			System.out.println("No son iguales");
		}

		texto1 = "Hola";
		texto2 = "Hola";
		texto3 = "Hola";
		
	}

}
