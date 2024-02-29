
public class Main {

	public static void main(String[] args) {
		
		
		Rectangulo rec = new Rectangulo();
		rec.altura = 10;
		rec.base = 5;

		System.out.println("Mostrar sin metodo: ");
		System.out.println("Base: "+rec.getBase());
		System.out.println("Altura: "+rec.getAltura());
		System.out.println("Area: "+rec.getArea());
		System.out.println("Perimetro: "+rec.getPerimetro());
		

		System.out.println();
		System.out.println("Mostrar con metodo: ");
		rec.mostrar();
		

	}

}
