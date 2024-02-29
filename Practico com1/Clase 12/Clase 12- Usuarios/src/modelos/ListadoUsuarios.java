package modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ListadoUsuarios implements Serializable {

	private HashMap<String, Usuario> usuarios  = new HashMap<String, Usuario>();	


	public boolean agregar(Usuario user) {	
		boolean isInsertado = false;
		String key =  user.getUsername().toLowerCase();
		if(!this.existe(key)) {
			this.usuarios.put(key, user);
			isInsertado = true;
			
		}
		return isInsertado;
			
	}
	
	
	public Usuario buscar(String username) {
		String key = username.toLowerCase();
		return this.usuarios.get(key);
	}
	
	public boolean existe(String username) {
		String key = username.toLowerCase();		
		return this.usuarios.containsKey(key);
	}
	
	public boolean eliminar(String username) {
		String key = username.toLowerCase();
		return this.usuarios.remove(key) != null;		
	}
	
	public List<Usuario> getLista(){
		Collection<Usuario> values = this.usuarios.values();		
		List<Usuario> listado = new ArrayList<Usuario>( values );
		return listado;
		
		
		
	}
	
}
