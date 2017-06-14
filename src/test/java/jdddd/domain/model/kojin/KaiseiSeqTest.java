package jdddd.domain.model.kojin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KaiseiSeqTest {

	private KaiseiSeq target;

	@Before
	public void setUp() throws Exception {
		target = new KaiseiSeq(1);
	}

	@Test
	public void testToString() {
		assertEquals("001", target.toString());
	}

	@Test
	public void testGetValue() {
		assertEquals(1, target.getValue());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(new KaiseiSeq(1), target);
		assertNotEquals(new KaiseiSeq(2), target);
	}
}
