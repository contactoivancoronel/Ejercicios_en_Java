
public class Pez {

	private String color;	
	
	
	
	public Pez() {
		super();
	}

	public Pez(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}




	public void nadar(int metros) {
		System.out.println("El pez ha nadando "+metros+" metros con fuerza");
		
	}
	
	
}
