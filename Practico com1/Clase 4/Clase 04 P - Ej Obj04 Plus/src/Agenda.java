
public class Agenda {
	
	private Amigo[] listadoAmigos;
	
	
	public Agenda(int cantidadMaxima) {
		this.listadoAmigos = new Amigo[cantidadMaxima];
	}
	
	public void setAmigo( int pos , Amigo amigo ) {
		this.listadoAmigos[pos] = amigo;
	}
	
	public Amigo getAmigo(int pos) {
		return this.listadoAmigos[pos];
	}
	
	public int getCantidadAmigos() {		
		return this.listadoAmigos.length;
	}
	
	public void mostrar() {
		for (int i = 0; i < this.getCantidadAmigos(); i++) {		
			this.getAmigo(i).mostrar();
			//this.listadoAmigos[i].mostrar();
		}	
		
	}
}
