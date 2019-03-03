package com.chaitanya.junits;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();

	@Test
	void sumWith3Numbers() {
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	void sumWith1Number1() {
		assertEquals(5, myMath.sum(new int[] { 5 }));
	}

	@Test
	void multipleTests() {
		assertAll("myMath", () -> assertEquals(6, myMath.sum(new int[] { 1, 2, 3 })),
				() -> assertEquals(5, myMath.sum(new int[] { 5 })));
	}

	@Test
	void checkTrue() {
		assertTrue(myMath.sum(new int[] { 1, 2, 3 }) == 6);
	}
}
