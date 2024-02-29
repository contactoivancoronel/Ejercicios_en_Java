
public class Main {

	public static void main(String[] args) {
		
		Persona persona1;
		persona1 = new Persona();	//new NombreClase();
		Persona persona2;
		persona2 = new Persona();
		
				
		persona1.altura = 174.254125;
		persona1.edad = 22;
		persona1.nombre = "Mariana";
		persona1.peso = 60;

		persona2.altura = 123;
		persona2.edad = 12;
		
		System.out.println("Altura: "+persona1.altura   );
		System.out.println("Edad: "+persona1.edad   );
		System.out.println("Nombre: "+persona1.nombre   );
		System.out.println("Peso: "+persona1.peso   );
		/////////
		persona1.saludar();
		persona2.saludar();
		
		persona1.decir("Que tal?");
		
		double resultado = persona2.sumar(10, 4);
		
		System.out.println(persona2.sumar(10, 4));
		
		System.out.println("El resultado de la suma es:" + resultado);
		
	}

}
