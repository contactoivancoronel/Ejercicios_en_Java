package main;

import java.util.HashMap;
import java.util.Scanner;

import modelos.Usuario;

public class Main {

	public static void main(String[] args) {

		
		HashMap<String, Usuario> usuarios;
		usuarios = new HashMap<String, Usuario>();
		Scanner sc = new Scanner(System.in);
		Procesos procesos = new Procesos(sc);
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
