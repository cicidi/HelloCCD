package com.cicidi.interview.simple.calculation;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class RateTest {

	@Test
	public void test() {
		Rate rate = new Rate();
		// assertEquals(60000.0, rate.calculatePremium(250000));
		assertEquals(60000, rate.calculatePremium(250000));
		assertEquals(250000, rate.getPrice(60000));
	}
}
