
public class Rectangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double getPerimetro() {
		return this.getAltura() * 2 + this.getBase() * 2;
	}

	@Override
	public double getArea() {
		return this.getBase() * this.getAltura();
	}

}
