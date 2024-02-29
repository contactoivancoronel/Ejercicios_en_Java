package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import modelos.Usuario;

public class Procesos {

	private Scanner sc;	
	
	public Procesos(Scanner sc) {
		super();
		this.sc = sc;
	}

	public String  mostrarMenu() {
		
		String opcion = null;
		System.out.println("Elija una opcion");
		System.out.println("1. mostrar usuarios");
		System.out.println("2. Cargar un usuario");
		System.out.println("3. Editar un usuario");
		System.out.println("4. Eliminar un Eliminar");
		System.out.println("0. Salir");
		opcion = sc.next();
		
		return opcion;
	}
	
	
	public void mostrarUsuario(Usuario usuario) {
		System.out.println("Usuario: "+usuario.getUsername());
		System.out.println("Password:"+usuario.getPassword());
		System.out.println("Nickname:"+usuario.getNickname());
	}

	public void mostrarUsuarios(HashMap<String, Usuario> usuarios) {
		Collection<Usuario> listaUsuarios = usuarios.values();
		for( Usuario usuario : listaUsuarios  ) {
			mostrarUsuario(usuario);
		}
		
	}

	public void cargarUsuario(HashMap<String, Usuario> usuarios) {
		System.out.println("Ingrese el nombre");
		String nombre = sc.next();
		System.out.println("Ingrese la clave");
		String clave = sc.next();
		System.out.println("Ingrese el nick");
		String nick = sc.next();
		
		Usuario usuario = new Usuario(nombre, clave, nick);
		usuarios.put(nombre.toLowerCase(), usuario);
		
	}

	public void eliminarUsuario(HashMap<String, Usuario> usuarios) {
		System.out.println("Ingrese el nombre del usuario a editar");
		String nombre= sc.next();
		
		Usuario usuarioEliminado  = usuarios.remove(nombre);
		if(usuarioEliminado == null) {
			System.out.println("El usuario no existe.");
		}else {
			System.out.println("Se eliminó el usuario: "+ usuarioEliminado.getUsername() );
		}
	}

	public void opcionEditarUsuario(HashMap<String, Usuario> usuarios) {
		System.out.println("Ingrese el nombre del usuario a editar");
		String nombre= sc.next();
		Usuario usuario = usuarios.get(nombre.toLowerCase());
		
		mostrarUsuario(usuario);
		editarUsuario(usuario);
		
	}
	
	public void editarUsuario(Usuario usuario) {
		System.out.println("Ingrese el nuevo nick");
		usuario.setNickname(sc.next());
	}

	public void ingresar(HashMap<String, Usuario> usuarios) {
		System.out.println("Ingrese usuario");
		String nombre = sc.next();
		Usuario usuario = usuarios.get(nombre);
		
		ProcesosLogueado proc = new ProcesosLogueado(sc,usuario);
		proc.inicio();
		
		
	}


	
	
}
