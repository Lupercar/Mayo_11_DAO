package consola;

import entidades.Cliente;
import repositorios.RepositorioClientesLinkedList;
import repositorios.RepositoriosClientesArrayList;
import repositorios.interfaces.Dao;

public class App {

	public static void main(String[] args) {
		
		Dao<Cliente> repoClientes = new RepositorioClientesLinkedList(); 
		
		repoClientes.add(new Cliente(1, "Pepito")); 
		repoClientes.add(new Cliente(2, "Manganito")); 
		
		//listo todo el ArrayList
		System.out.println(repoClientes.get());
		
		//listo el elemento con codigo 2
		System.out.println("Cliente con codigo 2: " + repoClientes.get(2));
		
		//Modifico el elemento con codigo 2 y lo muestro
		repoClientes.update(new Cliente(2,"nombreModificado"));
		
		System.out.println("Cliente con codigo 2: " + repoClientes.get(2));
		
		//borro el elemento con codigo 1, nombre pepito y lo muestro
		repoClientes.remove(new Cliente(1,"Pepito"));
		
		System.out.println(repoClientes.get());
	}
}//fin class consola.App
