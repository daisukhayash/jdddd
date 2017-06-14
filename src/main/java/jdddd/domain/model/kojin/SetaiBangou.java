package jdddd.domain.model.kojin;

import org.apache.commons.lang3.Validate;
import jdddd.domain.shared.AbstractValueObject;

public class SetaiBangou extends AbstractValueObject {

	private String value;
	
	public SetaiBangou(String value) {
		super();
		setValue(value);
	}
	
	private void setValue(String value) {
		Validate.notNull(value);
		Validate.isTrue(value.length() == 10);
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
