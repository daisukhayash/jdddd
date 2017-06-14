package jdddd.domain.shared;

public interface Specification<T> {

	boolean isSatisfiedBy(T obj);
	
	Specification<T> and(Specification<T> spec);
	
	Specification<T> or(Specification<T> spec);
	
	Specification<T> not(Specification<T> spec);
}
