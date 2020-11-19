package com.test.findlargestcity.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ServiceTest {
	
	private Service service = new Service();

	@Test
	public void testGetContentPositive() throws Exception {
		String message = service.getContent("AL");
		assertNotNull(message);
		assertEquals("State : Alabama, Largest City : Birmingham, Capital : Montgomery", message);
	}
	
	@Test
	public void testGetContentNegative1() throws Exception {
		String message = service.getContent("LL");
		assertNotNull(message);
		assertEquals("No matching state found for requested code [USA->LL].", message);
	}
	
	@Test(expected = Exception.class)
	public void testGetContentNegative2() throws Exception {
		service.getContent(" ");
	}

}
