package jdddd.domain.model.kojin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AtenaBangouTest {

	private AtenaBangou target;

	@Before
	public void setUp() throws Exception {
		target = new AtenaBangou("0123456789");
	}

	@Test
	public void testToString() {
		assertEquals("0123456789", target.toString());
	}

	@Test
	public void testGetValue() {
		assertEquals("0123456789", target.getValue());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(new AtenaBangou("0123456789"), target);
		assertNotEquals(new AtenaBangou("1123456789"), target);
	}
}
