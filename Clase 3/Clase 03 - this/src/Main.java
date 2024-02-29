
public class Main {

	public static void main(String[] args) {
		
		int a = 2;
		Perro perro1 = new Perro(); 
		Perro perro2 = new Perro(); 
		Perro perro3 = new Perro(); 
		Perro perro4 = new Perro(); 
		Perro perro5 = new Perro(); 

		perro1.nombre = "Jorge";
		perro3.nombre = "Diego";
		perro4.nombre = "Gabriel";
		perro1.edad = 8;
		perro1.peso = 12;
		perro1.raza = "Boxer";
		
		perro2.nombre = "Pepe";
		perro2.edad = 4;
		perro2.peso = 15;
		perro2.raza = "Caniche";

		perro2.saludar();
		perro4.saludar();
		
		double resultado = perro2.sumaEdadPeso();
		System.out.println(resultado);

	}

}
