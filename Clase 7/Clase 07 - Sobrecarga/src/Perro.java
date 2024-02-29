
public class Perro {
	private String nombre;
	private int edad;
	private double peso;
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
	
	public Perro(double peso) {
		this.peso = peso;
	}
	
	public Perro(int edad) {
		this.edad = edad;
	}
	
	public Perro(String nombre) {
		this.nombre = nombre;
	}
	
	public Perro(int edad,double peso) {
		this.peso = peso;
		this.edad = edad;
	}
	
	
	public void ladrar() {
		
		System.out.println("Guauuuuuuuu!");
	}
	
	public void ladrar(int veces) {
		for (int i = 0; i < veces; i++) {
			this.ladrar();
		}
			
	}
	
	public void ladrar(int a , int b) {
		int cant = a + b;
		this.ladrar(cant);
	}

	
	public int calcularPotenciaRecursiva(int x, int b) {
		if(b==0) {
			return 1;
		}		
		return this.calcularPotenciaRecursiva(x, b-1)  * x    ; 
		
		
	}
	
	public int calcularPotenciaNoRecursiva(int x, int b) {
		int potencia = 1;
		for(int i = 0; i < b; i++) {
			potencia =  potencia * x;
		}
		return potencia;
		
	}
	@Override
	public String toString() {
		return "Perro nombre=" + nombre + ", edad=" + edad + ", peso=" + peso ;
	}
	
	
	
	
	
	
	
	
}
