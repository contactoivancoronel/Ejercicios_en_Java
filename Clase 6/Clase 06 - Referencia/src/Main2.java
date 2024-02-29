
public class Main2 {

	public static void main(String[] args) {
		
		
		Perro[] perros = new Perro[5];
		
		Perro jorge = perros[2];
		
		jorge = new Perro();
		
		jorge.setEdad(5);
		
		System.out.println(perros[2].getEdad());
		
		

	}

}
