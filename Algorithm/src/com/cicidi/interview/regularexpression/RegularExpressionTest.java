package com.cicidi.interview.regularexpression;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegularExpressionTest {
	RegularExpression re;

	@Test
	public void test() {
		this.re = new RegularExpression();
		assertFalse("String length = 8", re.run("good"));
		assertFalse("String length = 24", re.run("good#Password2good#Pass"));
		assertFalse("no_upper_case", re.run("good#password2"));
		assertFalse("NO_LOWER_CASE", re.run("GOOD#PASSWORD2"));
		assertFalse("NO SPECIAL CHARACTER", re.run("goodPassword2"));
		assertFalse("No_Digtal", re.run("good#Password"));
		assertTrue("good#Password2", re.run("good#Password2"));

	}

}
