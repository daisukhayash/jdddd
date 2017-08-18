package jdddd.domain.model.kojin;

import jdddd.domain.shared.Code;

public enum MemoType implements Code {
	処理可能("0"), //
	異動停止("1"), //
	発行停止("2"), //
	異動発行停止("3"), //
	処理注意("9"), //
	;

	private String code;

	private MemoType(String code) {
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
