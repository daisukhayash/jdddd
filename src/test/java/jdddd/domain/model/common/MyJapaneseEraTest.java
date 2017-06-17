package jdddd.domain.model.common;

import static org.junit.Assert.*;

import java.time.chrono.JapaneseEra;

import org.junit.Before;
import org.junit.Test;

public class MyJapaneseEraTest {

	private MyJapaneseEra era;
	
	@Before
	public void setUp() throws Exception {
		era = MyJapaneseEra.HEISEI;
	}

	@Test
	public void testOf() {
		MyJapaneseEra test = MyJapaneseEra.of(4);
		assertEquals(era, test);
	}

	@Test
	public void testFrom() {
		MyJapaneseEra test = MyJapaneseEra.from(JapaneseEra.HEISEI);
		assertEquals(era, test);
	}

	@Test
	public void testToJapaneseEra() {
		assertEquals(JapaneseEra.HEISEI, era.toJapaneseEra());
	}

	@Test
	public void testValues() {
		MyJapaneseEra[] expected = {MyJapaneseEra.MEIJI, MyJapaneseEra.TAISHO, MyJapaneseEra.SHOWA, MyJapaneseEra.HEISEI};
		assertArrayEquals(expected, MyJapaneseEra.values());
	}

	@Test
	public void testGetNumericValue() {
		assertEquals(4, era.getNumericValue());
		assertEquals(1, MyJapaneseEra.MEIJI.getNumericValue());
		assertEquals(2, MyJapaneseEra.TAISHO.getNumericValue());
		assertEquals(3, MyJapaneseEra.SHOWA.getNumericValue());
		assertEquals(4, MyJapaneseEra.HEISEI.getNumericValue());
	}

	@Test
	public void testGetAlphabeticalValue() {
		assertEquals("H", era.getAlphabeticalValue());
		assertEquals("M", MyJapaneseEra.MEIJI.getAlphabeticalValue());
		assertEquals("T", MyJapaneseEra.TAISHO.getAlphabeticalValue());
		assertEquals("S", MyJapaneseEra.SHOWA.getAlphabeticalValue());
		assertEquals("H", MyJapaneseEra.HEISEI.getAlphabeticalValue());
	}

}
