package jdddd.domain.model.kojin;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JuuminKubunTest {

	@Test
	public void testCode() {
		assertEquals("0", JuuminKubun.日本人.code());
		assertEquals("1", JuuminKubun.外国人.code());
	}

}
