package jdddd.domain.model.kojin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import jdddd.domain.shared.ValidationError;
import jdddd.domain.shared.ValidationResult;

public class KojinValidatorTest {

	private KojinValidator target;

	@Before
	public void setUp() throws Exception {
		target = new KojinValidator();
	}

	@Test
	public void testValid() {
		Kojin kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0)).住民区分(JuuminKubun.日本人)
				.氏名(new Simei("漢字　氏名", "", "", SimeiYuusenKubun.漢字氏名優先)).性別(Seibetu.男).続柄(Tudukigara.世帯主).build();
		ValidationResult result = target.validate(kojin);
		assertTrue(result.isValid());
	}

	@Test
	public void testInvalid() {
		Kojin kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0)).住民区分(JuuminKubun.日本人)
				.氏名(new Simei("", "", "", SimeiYuusenKubun.漢字氏名優先)).性別(Seibetu.男).続柄(Tudukigara.妻).build();
		ValidationResult result = target.validate(kojin);
		assertFalse(result.isValid());
		assertEquals(2, result.errorCount());
		assertTrue(result.errors().contains(new ValidationError("日本人の氏名に誤りがあります", "Simei")));
		assertTrue(result.errors().contains(new ValidationError("性別と続柄の関連に誤りがあります", "Tudukigara")));
	}

}
