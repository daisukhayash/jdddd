package jdddd.domain.model.kojin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JuuminKubunTest {

	@Test
	public void testCode() {
		assertEquals("0", JuuminKubun.日本人.code());
		assertEquals("1", JuuminKubun.外国人.code());
	}

	@Test
	public void testName() {
		assertEquals("日本人", JuuminKubun.日本人.name());
		assertEquals("外国人", JuuminKubun.外国人.name());
	}

}
