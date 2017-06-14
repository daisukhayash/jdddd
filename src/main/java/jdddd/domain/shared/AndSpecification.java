package jdddd.domain.shared;

public class AndSpecification<T> extends AbstractSpecification<T> {

	private Specification<T> spec1;
	private Specification<T> spec2;
	
	public AndSpecification(Specification<T> spec1, Specification<T> spec2) {
		super();
		this.spec1 = spec1;
		this.spec2 = spec2;
	}

	@Override
	public boolean isSatisfiedBy(T obj) {
		return this.spec1.isSatisfiedBy(obj) && this.spec2.isSatisfiedBy(obj);
	}
}
