package dao;

import java.util.List;

public interface IDao<K,O> {
	public List<O> getAll();
	public O getById(K id);
	public List<O> search(String name);
	public boolean insert(O object);
	public boolean update(O object);
	public boolean delete(K id);
}
