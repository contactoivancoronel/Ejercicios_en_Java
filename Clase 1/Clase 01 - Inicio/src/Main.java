
public class Main {

	public static void main(String[] args) {
		

		System.out.print("Hola mundo"); //Muestra por pantalla
		System.out.println("Adios \\n");//Muestra y salta de linea
		
		int entero = 4;
		double decimal = 2.3;
		boolean booleano = true;
		char caracter = 'c';
		
		String cadena = "Hola mundo";
		
		if(entero == 6) {			
			System.out.println("El numero es 6");
		}else if(entero == 5) {
			System.out.println("El numero es 5");			
		}else {
			System.out.println("El numero no es ni 6 ni 5");
		}
		
		for(int i = 0; i < 10 ; i++ ) {
			System.out.println("i: "+ i)	;			
		}
		System.out.println("Hola "+ "Mundo");
		
		int j = 0;
		while(j < 10) {
			//Si se quiere mostrar siempre el numero siguiente
			//Al que vale j:
			System.out.println("i: "+ (j + 1) )	; //BIEN
			System.out.println("i: "+ j + 1 )	; //MAL	
			
			 j++ ;
		}
		//Creo una variable de tipo vector de enteros
		//Y le guardo un nuevo vector de 3 espacios (Del 0 al 2)
		int numeros[] = new int[3]; 
				
		
		numeros[0] = 1;
		numeros[1] = 4;
		numeros[2] = 7;
		//numeros[3] = 10; //Error por exceder el limite
		
		//Mostrar todos los valores de mi vector
		//junto con sus indices
		for(int i = 0; i < 3 ; i++ ) {
			System.out.println("El vector en el espacio " + i 
					+ " tiene guardado: " +	 numeros[i]  );
			
		}
		
		System.out.println(""+numeros[0] +"\n"+ numeros[1] + numeros[2]);
		
		System.out.println(numeros[0] + numeros[1] + numeros[2]);
		
		
	}

}
