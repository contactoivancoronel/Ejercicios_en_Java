
public class Main {

	public static void main(String[] args) {
		Perro perro1 = null ;

		System.out.println("perro1: "+perro1);
		//System.out.println(perro1.getEdad());
		
		perro1 = new Perro(11, 12);
		System.out.println("Nombre: "+perro1.getNombre());

		perro1.setNombre("Jorge");
		System.out.println("Nombre: "+perro1.getNombre());

		System.out.println("Edad: " +perro1.getEdad());

		System.out.println("Peso: "+perro1.getPeso());

		
	}

}
