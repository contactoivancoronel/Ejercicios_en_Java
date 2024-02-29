package main;

import java.util.HashMap;
import java.util.Scanner;

import modelos.ListadoUsuarios;
import modelos.Usuario;

public class Main {

	public static void main(String[] args) {

		System.setProperty("archivo_usuarios", "usuarios.txt");
		System.setProperty("archivo_perros", "perros.txt");
		System.setProperty("archivo_gatos", "gatos.txt");		
		
		
		ListadoUsuarios usuarios;
		Scanner sc = new Scanner(System.in);
		Procesos procesos = new Procesos(sc);
		usuarios = procesos.cargarUsuarios();
		
		
		
		String opcion = "";

		while (!opcion.equals("0")) {
			opcion = procesos.mostrarMenu();
			switch (opcion) {
			case "1":
				procesos.mostrarUsuarios(usuarios);
				break;
			case "2":
				procesos.cargarUsuario(usuarios);
				break;
			case "3":
				procesos.opcionEditarUsuario(usuarios);
				break;
			case "4":
				procesos.eliminarUsuario(usuarios);
				break;
			case "5":
				procesos.ingresar(usuarios);
				break;

			default:
				break;
			}

		}

	}

}
