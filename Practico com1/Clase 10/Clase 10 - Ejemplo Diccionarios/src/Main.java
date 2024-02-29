import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Perro> pacientes;		
		pacientes= new HashMap<Integer, Perro> ();
		
		char opcion = 'x';
		
		while (opcion != '0') {
			System.out.println("Elija una opcion:");
			System.out.println("1. Ver listado de perros");
			System.out.println("2. Agregar un nuevo perro");
			System.out.println("3. Modificar un perro");
			System.out.println("4. Eliminar un perro");
			System.out.println("0. Salir");
			
			//Perro
			//Pippo
			//Codigo de paciente = 14
			//edad = 15
			
			///perro[14] = perro;
			//perros[K] = V;
			
			//numeros[1] = 5;
			
			
			
			opcion = sc.next().charAt(0);
			
			switch (opcion) {
			case '1':
					Collection<Perro> listadoPerros;
					
					listadoPerros = pacientes.values();
					
					for (Perro perro : listadoPerros) {
						System.out.println(perro);
						
					}
					
				
				break;
				
			case '2':
				System.out.println("Ingrese el codigo");
				int codigo = sc.nextInt();
				System.out.println("Ingrese el nombre");
				String	nombre = sc.next();
				System.out.println("Ingrese la edad");
				int edad = sc.nextInt();
				System.out.println("Ingrese el peso");
				double peso = sc.nextDouble();
				
				if(pacientes.containsKey(codigo)) {
					System.out.println("No se pudo agregar, el codigo ya existe");
				}else {
					Perro perro = new Perro(codigo, nombre, edad, peso);
					
					pacientes.put(codigo, perro);
					
				}
				
				
				
				
				break;
				
			case '3':
				System.out.println("Ingrese el codigo del perro a editar");
				int codigoEditar = sc.nextInt();
				
				Perro perroEditar = pacientes.get(codigoEditar);
				
				if(perroEditar != null) {
					System.out.println("Ingrese nuevo nombre");
					perroEditar.setNombre(sc.next());
					
				}else {
					System.out.println("El perro no existe");
				}
				
				
				break;
				
			case '4':
				System.out.println("Ingrese el codigo del perro a eliminar");
				int codigoEliminar = sc.nextInt();
				
				pacientes.remove(codigoEliminar);
				
				break;

			default:
				break;
			}
			
		}
		
		
		

	}

}
