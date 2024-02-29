
public class Main {

	public static void main(String[] args) {
		int[] numeros = { 1, 8, 7, 6, 11, 5 };

		System.out.println("For normal");
		for (int i = 0; i < numeros.length; i++) {
			int numero = numeros[i];
			System.out.println(numero);
		}
		System.out.println("ForEach");

		// por cada numero guardado en numeros
		for (int numero : numeros) {

			System.out.println(numero);

		}

		// SI SOLO QUISIERA MOSTRAR EL 6

		// por cada numero guardado en numeros
		for (int numero : numeros) {
			if (numero == 6) {
				System.out.println(numero);
			}

		}
	}

}
