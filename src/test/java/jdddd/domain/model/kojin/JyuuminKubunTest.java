package jdddd.domain.model.kojin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JyuuminKubunTest {

	@Test
	public void testCode() {
		assertEquals("0", JyuuminKubun.日本人.code());
		assertEquals("1", JyuuminKubun.外国人.code());
	}

}
