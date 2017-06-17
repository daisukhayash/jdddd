package jdddd.domain.model.kojin;

import java.util.stream.Collectors;

import jdddd.domain.shared.AbstractValueObject;

public class Simei extends AbstractValueObject {

	private String 漢字氏名;
	private String 英字氏名;
	private String 通称;
	private String 氏名優先区分;

	public Simei(String 漢字氏名, String 英字氏名, String 通称, String 氏名優先区分) {
		this.漢字氏名 = 漢字氏名;
		this.英字氏名 = 英字氏名;
		this.通称 = 通称;
		this.氏名優先区分 = 氏名優先区分;
	}

	public String 漢字氏名() {
		return this.漢字氏名;
	}

	public String 英字氏名() {
		return this.英字氏名;
	}

	public String 通称() {
		return this.通称;
	}

	public String 氏名優先区分() {
		return this.氏名優先区分;
	}

	public String 漢字氏() {
		String[] arr = 漢字氏名.split("　+");
		return arr[0];
	}

	public String 漢字名() {
		String[] arr = 漢字氏名.split("　+");
		return arr[arr.length - 1];
	}

	private String 半角英字氏名() {
		return convFullToHalfAlphaNum(英字氏名());
	}

	private String convFullToHalfAlphaNum(String str) {
		if (str == null) {
			return null;
		}

		return str.chars().mapToObj(c -> {
			if (c >= 0xFF10 && c <= 0xFF19 || c >= 0xFF21 && c <= 0xFF3A || c >= 0xFF41 && c <= 0xFF5A) {
				return c - 0xFEE0;
			}
			if (c == 0x3000) {
				return 0x0020;
			}
			return c;
		}).map(i -> {
			String s = String.valueOf((char) i.intValue());
			return s;
		}).collect(Collectors.joining());
	}

	public String get一行編集() {
		StringBuilder sb = new StringBuilder();
		sb.append(半角英字氏名());
		if (sb.length() > 0) {
			sb.append(" ");
		}
		sb.append(漢字氏名());
		return sb.toString();
	}
}