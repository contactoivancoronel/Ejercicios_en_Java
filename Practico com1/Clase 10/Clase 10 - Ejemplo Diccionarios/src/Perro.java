
public class Perro {

	private int nroPaciente;
	private String nombre;
	@Override
	public String toString() {
		return "Perro [nroPaciente=" + nroPaciente + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}

	private int edad;
	private double peso;

	public int getNroPaciente() {
		return nroPaciente;
	}

	public void setNroPaciente(int nroPaciente) {
		this.nroPaciente = nroPaciente;
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

	public Perro(int nroPaciente, String nombre, int edad, double peso) {
		super();
		this.nroPaciente = nroPaciente;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

}
