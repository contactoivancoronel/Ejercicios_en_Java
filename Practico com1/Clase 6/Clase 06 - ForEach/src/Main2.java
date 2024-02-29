import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Perro[] perros = new Perro[5];
		
		for (int i = 0; i < perros.length; i++) {
			int edad = sc.nextInt();
			Perro perro =  new Perro("Pippo", edad, 3);
			perros[i] = perro ;
		}
		
		for(Perro perro : perros) {
			perro.setEdad(77);
		}
		
	}
}
