package modelos;

import java.io.Serializable;

import interfaces.Mostrable;

public class Cuadrado extends FiguraGeometrica  implements Mostrable{

	
	public double lado;
	
	
	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double getPerimetro() {
		return 4*lado;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}
