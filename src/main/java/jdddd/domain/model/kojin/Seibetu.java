package jdddd.domain.model.kojin;

import jdddd.domain.shared.Code;

public enum Seibetu implements Code {
	男("1"), //
	女("2"), //
	不明("3"), //
	;

	private String code;

	private Seibetu(String code) {
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
