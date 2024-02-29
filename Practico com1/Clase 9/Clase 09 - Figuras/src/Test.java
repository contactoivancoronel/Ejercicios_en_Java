
public class Test {

	public static void main(String[] args) {
		
		
		Circulo cir = new Circulo(20);
		
		FiguraGeometrica figu1 = new Circulo(4);
		
		cir.getArea();
		
		figu1.getArea();
		
		FiguraGeometrica figu2 = new Rectangulo(4,2);
		
		figu2.getArea();

	}

}
