
public class Amigo {

	private String nombre;
	private String apellido;
	private int edad;
	private double alturaEnMetros;
	private double pesoEnKg;
	
	
	public void mostrar() {
		System.out.println("Apellido y Nombre: "+this.getNombreCompleto());
		System.out.println("Edad: "+this.getEdad());
		System.out.println("Peso: "+this.getPesoEnKg());
		System.out.println("Altura: "+this.getAlturaEnCm());
		System.out.printf("IMC: %.2f\n", this.getIMC());
	}
	
	
	
	public Amigo(String nombre, String apellido, int edad, double alturaEnMetros, double pesoEnKg) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.alturaEnMetros = alturaEnMetros;
		this.pesoEnKg = pesoEnKg;
	}



	public String getNombreCompleto() {
		return this.getApellido() + ", " + this.getNombre();
	}
	
	public double getAlturaEnCm() {
		return this.getAlturaEnMetros() * 100;
	}
	
	public Double getIMC() {
		return this.getPesoEnKg() /
				(this.getAlturaEnMetros() * this.getAlturaEnMetros() );	
	}
	
	public double getAlturaEnMetros() {
		return alturaEnMetros;
	}

	public void setAlturaEnMetros(double alturaEnMetros) {
		this.alturaEnMetros = alturaEnMetros;
	}

	public double getPesoEnKg() {
		return pesoEnKg;
	}

	public void setPesoEnKg(double pesoEnKg) {
		this.pesoEnKg = pesoEnKg;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	
	
	
	
}
