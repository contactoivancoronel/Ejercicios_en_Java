package modelos;

import interfaces.Mostrable;

public abstract class Animal  implements Mostrable{

	
	public final boolean esAnimal() {
		return true;
	}
	
	public abstract void hacerRuido();
	
}


