
public class Main {

	public static void main(String[] args) {
		
		Perro perro1, perro2;
		
		perro1 = new Perro("Pippo", 7, 15.7);
		
		perro2 = new Perro("Jorge",9,20);
		
		perro2 = perro1;			
		
		perro1.setEdad(88);
		
		perro2.mostrar();
		
		Perro[] jauria = new Perro[5];
		
		
		jauria[0] = perro1;
		

		jauria[0].setEdad(7);
		
		perro2.mostrar();
		
	}

}
