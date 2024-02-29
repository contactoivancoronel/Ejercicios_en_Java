package main;

import java.util.Scanner;

import modelos.Usuario;

public class ProcesosLogueado {

	private Usuario usuarioLogueado;
	private Scanner sc;	
	
	
	


	public ProcesosLogueado( Scanner sc,Usuario usuarioLogueado) {
		super();
		this.usuarioLogueado = usuarioLogueado;
		this.sc = sc;
	}





	public void inicio() {
		System.out.println("Bienvenido, "+usuarioLogueado.getNickname());
		while(true) {
			System.out.println("Elija una opcion (0 para salir)");
			String op = sc.next();
			if(op.equals("0")) {
				break;
			}
		}
		
	}
	
	
	
	
}
