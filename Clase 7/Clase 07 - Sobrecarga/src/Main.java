
public class Main {

	public static void main(String[] args) {
		System.out.println(1);
		
		//println(int,int);

		Perro p = new Perro(1);

		System.out.println(p.calcularPotenciaRecursiva(2, 3));

		System.out.println(p.calcularPotenciaNoRecursiva(2, 3));
		

		
		String cadena = p.toString();
		

		System.out.println(p);
		//to string = a string = a cadena de texto
		
	}

}
