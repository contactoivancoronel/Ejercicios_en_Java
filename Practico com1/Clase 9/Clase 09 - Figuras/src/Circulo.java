
public class Circulo extends FiguraGeometrica {

	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}

	public double getPerimetro() {
		return Math.PI * 2 * this.getRadio();
	}

	public double getDiametro() {
		return this.getRadio() * 2;
	}

}
