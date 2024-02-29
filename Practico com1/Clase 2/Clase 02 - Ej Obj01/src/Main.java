import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Contador cholo = new Contador();
		double gananciaTotal = 0;
		Scanner scan = new Scanner(System.in)		;
		for(int i = 0; i < 10 ; i++) {
			Producto produc = new Producto();
			System.out.println("Ingrese el codigo del producto");
			produc.codigo = scan.next();
			System.out.println("Ingrese el costo de compra");
			produc.costo = scan.nextDouble();
			System.out.println("Ingrese el valor del venta");
			produc.precio = scan.nextDouble();
			System.out.println("Ingrese la cantidad vendida");
			produc.cantidad = scan.nextInt();
			
			gananciaTotal = gananciaTotal+ cholo.calcularGanancia(produc);
			
			
		}
		System.out.println("La ganancia total es: "+gananciaTotal  );
	}

}
