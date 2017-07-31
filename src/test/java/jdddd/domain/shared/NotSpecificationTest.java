package jdddd.domain.shared;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class NotSpecificationTest {

	@Mocked
	private Specification<Object> spec1;

	private Object obj;

	@Before
	public void setUp() throws Exception {
		obj = new Object();
	}

	@Test
	public void falseToTrue() {
		new Expectations() {
			{
				spec1.isSatisfiedBy(obj);
				result = false;
			}
		};
		assertFalse(spec1.isSatisfiedBy(obj));
		Specification<Object> target = new NotSpecification<>(spec1);
		assertTrue(target.isSatisfiedBy(obj));
	}

	@Test
	public void trueToFalse() {
		new Expectations() {
			{
				spec1.isSatisfiedBy(obj);
				result = true;
			}
		};
		assertTrue(spec1.isSatisfiedBy(obj));
		Specification<Object> target = new NotSpecification<>(spec1);
		assertFalse(target.isSatisfiedBy(obj));
	}

}
