package jdddd.domain.model.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

import jdddd.domain.shared.AbstractValueObject;

public class DefaultGyoumuDate extends AbstractValueObject implements GyoumuDate {

	private MyJapaneseEra 元号;
	private int 和暦年;
	private int 月;
	private int 日;

	public static DefaultGyoumuDate of(MyJapaneseEra 元号, int 和暦年, int 月, int 日) {
		JapaneseDate japaneseDate = JapaneseDate.of(元号.toJapaneseEra(), 和暦年, 月, 日);
		return from(japaneseDate);
	}

	public static DefaultGyoumuDate of(int 西暦年, int 月, int 日) {
		JapaneseDate japaneseDate = JapaneseDate.of(西暦年, 月, 日);
		return from(japaneseDate);
	}

	public static DefaultGyoumuDate parseYYYYMMDD(String 年月日) {
		return of(Integer.parseInt(年月日.substring(0, 4)), Integer.parseInt(年月日.substring(4, 6)),
				Integer.parseInt(年月日.substring(6, 8)));
	}

	public static DefaultGyoumuDate parseGYYMMDD(String 年月日) {
		return of(MyJapaneseEra.valueOf(年月日.substring(0, 1)), Integer.parseInt(年月日.substring(1, 3)),
				Integer.parseInt(年月日.substring(3, 5)), Integer.parseInt(年月日.substring(5, 7)));
	}

	public static DefaultGyoumuDate from(TemporalAccessor temporalAccessor) {
		if (!(temporalAccessor instanceof JapaneseDate)) {
			temporalAccessor = JapaneseDate.from(temporalAccessor);
		}
		return new DefaultGyoumuDate(MyJapaneseEra.from(JapaneseEra.of(temporalAccessor.get(ChronoField.ERA))),
				temporalAccessor.get(ChronoField.YEAR_OF_ERA), temporalAccessor.get(ChronoField.MONTH_OF_YEAR),
				temporalAccessor.get(ChronoField.DAY_OF_MONTH));
	}

	private DefaultGyoumuDate(MyJapaneseEra 元号, int 和暦年, int 月, int 日) {
		this.set元号(元号);
		this.set和暦年(和暦年);
		this.set月(月);
		this.set日(日);
	}

	@Override
	public String 和暦年月日() {
		return String.format("%d%2d%2d%2d", this.元号().getNumericValue(), this.和暦年(), this.月(), this.日());
	}

	@Override
	public String 西暦年月日() {
		return this.format(DateTimeFormatter.ofPattern("uuuuMMdd"));
	}

	@Override
	public MyJapaneseEra 元号() {
		return this.元号;
	}

	@Override
	public int 和暦年() {
		return this.和暦年;
	}

	@Override
	public int 西暦年() {
		return this.toJapaneseDate().get(ChronoField.YEAR);
	}

	@Override
	public int 月() {
		return this.月;
	}

	@Override
	public int 日() {
		return this.日;
	}

	@Override
	public DefaultGyoumuDate plusYears(int 年数) {
		LocalDate date = this.toLocalDate().plus(Period.of(年数, 0, 0));
		return DefaultGyoumuDate.from(date);
	}

	@Override
	public DefaultGyoumuDate plusMonths(int 月数) {
		LocalDate date = this.toLocalDate().plus(Period.of(0, 月数, 0));
		return DefaultGyoumuDate.from(date);
	}

	@Override
	public DefaultGyoumuDate plusDays(int 日数) {
		LocalDate date = this.toLocalDate().plus(Period.of(0, 0, 日数));
		return DefaultGyoumuDate.from(date);
	}

	@Override
	public String format(DateTimeFormatter formatter) {
		// return JapaneseDate.of(this.元号().toJapaneseEra(),this.西暦年(),
		// this.月(), this.日()).format(formatter);
		JapaneseDate date = JapaneseDate.of(this.元号().toJapaneseEra(), this.和暦年(), this.月(), this.日());
		String string = date.format(formatter);
		return string;
	}

	@Override
	public String 全角和暦編集() {
		return this.format(DateTimeFormatter.ofPattern("GGGGyy年MM月dd日"));
	}

	@Override
	public String 半角和暦編集() {
		return this.format(DateTimeFormatter.ofPattern("GGGGGyy.MM.dd"));
	}

	@Override
	public boolean is不詳() {
		return this.is年月日不詳() || is月日不詳() || is日不詳();
	}

	@Override
	public boolean is年月日不詳() {
		return this.和暦年() == 99 ? true : false;
	}

	@Override
	public boolean is月日不詳() {
		return this.月() == 99 ? true : false;
	}

	@Override
	public boolean is日不詳() {
		return this.日() == 99 ? true : false;
	}

	private LocalDate toLocalDate() {
		return LocalDate.of(this.西暦年(), this.月(), this.日());
	}

	private JapaneseDate toJapaneseDate() {
		return JapaneseDate.of(this.元号().toJapaneseEra(), this.和暦年(), this.月(), this.日());
	}

	private void set元号(MyJapaneseEra 元号) {
		this.元号 = 元号;
	}

	private void set和暦年(int 和暦年) {
		this.和暦年 = 和暦年;
	}

	private void set月(int 月) {
		this.月 = 月;
	}

	private void set日(int 日) {
		this.日 = 日;
	}
}
