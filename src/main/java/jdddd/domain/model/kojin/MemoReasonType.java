package jdddd.domain.model.kojin;

import jdddd.domain.shared.Code;

public enum MemoReasonType implements Code {
	処理可能("00"), //
	本人の申出("01"), //
	成年被後見人("03"), //
	実態調査中("10"), //
	ＤＶ("20") {
		@Override
		public boolean is支援措置() {
			return true;
		}
	}, //
	ストーカー("21") {
		@Override
		public boolean is支援措置() {
			return true;
		}
	}, //
	児童虐待("22") {
		@Override
		public boolean is支援措置() {
			return true;
		}
	}, //
	支援措置その他("23") {
		@Override
		public boolean is支援措置() {
			return true;
		}
	}, //
	その他("99"), //
	;

	private String code;

	private MemoReasonType(String code) {
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

	public boolean is支援措置() {
		return false;
	}

}
