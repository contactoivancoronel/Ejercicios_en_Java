package main;

import java.util.HashMap;

import modelos.ListadoUsuarios;
import modelos.Usuario;

public class Test {

	public static void main(String[] args) {


		HashMap<String, Usuario> mapUsuarios = new HashMap<String, Usuario>();
		
		ListadoUsuarios lUsuarios = new ListadoUsuarios();

		String username = "Gabriel";
		
		Usuario user = new Usuario(username, "pepe1", "Gab");
		
		
		//Agregar
		mapUsuarios.put(user.getUsername().toLowerCase(), user); //1ro
		
		lUsuarios.agregar(user); //2do
		
		//Eliminar
		mapUsuarios.remove(username.toLowerCase());
		
		lUsuarios.eliminar(username);
		
		//Buscar
		mapUsuarios.get(username.toLowerCase());
		lUsuarios.buscar(username);
		
		
		//mostrar
		for(Usuario usuario : mapUsuarios.values()) {
			System.out.println(usuario);
		}
		
		
		for(Usuario usuario : lUsuarios.getLista()) {
			System.out.println(usuario);
		}
		
		
		

	}

}
