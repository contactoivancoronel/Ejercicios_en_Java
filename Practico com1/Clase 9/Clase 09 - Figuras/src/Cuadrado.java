
public class Cuadrado extends Rectangulo {

	public Cuadrado(double longitudLados) {
		super(longitudLados, longitudLados);
	}
	
	public void setBase(double base) {
		super.setAltura(base);
		super.setBase(base);
	}

	
	public void setAltura(double altura) {
		super.setAltura(altura);
		super.setBase(altura);
	}
	

}
