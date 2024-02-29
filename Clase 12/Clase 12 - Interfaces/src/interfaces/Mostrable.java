package interfaces;

public interface Mostrable {
	
	
	public  void mostrar();
	
	
	public default void mostarDosVeces() {
		this.mostrar();
		this.mostrar();
	}
	
}
