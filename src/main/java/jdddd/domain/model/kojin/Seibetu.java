package jdddd.domain.model.kojin;

import jdddd.domain.shared.AbstractValueObject;

public class Seibetu extends AbstractValueObject {

	private final String[] 名称 = { "", "男", "女", "不明" };
	private String 性別コード;

	public Seibetu(String 性別コード) {
		this.性別コード = 性別コード;
	}

	public String 性別コード() {
		return this.性別コード;
	}

	public String 性別() {
		return this.名称[Integer.parseInt(this.性別コード())];
	}
}
