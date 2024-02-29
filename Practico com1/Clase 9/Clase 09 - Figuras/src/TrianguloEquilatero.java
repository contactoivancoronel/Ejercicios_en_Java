
public class TrianguloEquilatero extends FiguraGeometrica {

	private double longitudLados;

	
	
	public double getLongitudLados() {
		return longitudLados;
	}

	public void setLongitudLados(double longitudLados) {
		this.longitudLados = longitudLados;
	}

	public double getBase() {
		return this.getLongitudLados();
	}
	
	public double getAltura() {
		return (this.getBase() * Math.sqrt(3) ) / 2;
	}
	
	
	
	@Override
	public double getPerimetro() {
		return this.getLongitudLados() * 3;
	}

	public TrianguloEquilatero(double longitudLados) {
		super();
		this.longitudLados = longitudLados;
	}

	@Override
	public double getArea() {
		return this.getBase() * this.getAltura() / 2;
	}

}
