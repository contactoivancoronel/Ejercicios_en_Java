
public class Perro {

	private String raza;
	private String nombre;
	private double peso;
	private int edad;
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void saludar() {
		String minombre = this.nombre;
		System.out.println("Hola, mi nombre es: "+minombre);
	}
	
	public double sumaEdadPeso() {
		return this.edad + this.peso;
	}
	  
}
