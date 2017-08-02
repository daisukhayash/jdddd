package jdddd.domain.shared;

import java.util.HashMap;
import java.util.Map;

public abstract class EntityValidatorBase<T> implements EntityValidator<T> {

	private Map<String, ValidationRule<T>> validations;

	public EntityValidatorBase() {
		this.validations = new HashMap<>();
	}

	public void addValidation(String ruleName, ValidationRule<T> validationRule) {
		this.validations.put(ruleName, validationRule);
	}

	public void removeValidation(String ruleName) {
		if (this.validations.containsKey(ruleName)) {
			this.validations.remove(ruleName);
		}
	}

	public ValidationResult validate(T entity) {
		ValidationResult result = new ValidationResult();
		for (Map.Entry<String, ValidationRule<T>> entry : validations.entrySet()) {
			ValidationRule<T> rule = entry.getValue();
			if (!rule.validate(entity)) {
				result.addError(new ValidationError(rule.message(), rule.property()));
			}
		}
		return result;
	}
}
