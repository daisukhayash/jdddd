package jdddd.domain.shared;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {

	private List<ValidationError> errors;

	public ValidationResult() {
		this.errors = new ArrayList<ValidationError>();
	}

	public boolean isValid() {
		return errors.size() == 0 ? true : false;
	}

	public int errorCount() {
		return errors.size();
	}

	public List<ValidationError> errors() {
		return this.errors;
	}

	public void addError(ValidationError error) {
		this.errors.add(error);
	}

	public void addError(String message, String property) {
		this.errors.add(new ValidationError(message, property));
	}

	public void removeError(ValidationError error) {
		if (this.errors.contains(error)) {
			this.errors.remove(error);
		}
	}

}
