
public class Contador {
	
	public double calcularGanancia(Producto prod) {
		return (prod.precio - prod.costo) * prod.cantidad;
	}

}
