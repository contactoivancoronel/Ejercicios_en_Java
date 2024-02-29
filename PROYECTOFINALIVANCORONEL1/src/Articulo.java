import java.util.ArrayList;
import java.util.Scanner;

public class Articulo {
	
	//Definimos atributos que tiene la clase Articulo
	
    private String nombre;
    private int precio;
    private String codigo;
    
    //Getters y Setters para acceder desde la otra clase.
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	


}
