
public class Main {

	public static void main(String[] args) {
		
		String[] palabras = new String[1];
		
		
		 
		 try {
			 String minus = palabras[1].toLowerCase();
			 System.out.println(minus);	 
		
			 
			 
			 System.out.println("Terminé el Try");
		 }catch(NullPointerException e) {
			 System.out.println("El programa casi rompe");
			 System.out.println("Razon: La pos 0 es null");
			 
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("El programa casi rompe");
			 System.out.println("Razon: Te pasaste del limite del vector");
			 
		 }
		 System.out.println("Fin del programa");
		

	}

}
