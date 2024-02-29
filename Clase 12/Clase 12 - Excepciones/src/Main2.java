import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		int numero = 0;
		Scanner sc = new Scanner(System.in);
		boolean todoBien = false;
		while (!todoBien) {

			try {
				numero = sc.nextInt();

				todoBien = true;
			} catch (InputMismatchException e) {
				System.out.println("Te confundiste, pa. Pasame un numero");
					sc.next();

			}
		}

		System.out.println("Numero ingresado: " + numero);
		sc.close();
	}

}
