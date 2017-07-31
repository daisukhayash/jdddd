package jdddd.domain.shared;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class AndSpecificationTest {

	@Mocked
	private Specification<Object> spec1;
	@Mocked
	private Specification<Object> spec2;

	private Object obj;

	@Before
	public void setUp() throws Exception {
		obj = new Object();
	}

	@Test
	public void falseAndFalseToFalse() {
		new Expectations() {
			{
				spec1.isSatisfiedBy(obj);
				result = false;
			}
		};
		new Expectations() {
			{
				spec2.isSatisfiedBy(obj);
				result = false;
			}
		};
		assertFalse(spec1.isSatisfiedBy(obj));
		assertFalse(spec2.isSatisfiedBy(obj));
		Specification<Object> target = new AndSpecification<>(spec1, spec2);
		assertFalse(target.isSatisfiedBy(obj));
	}

	@Test
	public void trueAndFalseToFalse() {
		new Expectations() {
			{
				spec1.isSatisfiedBy(obj);
				result = true;
			}
		};
		new Expectations() {
			{
				spec2.isSatisfiedBy(obj);
				result = false;
			}
		};
		assertTrue(spec1.isSatisfiedBy(obj));
		assertFalse(spec2.isSatisfiedBy(obj));
		Specification<Object> target = new AndSpecification<>(spec1, spec2);
		assertFalse(target.isSatisfiedBy(obj));
	}

	@Test
	public void falseAndTrueToFalse() {
		new Expectations() {
			{
				spec1.isSatisfiedBy(obj);
				result = false;
			}
		};
		new Expectations() {
			{
				spec2.isSatisfiedBy(obj);
				result = true;
			}
		};
		assertFalse(spec1.isSatisfiedBy(obj));
		assertTrue(spec2.isSatisfiedBy(obj));
		Specification<Object> target = new AndSpecification<>(spec1, spec2);
		assertFalse(target.isSatisfiedBy(obj));
	}

	@Test
	public void trueAndTrueToTrue() {
		new Expectations() {
			{
				spec1.isSatisfiedBy(obj);
				result = true;
			}
		};
		new Expectations() {
			{
				spec2.isSatisfiedBy(obj);
				result = true;
			}
		};
		assertTrue(spec1.isSatisfiedBy(obj));
		assertTrue(spec2.isSatisfiedBy(obj));
		Specification<Object> target = new AndSpecification<>(spec1, spec2);
		assertTrue(target.isSatisfiedBy(obj));
	}

}
