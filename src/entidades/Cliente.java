package entidades;

public class Cliente {
	private int codigo;
	private String nombre;
	
	public Cliente(){
		this(0, ""); 
	}
	
	public Cliente(int codigo, String nombre){
		super(); 
		setCodigo(codigo);
		setNombre(nombre);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente [Codigo= " + getCodigo() + 
				", Nombre= " + getNombre() + "]";
	}

	@Override
	public int hashCode() {
		return this.getCodigo() * 20; 
	}

	@Override
	public boolean equals(Object obj) {
		return this.getCodigo() == ((Cliente)obj).getCodigo(); 
	}
}//fin class entidades.Cliente
