import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
	
	// Creamos los arreglos correspondientes, listado de articulos y el carrito.
	
	Scanner entrada;
	 ArrayList<Articulo> articulos;
	 ArrayList<Articulo> carro;
	 Saldo miSaldo = new Saldo ();
	 
	 
	 // Metodo constructor
	 
	public Menu(Scanner entrada, ArrayList<Articulo> articulos,  ArrayList<Articulo> carro) {
		this.entrada = entrada;
		this.articulos = articulos;
		this.carro = carro;
	}
	
	//-------------------------------------------- MENU PRINCIPAL ----------------------------------------------------------------------------------------------
	
	public void mostrar(){
		System.out.println("Su saldo es de:"+miSaldo.dimeSaldo());
		System.out.println("Eliga una opcion: \n");
		System.out.println("1. CREAR articulo");
		System.out.println("2. BORRAR articulo");
		System.out.println("3. MODIFICAR articulo");
		System.out.println("4. MOSTRAR Stock");
		System.out.println("5. CARRITO ");
		System.out.println("6. VER PRECIO TOTAL");
		System.out.println("7. REALIZAR COMPRA ");
		System.out.println("8. FINALIZAR programa \n");
		
		System.out.println(" Su respuesta: ");
		
	}
	
	//METODOS
	
	//OPCION 1 --------------------------- INGRESAR ARTICULO -----------------------------------------------------
	
	public void ingresarArticulo() {
		
		System.out.println("Introduzca el nombre del articulo: ");
		String nombre = entrada.next();
		System.out.println("Introduzca el precio del articulo: ");
		int precio = entrada.nextInt();
		System.out.println("Introduzca el codigo del articulo: ");
		String codigo = entrada.next();
		System.out.println(" Articulo AGREGADO! \n");

		Articulo art = new Articulo(); // SE LO PASAMOS A "ARTICULO"
		art.setNombre(nombre); // CON SETTERS LE PASAMOS LO INTRODUCIDO ANTERIORMENTE
		art.setPrecio(precio);
		art.setCodigo(codigo);
		

		articulos.add(art); 
	}
	
		
	
	//OPCION 2 ------------------------------ BORRAR ARTICULO --------------------------------------------------
	
	
	public void borrarArticulo(){

		if (articulos.size() == 0) {
			System.out.println("No hay articulos existentes");
		}

		else {

			System.out.println("Introduzca el nombre del articulo a eliminar: ");
			String nombre_1 = entrada.next();

			Iterator<Articulo> it = articulos.iterator(); // RECORREMOS LISTA articulos CON "ITERATOR"

			while (it.hasNext()) { // Mientras haya algo que recorrer it.hasNext

				Articulo art_1 = it.next(); // devuelve articulo sobre el que estoy iterando y avanza 1 posicion

				if (art_1.getNombre().equals(nombre_1)) { // si articulo sobre el que itero es igual al nombre
														// introducido entonces borramos.
					it.remove();
					System.out.println("Articulo ELIMINADO! \n");
				}

	
			}
		}
		

}
	
	//OPCION 3 -------------------------- MODIFICAR ARTICULO ------------------------------------------------------
	
	
	public void modificar(){
		
		if (articulos.size() == 0) {
			System.out.println("No Hay Stock");    // si el tamaño de articulos es igual a 0 entonces no hay stock
		}
		

		for (Articulo art3 : articulos) {
			System.out.println("PRODUCTO");
			System.out.println("Nombre: " + art3.getNombre());		//Recorremos con for each
			System.out.println("\n");
		}
					

		System.out.println("Introduzca el nombre del articulo a editar: ");
		String nombreart = entrada.next();
		
		System.out.println("Introduce el nuevo nombre del articulo: ");
		String nombre3 = entrada.next();

		System.out.println("Introduzca nuevo precio: ");
		int precio3 = entrada.nextInt();

		System.out.println("Introduzca nuevo codigo: ");
		String codigo2 = entrada.next();

		Iterator<Articulo> it = articulos.iterator(); // Volvemos a recorrer lista articulos con iterator

		while (it.hasNext()) { // Mientras haya algo que recorrer it.hasNext
			Articulo art3 = it.next(); // recorro
			
			if (art3.getNombre().equals(nombreart)) { // si coincide entonces seteamos									
						art3.setNombre(nombre3);
						art3.setPrecio(precio3);
						art3.setCodigo(codigo2);					
					
					System.out.println("Articulo ACTUALIZADO! \n ");
				}
			}

		}
			
	
	// OPCION 4 -------------------- CONSULTAR STOCK ------------------------------------------------------------------------------
	
	public void consultaStock() {
		if (articulos.size() == 0) {
			System.out.println("No Hay Stock");
		}

		for (Articulo art4 : articulos) { //consultamos con for each e imprimimos por pantallas todas las caract.
			System.out.println("NOMBRE: " + art4.getNombre() + " PRECIO: " + art4.getPrecio()
					+ " CODIGO DE PRODUCTO: " + art4.getCodigo());
			System.out.println("\n");
		}
	

	}
	
	// OPCION 5 ----------------------------------- AÑADIR ARTICULO AL CARRO ---------------------------------------------------------------------
	
	public void añadirAlCarro() {
		
		System.out.println("1. Ver Carrito. \n2. Añadir productos al carrito.\n");
		int rta = entrada.nextInt();
		
		switch (rta) {
		
			case 1: if (carro.size() == 0) { // no stock
				System.out.println("No hay articulos en el carro. Por favor eliga la opcion 5-2 para añadir.");
			}
						
				for (Articulo art4 : carro) {  //Imprime por pantalla articulos añadidos al carro
				
				System.out.println("NOMBRE: " + art4.getNombre() + " PRECIO: " + art4.getPrecio()
						+ " CODIGO DE PRODUCTO: " + art4.getCodigo());
				System.out.println("\n");
				
				}			
				break;
			
			case 2:	if (articulos.size() == 0) { // no stock
				System.out.println("No Hay Stock");
			}
			
			System.out.println("Ingrese el codigo de producto para añadir al carrito: \n");
			String codigo = entrada.next();
			
			for (Articulo art4 : articulos) { // mediante cod de prod añadimos al carro

							
				if(art4.getCodigo().equals(codigo)) { // si coincide codigo entonces añado
					carro.add(art4);
					System.out.println("Articulo Añadido correctamente.");		
				} 
				}
						
				break;
				
			default:System.out.println("Opcion Invalida.");
					break;
		}
	
		}
	
	
	//OPCION 6 -------------------------- PRECIO TOTAL DE LOS ARTICULOS DEL CARRO ------------------------------------------------------------------------
	
	public void precioTotal() {
		int preciototal = 0;
        for(Articulo art4 : carro) {  //recorremos la lista y captamos precio de productos para sumarlos.
      int precio = art4.getPrecio();
      preciototal = preciototal + precio;
      
      
      }
        System.out.println("El precio total de los productos es de: "+preciototal); //imprimimos resultado de la suma
      
	}
	
		
	
	
	//OPCION 7 -------------------------- REALIZAR COMPRA------------------------------------------------------------------------
	
	public void realizarcompra() {
		int preciototal = 0;
		int restaTotal= 0;
	    for(Articulo art4 : carro) {  //recorremos la lista y captamos precio de productos para sumarlos.
	  int precio = art4.getPrecio();
	  preciototal = preciototal + precio;
	  restaTotal = miSaldo.dimeSaldo() - preciototal;
	  System.out.println("Compra efectuada. Su saldo ahora es de: "+restaTotal);
	  
	  
  }
}


}
			
		
	
	

	
	
	



