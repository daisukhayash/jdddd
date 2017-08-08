package jdddd.domain.shared;

import java.util.List;

public interface Repository<T extends Entity<T>> {

	T findById(EntityIdentifier<T> identifier);

	List<T> findAll();

	boolean exists(EntityIdentifier<T> identifier);

	boolean exists(T entity);

	long count(EntityIdentifier<T> identifier);

	void save(T entity);

	void delete(EntityIdentifier<T> identifier);

}
