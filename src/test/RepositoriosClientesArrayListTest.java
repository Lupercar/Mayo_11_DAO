package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import entidades.Cliente;
import repositorios.RepositoriosClientesArrayList;
import repositorios.interfaces.Dao;

public class RepositoriosClientesArrayListTest {
	
	Dao<Cliente> repo; 
	
	@Before
	public void setUp() throws Exception {
//		Se ejecuta antes de cada test
		repo = new RepositoriosClientesArrayList();
	}

	@Test
	public void testGetInt() {
//		Obtener un cliente por codigo
		repo.add(new Cliente(1, "Pepito"));
		Cliente c = repo.get(1); 
		
		assertTrue("No funciona el get(int)",
				c.getCodigo() == 1 && c.getNombre().equals("Pepito"));
	}

	@Test
	public void testGet() {
//		Obtener toda la lista
		repo.add(new Cliente(1, "Pepito"));
		repo.add(new Cliente(2, "Manganito"));
		repo.add(new Cliente(3, "Juanito"));
		List<Cliente> lista = repo.get(); 
		
		Cliente c = lista.get(0); 
		assertTrue("No funciona el get()", 
				c.getCodigo() == 1 && c.getNombre().equals("Pepito"));
		
		c = lista.get(1); 
		assertTrue("No funciona el get()",
				c.getCodigo() == 2 && c.getNombre().equals("Manganito"));
		
		c = lista.get(2); 
		assertTrue("No funciona el get()",
				c.getCodigo() == 3 && c.getNombre().equals("Juanito"));
	}

	@Test
	public void testAdd() {
		//Add un cliente
		repo.add(new Cliente(1, "Pepito"));
		Cliente c = repo.get(1); 
		
		assertTrue("No funciona el add()", 
				c.getCodigo() == 1 && c.getNombre().equals("Pepito"));
	}

	@Test
	public void testRemove() {
		//eliminar un cliente
		Cliente c = new Cliente(1, "Pepito");
		repo.add(c);
		repo.remove(c);
		assertEquals("No funciona remove()", 0, repo.get().size());
	}

	@Test
	public void testUpdate() {
		//Actualizar un cliente
		Cliente c = new Cliente(1, "Pepito");
		repo.add(c);
		c.setNombre("Nombre2"); 
		repo.update(c);
		c = repo.get(1); 
		assertTrue("No funciona el update()", 
				c.getCodigo() == 1 && c.getNombre().equals("Nombre2"));
	}
}//fin class RepositoriosClientesArrayListTest
