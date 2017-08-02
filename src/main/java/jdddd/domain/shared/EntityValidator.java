package jdddd.domain.shared;

public interface EntityValidator<E> {

	ValidationResult validate(E entity);

}
