package jdddd.domain.shared;

public class DefaultValidationRule<T> extends SpecificationRuleBase<T> implements ValidationRule<T> {

	private String message;
	private String property;

	public DefaultValidationRule(Specification<T> specification, String message, String property) {
		super(specification);
		this.message = message;
		this.property = property;
	}

	@Override
	public String message() {
		return this.message;
	}

	@Override
	public String property() {
		return this.property;
	}

	@Override
	public boolean validate(T entity) {
		return isSatisfied(entity);
	}
}
