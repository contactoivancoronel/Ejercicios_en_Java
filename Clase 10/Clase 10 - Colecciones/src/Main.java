import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int[] vectorNumeros = new int[5];

		vectorNumeros[1] = 2;

		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		listaNumeros.add(5);
		
		listaNumeros.add(7);

		listaNumeros.add(8);
		listaNumeros.add(8);
		listaNumeros.add(8);
		listaNumeros.add(8);
		listaNumeros.add(8);
		

		System.out.println("Tamaño: "+listaNumeros.size());
		

		System.out.println(listaNumeros.get(1));

		System.out.println("Contenido: ");
		
		
		for (Integer numero : listaNumeros) {
			System.out.println(numero);
		}
		
		
		System.out.println("Contenido: ");		
		for (int i = 0; i < listaNumeros.size(); i++) {
			Integer numero = listaNumeros.get(i);
			
			System.out.println(i+": "+numero);
			
			
		}
		
		
		
		

	}

}
