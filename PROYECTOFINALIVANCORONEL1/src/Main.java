import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Articulo> articulos = new ArrayList<Articulo>();
		ArrayList<Articulo> carro = new ArrayList<Articulo>(); // Instanciamos, Lista articulos

		Scanner entrada = new Scanner(System.in);
		
		Menu menu = new Menu(entrada, articulos, carro); // instanciamos menu que recibe por parametros...
		
		
		boolean programaActivo = true;
		

		System.out.println("Bienvenido USUARIO \n");
				

		do {
						
			menu.mostrar();
			
			int opcion = entrada.nextInt(); 
			switch (opcion) {
			
			case 1:	menu.ingresarArticulo();
				break;
				
			case 2:  menu.borrarArticulo(); 
				break;
				
			case 3: menu.modificar();					
				break;
				
			case 4: menu.consultaStock();			 				
				break;
				
			case 5: menu.añadirAlCarro();								
				break;
			
			case 6: menu.precioTotal();
				break;
			
			case 7: menu.realizarcompra();
				break;
				
			case 8:  programaActivo = false;
				break;
				
			default: System.out.println("Introduzca una opcion correcta");
			break;
			
			}
			
		} while (programaActivo);

	}

}
