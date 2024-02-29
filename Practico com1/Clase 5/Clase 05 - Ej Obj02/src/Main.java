import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Especialidad[] especialidades = new Especialidad[10];
		Recluta[] reclutas;

		int cantEspecialidades = 0;

		System.out.println("Carga de especialidades (Maximo " + especialidades.length + ")");
		for (int i = 0; i < especialidades.length; i++) {
			System.out.println("Ingrese el nombre de la " + (i + 1) + "° especialidad (0 para terminar)");

			String especialidad = sc.next();

			if (!especialidad.equals("0")) {
				especialidades[i] = new Especialidad(especialidad);
				cantEspecialidades++;
			} else {
				break;
			}

		}

		System.out.println("Carga de reclutas");
		System.out.println("¿Cuantos reclutas va a ingresar?");
		reclutas = new Recluta[sc.nextInt()];

		for (int i = 0; i < reclutas.length; i++) {
			System.out.println("Recluta " + (i + 1));
			System.out.println("Ingrese el sexo del recluta");
			char sexo = sc.next().toUpperCase().charAt(0);

			System.out.println("Elija la especialidad");
			for (int j = 0; j < cantEspecialidades; j++) {
				System.out.println(j + 1 + ". " + especialidades[j].getNombre());
			}
			String nombreEspecialidad;
			while (true) {
				int especialidad = sc.nextInt() ;
				if (especialidad < 0) {
					System.out.println("La especialidad no puede ser negativa");
				} else if (especialidad > cantEspecialidades) {
					System.out.println("El valor elegido no puede ser mayor a " 
							+ cantEspecialidades);
				} else {
					nombreEspecialidad = especialidades[especialidad - 1].getNombre();
					break;
				}
			}
			
			reclutas[i] = new Recluta(sexo, nombreEspecialidad);

		}

		
		for (int i = 0; i < reclutas.length; i++) {
			Recluta reclutaActual = reclutas[i];
			System.out.println("Recluta "+(i+1));
			System.out.println("Sexo: "+reclutaActual.getSexo());
			System.out.println("Especialidad: "+reclutaActual.getEspecialidad());
			
			String nombreEspecialidadRecluta = reclutaActual.getEspecialidad();
			
			
			for (int j = 0; j < cantEspecialidades; j++) {
				String nombreEspecialidad =  especialidades[j].getNombre() ;
				if(  nombreEspecialidadRecluta.equals(nombreEspecialidad)  ) {
					if(reclutaActual.isFemenino()) {
						especialidades[j].incrementarFemeninos();
					}else if(reclutaActual.isMasculino()) {
						especialidades[j].incrementarMasculinos();
					}					
					especialidades[j].incrementarTotal();
				}
			}
			
			
		}
		
		for (int i = 0; i <cantEspecialidades; i++) {
			System.out.println(especialidades[i].getNombre()+": ");
			System.out.println("Masculinos: "+especialidades[i].getCantMasculinos());
			System.out.println("Femeninos: "+especialidades[i].getCantFemeninos());
			System.out.println("Total: "+especialidades[i].getCantTotal());
		}
		
		
		sc.close();

	}

}
