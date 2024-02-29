package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import modelos.ListadoUsuarios;
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

	public void mostrarUsuarios(ListadoUsuarios usuarios) {
		Collection<Usuario> listaUsuarios = usuarios.getLista();
		for( Usuario usuario : listaUsuarios  ) {
			mostrarUsuario(usuario);
		}
		
	}

	public void cargarUsuario(ListadoUsuarios usuarios) {
		System.out.println("Ingrese el nombre");
		String nombre = sc.next();
		System.out.println("Ingrese la clave");
		String clave = sc.next();
		System.out.println("Ingrese el nick");
		String nick = sc.next();
		
		Usuario usuario = new Usuario(nombre, clave, nick);
		//usuarios.put(nombre.toLowerCase(), usuario);
		usuarios.agregar(usuario);
		
		guardarUsuarios(usuarios);
		
	}

	public void eliminarUsuario(ListadoUsuarios usuarios) {
		System.out.println("Ingrese el nombre del usuario a editar");
		String nombre= sc.next();
		
		
		if(usuarios.eliminar(nombre)) {
			System.out.println("Se eliminó el usuario. ");
			guardarUsuarios(usuarios);
		}else {
			System.out.println("El usuario no existe.");
		}
	}

	public void opcionEditarUsuario(ListadoUsuarios usuarios) {
		System.out.println("Ingrese el nombre del usuario a editar");
		String nombre= sc.next();
		//Usuario usuario = usuarios.get(nombre.toLowerCase());
		Usuario usuario = usuarios.buscar(nombre);
		
		mostrarUsuario(usuario);
		editarUsuario(usuario);
		guardarUsuarios(usuarios);
		
	}
	
	public void editarUsuario(Usuario usuario) {
		System.out.println("Ingrese el nuevo nick");
		usuario.setNickname(sc.next());
	}

	public void ingresar(ListadoUsuarios usuarios) {
		System.out.println("Ingrese usuario");
		String nombre = sc.next();
		//Usuario usuario = usuarios.get(nombre.toLowerCase());
		Usuario usuario = usuarios.buscar(nombre);
		
		ProcesosLogueado proc = new ProcesosLogueado(sc,usuario);
		proc.inicio();
		
		
	}
	
	
	public ListadoUsuarios cargarUsuarios() {
		
		String nombreArchivo = System.getProperty("archivo_usuarios");
		
		File archivo = new File(nombreArchivo);
		
		ListadoUsuarios lUsuarios = null;
		
		try {
			if(archivo.createNewFile()) {
				//Si no existia, por ende se creó
				lUsuarios = new ListadoUsuarios();
				guardarUsuarios(lUsuarios);
				
				
			}else {
				//Si ya existia, por ende lo puedo levantar
				FileInputStream fis = new FileInputStream(archivo);
				ObjectInputStream ois = new ObjectInputStream(fis);
				lUsuarios = (ListadoUsuarios) ois.readObject();		
				ois.close();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lUsuarios;
		
	}
	
	
	
	public void guardarUsuarios(ListadoUsuarios lUsuarios) {
		
		String nombreArchivo = System.getProperty("archivo_usuarios");
		
		File archivo = new File(nombreArchivo);
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(archivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lUsuarios);	
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}


	
	
}
