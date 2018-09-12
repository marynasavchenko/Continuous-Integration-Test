package com.abacuspro.ci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maryna Savchenko on 12.09.2018.
 */
public class CITest {
	private CI ci;

	@Before
	public void setUp() {
		ci = new CI();
	}

	@Test
	public void shouldPrintMessage() {
		assertEquals("Test", ci.printMessage());
	}


}
