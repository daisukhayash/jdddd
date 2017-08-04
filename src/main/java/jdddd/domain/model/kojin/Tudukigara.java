package jdddd.domain.model.kojin;

import jdddd.domain.shared.Code;

public enum Tudukigara implements Code {
	本人("01"), //
	世帯主("02"), 準世帯主("03"), //
	夫("11"), 妻("12"), //
	夫_未届("13", "夫（未届）"), 妻_未届("14", "妻（未届）"), //
	子("20"), //
	父("51"), 母("52"), //
	兄("71"), 弟("74"), //
	姉("81"), 妹("84"), //
	使用人("98"), 同居人("99"), //
	;

	private String code;
	private String strictName;

	private Tudukigara(String code) {
		this.code = code;
	}

	private Tudukigara(String code, String strictName) {
		this.code = code;
		this.strictName = strictName;
	}

	@Override
	public String code() {
		return this.code;
	}

	public String strictName() {
		if (this.strictName != null) {
			return this.strictName;
		}
		return this.name();
	}

}
