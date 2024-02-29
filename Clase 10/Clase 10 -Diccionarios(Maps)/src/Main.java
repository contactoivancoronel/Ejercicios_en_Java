import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		/*
		 * Clave: "uno" Valor: 1
		 */

		HashMap<String, Integer> diccionario;

		diccionario = new HashMap<String, Integer>();

		diccionario.put("uno", 1);

		String clave = "uno";
		Integer valor = diccionario.get("uno");
		
		System.out.println(valor);
		

		HashMap<String, String> diccionarioAnimales;
		
		diccionarioAnimales = new HashMap<String, String> ();
		
		diccionarioAnimales.put("Gato", "Felino de cuatro patas que maulla");
		diccionarioAnimales.put("Cobayo", "Roedor  ");
		diccionarioAnimales.put("Cobayo", "Roedor de cuatro patas"); //Reemplaza el anterior
		diccionarioAnimales.put("Hamster", "Roedor de cuatro patas"); //Reemplaza el anterior

		System.out.println("cobayo: "+diccionarioAnimales.get("cobayo"));
		System.out.println("Cobayo: "+diccionarioAnimales.get("Cobayo"));
		
		//Me devuelve la coleccion de valores
		Collection<String> valores = diccionarioAnimales.values();

		System.out.println("Valores:");
		for (String string : valores) {
			System.out.println(string);
		}

		Set<String> claves = diccionarioAnimales.keySet();

		System.out.println("claves:");
		for (String string : claves) {
			System.out.println(string);
		}
		
		
		

	}

}
