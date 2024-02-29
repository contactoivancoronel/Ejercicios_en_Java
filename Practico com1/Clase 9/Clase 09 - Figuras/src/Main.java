import java.util.Scanner;

public class Main {

	/*
	 * Ingresar figuras geometricas y al final del programa, mostrar sus areas y sus
	 * perimetros
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas figuras va a ingresar?");
		int cantidad = sc.nextInt();

		FiguraGeometrica[] figuras = new FiguraGeometrica[cantidad];

		for (int i = 0; i < figuras.length; i++) {

			System.out.println("Que tipo de figura va a ingresar?");
			System.out.println("1. Rectangulo");
			System.out.println("2. Circulo");
			System.out.println("3. Triangulo equilatero");

			switch (sc.nextInt()) {
			case 1:

				System.out.println("Ingrese la longitud de la base");
				double baseR = sc.nextDouble();
				System.out.println("Ingrese la longitud de la altura");
				double alturaR = sc.nextDouble();
				
				figuras[i] = new Rectangulo(baseR, alturaR);

				break;
				
			case 2:
				System.out.println("Ingrese la longitud del radio");
				double radioC = sc.nextDouble();
				
				figuras[i] = new Circulo(radioC);
				
				
				break;
				
			case 3:
				System.out.println("Ingrese la longitud de los lados");
				double longitudT = sc.nextDouble();
				
				figuras[i] = new TrianguloEquilatero(longitudT);

			default:
				break;
			}

		}
		
		
		for (int i = 0; i < figuras.length; i++) {
			FiguraGeometrica figuraGeometrica = figuras[i];
			
			System.out.println("Figura "+(1+i));

			System.out.println("Area: "+figuraGeometrica.getArea());
			System.out.println("Perimetro: "+figuraGeometrica.getPerimetro());
			
		}

	}

}
