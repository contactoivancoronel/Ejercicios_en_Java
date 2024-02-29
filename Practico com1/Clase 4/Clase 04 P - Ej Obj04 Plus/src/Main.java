import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int cantidadAmigos = 2;
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda(cantidadAmigos);		

		
		System.out.println("Bienvenido a la AGENDA");
		for (int i = 0; i < cantidadAmigos; i++) {
			System.out.print("Ingrese nombre: ");
			String nombre = sc.next();
			System.out.print("Ingrese apellido: ");
			String apellido = sc.next();
			System.out.print("Ingrese edad: ");
			int edad = sc.nextInt();
			System.out.print("Ingrese altura: ");
			double altura = sc.nextDouble();
			System.out.print("Ingrese peso: ");
			double peso = sc.nextDouble();
			
			Amigo amigo = new Amigo(nombre, apellido, edad, altura, peso);
			
			agenda.setAmigo(i, amigo);
			
			
		}
		agenda.mostrar();
		
		

	}

}
