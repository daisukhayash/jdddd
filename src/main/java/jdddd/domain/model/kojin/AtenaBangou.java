package jdddd.domain.model.kojin;

import org.apache.commons.lang3.Validate;
import jdddd.domain.shared.AbstractValueObject;

public class AtenaBangou extends AbstractValueObject {
	
	private String value;

	public AtenaBangou(String value) {
		super();
		this.setValue(value);
	}
	
	private void setValue(String value) {
		Validate.notNull(value);
		Validate.isTrue(value.length() == 10);;
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
