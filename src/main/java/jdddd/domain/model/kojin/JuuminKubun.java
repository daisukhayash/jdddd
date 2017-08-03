package jdddd.domain.model.kojin;

import jdddd.domain.shared.Code;

public enum JyuuminKubun implements Code {
	日本人("0"), //
	外国人("1"), //
	;

	private String code;

	private JyuuminKubun(String code) {
		this.code = code;
	}

	@Override
	public String code() {
		return this.code;
	}

}
