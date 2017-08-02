package jdddd.domain.shared;

public interface ValidationRule<T> {

	String message();

	String property();

	boolean validate(T entity);
}
