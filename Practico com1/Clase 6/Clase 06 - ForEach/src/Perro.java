
public class Perro {

	private String nombre;
	private int edad;
	private double peso;
	
	public Perro(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+ this.getNombre());
		System.out.println("Edad: "+ this.getEdad());
		System.out.println("Peso: "+ this.getPeso());
	}
	
}
