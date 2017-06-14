package jdddd.domain.shared;

public class NotSpecification<T> extends AbstractSpecification<T> {

	private Specification<T> spec1;
	
	public NotSpecification(Specification<T> spec1) {
		super();
		this.spec1 = spec1;
	}

	@Override
	public boolean isSatisfiedBy(T obj) {
		return !this.spec1.isSatisfiedBy(obj);
	}
}
