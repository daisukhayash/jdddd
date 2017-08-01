package jdddd.domain.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidationResultTest {

	private ValidationResult target;
	private ValidationError err1 = new ValidationError("msg A", "propA");
	private ValidationError err2 = new ValidationError("msg B", "propB");

	@Before
	public void setUp() throws Exception {
		target = new ValidationResult();
	}

	@Test
	public void test() {
		assertTrue(target.isValid());
		assertEquals(0, target.errorCount());

		target.addError(err1);
		assertFalse(target.isValid());
		assertEquals(1, target.errorCount());
		assertEquals(err1, target.errors().get(0));

		target.addError(err2);
		assertFalse(target.isValid());
		assertEquals(2, target.errorCount());
		assertEquals(err1, target.errors().get(0));
		assertEquals(err2, target.errors().get(1));

		target.removeError(err1);
		assertFalse(target.isValid());
		assertEquals(1, target.errorCount());
		assertEquals(err2, target.errors().get(0));

	}

}
