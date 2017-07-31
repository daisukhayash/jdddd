package jdddd.domain.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AbstractValueObjectTest {
	private class TestValueObject extends AbstractValueObject {

		private int intField;
		private String stringField;

		public TestValueObject(int intField, String stringField) {
			this.intField = intField;
			this.stringField = stringField;
		}

		public int intField() {
			return this.intField;
		}

		public String stringField() {
			return this.stringField;
		}
	}

	private TestValueObject target;

	@Before
	public void setUp() throws Exception {
		target = new TestValueObject(123, "Abc");
	}

	@Test
	public void testEqualsObject() {
		TestValueObject other = new TestValueObject(123, "Abc");
		assertTrue(other != target);
		assertEquals(other, target);
	}

}
