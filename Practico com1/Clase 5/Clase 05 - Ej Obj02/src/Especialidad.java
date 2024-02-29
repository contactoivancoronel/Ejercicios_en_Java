
public class Especialidad {

	private String nombre;
	private int cantFemeninos;
	private int cantMasculinos;
	private int cantTotal;
	
	public void incrementarMasculinos() {
		this.cantMasculinos++;
	}
	public void incrementarFemeninos() {
		this.cantFemeninos++;
	}
	public void incrementarTotal() {
		this.cantTotal++;
	}
	
	
	public Especialidad(String nombre) {
		this.nombre = nombre;
	}	
	
	public String getNombre() {
		return nombre;
	}
	public int getCantFemeninos() {
		return cantFemeninos;
	}
	public int getCantMasculinos() {
		return cantMasculinos;
	}
	public int getCantTotal() {
		return cantTotal;
	}
	
	
	
}
