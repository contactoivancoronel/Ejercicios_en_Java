
public class Perro {

	private double pesoEnKg;
	private int edad;
	private String nombre;
	private String raza;
	

	public double getPesoEnKg() {
		return this.pesoEnKg;
	}
	public void setPesoEnKg(double pesoEnKg) {
		this.pesoEnKg = pesoEnKg;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return this.raza;
	}
	private void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void setPesoEnGr(double pesoEnGr) {
		this.pesoEnKg = pesoEnGr / 100;
		
	}
	
	public void mutar() {
		
		this.setRaza("Mutante");
	}
	
}
