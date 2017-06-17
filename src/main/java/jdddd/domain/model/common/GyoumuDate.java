package jdddd.domain.model.common;

import java.time.format.DateTimeFormatter;

import jdddd.domain.shared.ValueObject;

public interface GyoumuDate extends ValueObject {

	String 和暦年月日();
	String 西暦年月日();
	MyJapaneseEra 元号();
	int 和暦年();
	int 西暦年();
	int 月();
	int 日();

	GyoumuDate plusYears(int 年数);
	GyoumuDate plusMonths(int 月数);
	GyoumuDate plusDays(int 日数);

	String format(DateTimeFormatter dateTimeFormatter);
	String 全角和暦編集();
	String 半角和暦編集();
	
	boolean is不詳();
	boolean is年月日不詳();
	boolean is月日不詳();
	boolean is日不詳();
}
