package jdddd.domain.model.kojin;

import jdddd.domain.shared.Code;

public enum JuuminKubun implements Code {
	日本人("0"), //
	外国人("1"), //
	;

	private String code;

	private JuuminKubun(String code) {
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
