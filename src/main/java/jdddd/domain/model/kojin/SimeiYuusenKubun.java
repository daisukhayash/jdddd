package jdddd.domain.model.kojin;

import jdddd.domain.shared.Code;

public enum SimeiYuusenKubun implements Code {
	英字氏名優先("0"), //
	漢字氏名優先("1"), //
	通称優先("2"), //
	;

	private String code;

	private SimeiYuusenKubun(String code) {
		this.code = code;
	}

	@Override
	public String code() {
		return this.code;
	}

	@Override
	public String label() {
		return this.name();
	}

}
