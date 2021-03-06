package jdddd.domain.model.kojin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import jdddd.domain.model.common.DefaultGyoumuDate;

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
				.氏名(new Simei("漢字氏名", "英字氏名", "通称", SimeiYuusenKubun.英字氏名優先)).build();
		assertEquals(new Simei("漢字氏名", "英字氏名", "通称", SimeiYuusenKubun.英字氏名優先), kojin.氏名());
	}

	@Test
	public void test性別() {
		kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0)).性別(Seibetu.男).build();
		assertEquals(Seibetu.男, kojin.性別());
	}

	@Test
	public void test続柄() {
		kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0)).続柄(Tudukigara.世帯主).build();
		assertEquals(Tudukigara.世帯主, kojin.続柄());
		assertEquals("世帯主", kojin.続柄().label());
		kojin.set続柄(Tudukigara.夫_未届);
		assertEquals("夫（未届）", kojin.続柄().label());
	}

	@Test
	public void test個人メモ() {
		kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0)).build();
		assertEquals(0, kojin.個人メモ().size());
		KojinMemo memo1 = new KojinMemo(MemoType.異動停止, MemoReasonType.ＤＶ, DefaultGyoumuDate.of(2001, 1, 1),
				DefaultGyoumuDate.of(2001, 12, 31), "メモ１");
		KojinMemo memo2 = new KojinMemo(MemoType.処理注意, MemoReasonType.その他, DefaultGyoumuDate.of(2002, 2, 2),
				DefaultGyoumuDate.of(2002, 11, 30), "メモ２");
		kojin = new Kojin.Builder(new AtenaBangou("1111111111"), new KaiseiSeq(0)).個人メモ(memo1).build();
		assertEquals(1, kojin.個人メモ().size());
		assertEquals(memo1, kojin.個人メモ().get(0));
		kojin.add個人メモ(memo2);
		assertEquals(2, kojin.個人メモ().size());
		assertEquals(memo2, kojin.個人メモ().get(1));
	}
}
