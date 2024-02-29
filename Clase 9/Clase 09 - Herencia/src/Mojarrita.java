
public class Mojarrita extends Pez {
	
	public void nadar(int metros) {
		System.out.println("El pez nada "+metros+" con mucha dificultad");
	}
	
	public void nadarComoPez(int metros) {
		super.nadar(5); //Si uso super en lugar de this, llamará al metodo del padre
	}

	public Mojarrita(String color) {
		super(color); //Va a llamar al constructor del padre;
	}

	
	
	
	
	

	
	
}
