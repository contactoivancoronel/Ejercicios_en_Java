
public class Test {

	public static void main(String[] args) {
		Amigo amix;		
		amix = new Amigo("Jorge","El curioso",21,1.85,86);
		
		amix.mostrar();
		
		Amigo amix2 = new Amigo("Felix","El gato", 8,1.25,45);	
		
		amix2.mostrar();
		System.out.println("-----------------------------------------");
		System.out.println("En la agenda: ");
		
		Agenda agenda = new Agenda(5);
		agenda.setAmigo(0, amix);
		agenda.setAmigo(1, amix2);
		agenda.setAmigo(2, amix2);	
		agenda.setAmigo(3, amix2);
		agenda.setAmigo(4, amix2);	

		agenda.getAmigo(0).mostrar();
		agenda.getAmigo(1).mostrar();

		System.out.println("-----------------------------------------");
		agenda.mostrar();
	
		

	}

}
