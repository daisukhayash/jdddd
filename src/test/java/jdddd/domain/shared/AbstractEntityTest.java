package jdddd.domain.shared;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class AbstractEntityTest {
	private class TestAbstractEntity extends AbstractEntity<TestAbstractEntity> {

		private int intField;
		private String stringField;

		public TestAbstractEntity(EntityIdentifier<TestAbstractEntity> identifier, int intField, String stringField) {
			super(identifier);
			this.intField = intField;
			this.stringField = stringField;
		}

		public int intField() {
			return this.intField;
		}

		public String stringField() {
			return this.stringField;
		}

		public void setIntField(int intField) {
			this.intField = intField;
		}

		public void setStringField(String stringField) {
			this.stringField = stringField;
		}
	}

	private TestAbstractEntity target;

	@Before
	public void setUp() throws Exception {
		target = new TestAbstractEntity(new DefaultEntityIdentifier<>(UUID.nameUUIDFromBytes("testId".getBytes())), 123,
				"Abc");
	}

	@Test
	public void testGetIdentifier() {
		assertEquals(new DefaultEntityIdentifier<>(UUID.nameUUIDFromBytes("testId".getBytes())),
				target.getIdentifier());
	}

	@Test
	public void testEqualsObject() throws CloneNotSupportedException {
		TestAbstractEntity other = target.clone();
		other.setIntField(456);
		other.setStringField("Xyz");
		assertEquals(other, target);
	}

}
