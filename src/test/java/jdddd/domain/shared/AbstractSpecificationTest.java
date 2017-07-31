package jdddd.domain.shared;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AbstractSpecificationTest {
	private class TestAbstractSpecification extends AbstractSpecification<Object> {

		@Override
		public boolean isSatisfiedBy(Object obj) {
			return false;
		}

	}

	private TestAbstractSpecification target;

	@Before
	public void setUp() throws Exception {
		target = new TestAbstractSpecification();
	}

	@Test
	public void testIsSatisfiedBy() {
		assertFalse(target.isSatisfiedBy(new Object()));
	}

	@Test
	public void testAnd() {
		assertTrue(target.and(target) instanceof AndSpecification);
	}

	@Test
	public void testOr() {
		assertTrue(target.or(target) instanceof OrSpecification);
	}

	@Test
	public void testNot() {
		assertTrue(target.not() instanceof NotSpecification);
	}

}
