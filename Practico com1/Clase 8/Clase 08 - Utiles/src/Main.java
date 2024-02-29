import java.util.Random;
import java.util.function.DoubleUnaryOperator;

public class Main {
	
	

	public static void main(String[] args) {
		
		int numero = 7- 80;
		int max = Math.max(0, numero);
		
		max = Integer.max(0, 5);				
		
		double maxDouble = Double.max(0.0, 5.0);
		
		Random r = new Random();
		
		String digitos = Integer.toString(numero);
		
		
		System.out.println(r.nextInt(9999));
		
		String palabra = "Hola";
		
		
		
		char letra = palabra.charAt(2);
		
		//System.out.println(letra);
		
		for(int i = 0; i < palabra.length() ; i++) {
			char letr = palabra.charAt(i);
			System.out.println(letr);
		}
		

	}

}
