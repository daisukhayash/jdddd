package jdddd.domain.shared;

public class ValidationError extends AbstractValueObject {

	private String message;
	private String property;

	public ValidationError(String message, String property) {
		this.message = message;
		this.property = property;
	}

	public String message() {
		return this.message;
	}

	public String property() {
		return this.property;
	}
}
