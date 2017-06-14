package jdddd.domain.model.kojin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KojinTest {
	
	private Kojin kojin;

	@Before
	public void setUp() throws Exception {
		kojin = new Kojin(new AtenaBangou("1234567890"), new KaiseiSeq(0));
	}

	@Test
	public void test宛名番号() {
		assertEquals(new AtenaBangou("1234567890"), kojin.宛名番号());
	}
	
	@Test
	public void test改製ＳＥＱ() {
		assertEquals(new KaiseiSeq(0), kojin.改製ＳＥＱ());
	}
	
	@Test
	public void testEqualsObject() {
		assertEquals(new Kojin(new AtenaBangou("1234567890"), new KaiseiSeq(0)), kojin);
		assertNotEquals(new Object(), kojin);
		assertNotEquals(new Kojin(new AtenaBangou("1234567891"), new KaiseiSeq(0)), kojin);
		assertNotEquals(new Kojin(new AtenaBangou("1234567890"), new KaiseiSeq(1)), kojin);
		assertNotEquals(new Kojin(new AtenaBangou("1234567891"), new KaiseiSeq(1)), kojin);
	}
}
