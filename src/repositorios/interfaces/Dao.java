package repositorios.interfaces;

import java.util.List;

public interface Dao<T> {
	T get(int codigo); 
	List<T> get();
	void add(T elemento); 
	void remove(T elemento); 
	void update(T elemento); 
}//fin interface repositorios.interface.Dao
