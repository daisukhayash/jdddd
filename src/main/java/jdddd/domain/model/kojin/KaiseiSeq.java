package jdddd.domain.model.kojin;

import jdddd.domain.shared.AbstractValueObject;

public class KaiseiSeq extends AbstractValueObject {

	private int value;

	public KaiseiSeq(int value) {
		super();
		this.setValue(value);
	}

	private void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return String.format("%03d", this.value);
	}
}
