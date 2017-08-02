package jdddd.domain.shared;

public abstract class SpecificationRuleBase<T> {

	private Specification<T> specification;

	public SpecificationRuleBase(Specification<T> specification) {
		this.specification = specification;
	}

	public boolean isSatisfied(T entity) {
		return specification.isSatisfiedBy(entity);
	}
}
