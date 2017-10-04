package jdddd.domain.model.common;

import static org.junit.Assert.assertEquals;

import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.bechte.junit.runners.context.HierarchicalContextRunner;

@RunWith(HierarchicalContextRunner.class)
public class DefaultGyoumuDateTest {

	public static class TestBase {
		protected DefaultGyoumuDate date;

	}

	public class 通常日付テスト extends TestBase {
		@Before
		public void setUp() throws Exception {
			date = DefaultGyoumuDate.of(2017, 12, 31);
		}

		@Test
		public void testDefaultGyoumuDateMyJapaneseEraIntIntInt() {
			DefaultGyoumuDate date = DefaultGyoumuDate.of(MyJapaneseEra.of(3), 45, 1, 2);
			assertEquals(MyJapaneseEra.SHOWA, date.元号());
			assertEquals(45, date.和暦年());
			assertEquals(1970, date.西暦年());
			assertEquals(1, date.月());
			assertEquals(2, date.日());
		}

		@Test
		public void testDefaultGyoumuDateIntIntInt() {
			DefaultGyoumuDate date = DefaultGyoumuDate.of(1970, 1, 2);
			assertEquals(MyJapaneseEra.SHOWA, date.元号());
			assertEquals(45, date.和暦年());
			assertEquals(1970, date.西暦年());
			assertEquals(1, date.月());
			assertEquals(2, date.日());
		}

		@Test
		public void testDefaultGyoumuDateParseYYYYMMDD() {
			DefaultGyoumuDate date = DefaultGyoumuDate.parseYYYYMMDD("19791008");
			assertEquals(1979, date.西暦年());
			assertEquals(10, date.月());
			assertEquals(8, date.日());
		}

		@Test
		public void testDefaultGyoumuDateParseGYYMMDD() {
			DefaultGyoumuDate date = DefaultGyoumuDate.parseGYYMMDD("3541008");
			assertEquals(1979, date.西暦年());
			assertEquals(10, date.月());
			assertEquals(8, date.日());
		}

		@Test
		public void test和暦年月日() {
			assertEquals("4291231", date.和暦年月日());
		}

		@Test
		public void test西暦年月日() {
			assertEquals("20171231", date.西暦年月日());
		}

		@Test
		public void test和暦年() {
			assertEquals(29, date.和暦年());
		}

		@Test
		public void test西暦年() {
			assertEquals(2017, date.西暦年());
		}

		@Test
		public void test月() {
			assertEquals(12, date.月());
		}

		@Test
		public void test日() {
			assertEquals(31, date.日());
		}

		@Test
		public void testPlusYears() {
			DefaultGyoumuDate plused = date.plusYears(3);
			assertEquals(2020, plused.西暦年());
			assertEquals(date.月(), plused.月());
			assertEquals(date.日(), plused.日());
		}

		@Test
		public void testPlusMonths() {
			DefaultGyoumuDate plused = date.plusMonths(3);
			assertEquals(2018, plused.西暦年());
			assertEquals(3, plused.月());
			assertEquals(date.日(), plused.日());
		}

		@Test
		public void testPlusDays() {
			DefaultGyoumuDate plused = date.plusDays(3);
			assertEquals(2018, plused.西暦年());
			assertEquals(1, plused.月());
			assertEquals(3, plused.日());
		}

		@Test
		public void testFormat() {
			assertEquals("2017年12月31日", date.format(DateTimeFormatter.ofPattern("uuuu年MM月dd日")));
			assertEquals("2017.12.31", date.format(DateTimeFormatter.ofPattern("uuuu.MM.dd")));
			assertEquals("平成29年12月31日", date.format(DateTimeFormatter.ofPattern("Gyy年MM月dd日")));
			assertEquals("H29.12.31", date.format(DateTimeFormatter.ofPattern("GGGGGyy.MM.dd")));
		}

		@Test
		public void test全角和暦編集() {
			assertEquals("平成２９年１２月３１日", date.全角和暦編集());
		}

		@Test
		public void test半角和暦編集() {
			assertEquals("H29.12.31", date.半角和暦編集());
		}

		@Test
		public void testIs不詳() {
			assertEquals(false, date.is不詳());
		}

		@Test
		public void testIs年月日不詳() {
			assertEquals(false, date.is年月日不詳());
		}

		@Test
		public void testIs月日不詳() {
			assertEquals(false, date.is月日不詳());
		}

		@Test
		public void testIs日不詳() {
			assertEquals(false, date.is日不詳());
		}
	}

}
