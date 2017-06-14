package jdddd.domain.shared;

public class OrSpecification<T> extends AbstractSpecification<T> {

	private Specification<T> spec1;
	private Specification<T> spec2;
	
	public OrSpecification(Specification<T> spec1, Specification<T> spec2) {
		super();
		this.spec1 = spec1;
		this.spec2 = spec2;
	}

	@Override
	public boolean isSatisfiedBy(T obj) {
		return this.spec1.isSatisfiedBy(obj) || this.spec2.isSatisfiedBy(obj);
	}
}
