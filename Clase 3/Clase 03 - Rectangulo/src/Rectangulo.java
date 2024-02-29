
public class Rectangulo {
	public double altura;
	public double base;
	
	public double getPerimetro() {
		return  this.altura * 2 + this.base * 2;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getArea() {
		return this.base * this.altura;
	}
	
	public void mostrar() {
		System.out.println("Base: "+this.getBase());
		System.out.println("Altura: "+this.getAltura());
		System.out.println("Area: "+this.getArea());
		System.out.println("Perimetro: "+this.getPerimetro());
	}
	
	
}
