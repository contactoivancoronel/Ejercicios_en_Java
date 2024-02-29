
public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro();
		
		System.out.println(perro.getPesoEnKg());
		
	//	perro.getPeso() = 12; ERRONEA
	//	perro.peso = 12; ERRONEA
		
		perro.setPesoEnKg(12);
		
		
	}

}
