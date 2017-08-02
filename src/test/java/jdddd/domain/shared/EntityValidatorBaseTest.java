package jdddd.domain.shared;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mockit.Expectations;
import mockit.Mocked;

public class EntityValidatorBaseTest {
	private class TestEntity extends AbstractEntity<TestEntity> {

		protected TestEntity(EntityIdentifier<TestEntity> identifier) {
			super(identifier);
		}
	}

	private class TestEntityValidator extends EntityValidatorBase<TestEntity> {
	}

	private TestEntityValidator target;

	@Mocked
	private TestEntity entity;
	@Mocked
	private Specification<TestEntity> spec1;
	@Mocked
	private Specification<TestEntity> spec2;

	@Before
	public void setUp() throws Exception {
		target = new TestEntityValidator();
	}

	@Test
	public void testValid() {
		new Expectations() {
			{
				spec1.isSatisfiedBy(withAny(entity));
				result = true;
			}
		};
		new Expectations() {
			{
				spec2.isSatisfiedBy(withAny(entity));
				result = true;
			}
		};

		target.addValidation("ruleName1", new DefaultValidationRule<>(spec1, "msg1", "prop1"));
		target.addValidation("ruleName2", new DefaultValidationRule<>(spec2, "msg2", "prop2"));
		ValidationResult result = target.validate(entity);
		assertTrue(result.isValid());
		assertEquals(0, result.errorCount());
	}

	@Test
	public void testInvalid() {
		new Expectations() {
			{
				spec1.isSatisfiedBy(withAny(entity));
				result = false;
			}
		};
		new Expectations() {
			{
				spec2.isSatisfiedBy(withAny(entity));
				result = false;
			}
		};
		target.addValidation("ruleName1", new DefaultValidationRule<>(spec1, "msg1", "prop1"));
		target.addValidation("ruleName2", new DefaultValidationRule<>(spec2, "msg2", "prop2"));
		ValidationResult result = target.validate(entity);
		assertFalse(result.isValid());
		assertEquals(2, result.errorCount());
		assertEquals("msg1", result.errors().get(0).message());
		assertEquals("prop1", result.errors().get(0).property());
		assertEquals("msg2", result.errors().get(1).message());
		assertEquals("prop2", result.errors().get(1).property());
	}

}
