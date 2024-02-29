
public class Perro {

	public String raza;
	public String nombre;
	public double peso;
	public int edad;
	
	public void saludar() {
		String minombre = this.nombre;
		System.out.println("Hola, mi nombre es: "+minombre);
	}
	
	public double sumaEdadPeso() {
		return this.edad + this.peso;
	}
	  
}
