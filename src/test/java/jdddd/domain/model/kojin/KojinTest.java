package jdddd.domain.model.kojin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class KojinTest {

	private Kojin kojin;

	@Before
	public void setUp() throws Exception {
		kojin = new Kojin.Builder(new AtenaBangou("1234567890"), new KaiseiSeq(0)).build();
	}

	@Test
	public void test宛名番号() {
		assertEquals(new AtenaBangou("1234567890"), kojin.宛名番号());
	}

	@Test
	public void test改製ＳＥＱ() {
		assertEquals(new KaiseiSeq(0), kojin.改製ＳＥＱ());
	}

	@Test
	public void testEqualsObject() {
		assertEquals(new Kojin.Builder(new AtenaBangou("1234567890"), new KaiseiSeq(0)).build(), kojin);
		assertNotEquals(new Object(), kojin);
		assertNotEquals(new Kojin.Builder(new AtenaBangou("1234567891"), new KaiseiSeq(0)).build(), kojin);
		assertNotEquals(new Kojin.Builder(new AtenaBangou("1234567890"), new KaiseiSeq(1)).build(), kojin);
		assertNotEquals(new Kojin.Builder(new AtenaBangou("1234567891"), new KaiseiSeq(1)).build(), kojin);
	}

	@Test
	public void test世帯番号() {
		kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0)).世帯番号(new SetaiBangou("2222222222"))
				.build();
		assertEquals(new SetaiBangou("2222222222"), kojin.世帯番号());
	}

	@Test
	public void test住民区分() {
		kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0)).住民区分(JuuminKubun.日本人).build();
		assertEquals(JuuminKubun.日本人, kojin.住民区分());
	}

	@Test
	public void test氏名() {
		kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0))
				.氏名(new Simei("漢字氏名", "英字氏名", "通称", "0")).build();
		assertEquals(new Simei("漢字氏名", "英字氏名", "通称", "0"), kojin.氏名());
	}

}
