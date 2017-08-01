package jdddd.domain.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class ValidationErrorTest {

	private ValidationError target;

	@Before
	public void setUp() throws Exception {
		target = new ValidationError("message A", "propertyA");
	}

	@Test
	public void testMessage() {
		assertEquals("message A", target.message());
	}

	@Test
	public void testProperty() {
		assertEquals("propertyA", target.property());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(new ValidationError("message A", "propertyA"), target);
		assertNotEquals(new ValidationError("message B", "propertyA"), target);
		assertNotEquals(new ValidationError("message A", "propertyB"), target);
	}

}
