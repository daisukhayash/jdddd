package jdddd.domain.shared;

public abstract class AbstractSpecification<T> implements Specification<T> {

	@Override
	public abstract boolean isSatisfiedBy(T t);

	@Override
	public Specification<T> and(Specification<T> spec) {
		return new AndSpecification<T>(this, spec);
	}

	@Override
	public Specification<T> or(Specification<T> spec) {
		return new OrSpecification<T>(this, spec);
	}

	@Override
	public Specification<T> not() {
		return new NotSpecification<T>(this);
	}
}
