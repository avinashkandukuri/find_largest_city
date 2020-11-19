package com.test.findlargestcity.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UtilTest {

	@Test
	public void testGetStateCodeByNameSuccess() throws Exception {
		String code = Util.getStateCodeByName("Alabama");
		assertNotNull(code);
		assertEquals("AL", code);
	}

	@Test(expected = Exception.class)
	public void testGetStateCodeByNameFailure() throws Exception {
		String code = Util.getStateCodeByName("");
		assertNull(code);
	}

}
