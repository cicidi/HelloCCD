package com.cicidi.time.apple_screen;

import org.junit.Assert;
import org.junit.Test;

public class FightServeTimeTest {
	// suppose Row 1 is the coffee machine;
	// The fight attendant goes to Row 1 to refill the coffee
	@Test
	public void testStart() {
		FightServeTime action = new FightServeTime();
		Integer[] array1 = { 3 };
		Integer[] array2 = { 3, 4 };
		Integer[] array3 = { 3, 4, 5 };
		Integer[] array4 = { 3, 4, 5, 7 };
		Integer[] array5 = { 3, 4, 5, 7, 10 };
		Integer[] array6 = { 3, 4, 5, 7, 10, 13 };
		Integer[] array7 = { 3, 4, 5, 7, 10, 13, 20 };
		Integer[] array8 = { 3, 4, 5, 7, 10, 13, 20, 24 };
		Integer[] array9 = { 3, 4, 5, 7, 10, 13, 20, 24, 25 };
		action.init(array1);
		int result1 = action.start(action.getCurrentRow());
		action.init(array2);
		int result2 = action.start(action.getCurrentRow());
		action.init(array3);
		int result3 = action.start(action.getCurrentRow());
		action.init(array4);
		int result4 = action.start(action.getCurrentRow());
		action.init(array5);
		int result5 = action.start(action.getCurrentRow());
		action.init(array6);
		int result6 = action.start(action.getCurrentRow());
		action.init(array7);
		int result7 = action.start(action.getCurrentRow());
		action.init(array8);
		int result8 = action.start(action.getCurrentRow());
		action.init(array9);
		int result9 = action.start(action.getCurrentRow());

		int[] result = { result1, result2, result3, result4, result5, result6,
				result7, result8, result9 };
		// System.out.p
		int[] expect = { 7, 12, 17, 24, 33, 42, 59, 138, 143 };
		Assert.assertArrayEquals(expect, result);

	}
}
