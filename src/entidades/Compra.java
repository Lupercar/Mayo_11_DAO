package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	private int codigo;
	private Cliente cliente;
	private Date fecha; 
	List<Producto> productos = new ArrayList<>();
	
	public Compra(){
		this(0, new Cliente(0,""), new Date(),  (List<Producto>) new Producto(0, "", 0d));  
	}
	
	public Compra(int codigo, Cliente cliente, Date fecha, List<Producto> productos) {
		super();
		setCodigo(codigo);
		setCliente(cliente);
		setFecha(fecha);
		setProductos(productos);
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Compra [Codigo= " + getCodigo() + 
				",Cliente= " + getCliente() + 
				", Fecha= " + getFecha()
				+ "]";
	} 
}//fin class entidades.Cliente
