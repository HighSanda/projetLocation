package projet_agence_location.dao;

import java.util.ArrayList;
import java.util.List;

public interface IManagerDao<T> {
	
	T addObject (T Obj);
	T updateObject(T Obj);
	boolean deleteObject(T Obj);
	boolean resetTable(T Obj);
	
	T findById(Class<?> clazz,Long id);
	public ArrayList<T> findAll(Class<?> clazz);
	void formatList(List<T> l);
}