
public class Main {

	public static void main(String[] args) {
		
		
		Perro perro1, perro2;
		perro1 = new Perro();
		perro1.setEdad(5);
		
		perro2 = perro1;

		perro2.setEdad(10);
		
		System.out.println("Edad de perro 1:"+perro1.getEdad());
		
		
		

	}

}
