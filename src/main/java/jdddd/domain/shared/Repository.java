package jdddd.domain.shared;

import java.util.Collection;

public interface Repository<T extends Entity<T>> {

	T findById(EntityIdentifier<T> identifier);

	Collection<T> findAll();

	boolean exists(EntityIdentifier<T> identifier);

	boolean exists(T entity);

	long count();

	void save(T entity);

	void remove(EntityIdentifier<T> identifier);

	void remove(T entity);

}
