package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import repositorios.interfaces.DaoCliente;

public class RepositoriosClientesArrayList implements DaoCliente{
	
	private List<Cliente> listado = new ArrayList<>(); 
	
	@Override
	public Cliente get(int codigo) {
		Cliente ret = null;
		boolean encontrado = false; 
		int posicion = 0; 
		
		while( (!encontrado) && (posicion < listado.size()) ){
			Cliente c = listado.get(posicion++);
			if(c.getCodigo() == codigo){
				ret = c; 
				encontrado = true; 
			}
		}
		
		return ret; 
	}

	@Override
	public List<Cliente> get() {
		return listado.subList(0, listado.size()); 
	}

	@Override
	public void add(Cliente elemento) {
		if(elemento != null)
			listado.add(elemento); 
	}

	@Override
	public void remove(Cliente elemento) {
		if(elemento != null)
			if(!listado.remove(elemento))
				throw new RuntimeException(
						"REMOVE: " +
						"El elemento no existe en el repositorio."); 
	}

	@Override
	public void update(Cliente elemento) {
		if(elemento != null)
			if(listado.contains(elemento)){ //Usa el equals
				listado.remove(elemento);
				listado.add(elemento); 
			}
			else 
				throw new RuntimeException(
						"UPDATE: " +
						"El elemento no existe en el repositorio."); 
	}
}//fin class repositorios.RepositoriosClienteArrayList
