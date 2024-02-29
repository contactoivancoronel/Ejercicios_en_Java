
public class Recluta {

	private char sexo;
	private String especialidad;
	
	public boolean isFemenino() {
		return this.sexo == 'f' || this.sexo == 'F';
	}
	
	public boolean isMasculino() {
		return this.sexo == 'm' || this.sexo == 'M';
	}
	
	public Recluta(char sexo, String especialidad) {
		this.sexo = sexo;
		this.especialidad = especialidad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
	
	


}
