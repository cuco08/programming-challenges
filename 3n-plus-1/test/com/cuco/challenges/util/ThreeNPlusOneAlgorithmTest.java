package com.cuco.challenges.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeNPlusOneAlgorithmTest {
	private static ThreeNPlusOneAlgorithm algorithm = new ThreeNPlusOneAlgorithm();
	
	@Test
	public void testCalcCycleLength_Nis1() {
		final long lengthCycle = algorithm.calcCycleLength(1);
		assertEquals(1, lengthCycle);
	}
	
	@Test
	public void testCalcCycleLength_Nis2() {
		final long lengthCycle = algorithm.calcCycleLength(2);
		assertEquals(2, lengthCycle);
	}
	
	@Test
	public void testCalcCycleLength_Nis18() {
		final long lengthCycle = algorithm.calcCycleLength(18);
		assertEquals(21, lengthCycle);
	}
	
	@Test
	public void testCalcCycleLength_Nis22() {
		final long lengthCycle = algorithm.calcCycleLength(22);
		assertEquals(16, lengthCycle);
	}

	@Test
	public void testCalcCycleLength_NisZero() {
		final long lengthCycle = algorithm.calcCycleLength(0);
		assertEquals(-1, lengthCycle);
	}
	
	@Test
	public void testCalcCycleLength_NisNegative() {
		final long lengthCycle = algorithm.calcCycleLength(-6);
		assertEquals(-1, lengthCycle);
	}
	
	@Test
	public void testCalcCycleLength_NisOutOfBounds() {
		final long lengthCycle = algorithm.calcCycleLength(1000000);
		assertEquals(-1, lengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From1To2() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(1, 2);
		assertEquals(2, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From1To22() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(1, 22);
		assertEquals(21, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From1To10() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(1, 10);
		assertEquals(20, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From100To200() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(100, 200);
		assertEquals(125, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From201To210() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(201, 210);
		assertEquals(89, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From900To1000() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(900, 1000);
		assertEquals(174, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From1000To900() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(1000, 900);
		assertEquals(174, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_FromNegativeTo900() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(-1, 900);
		assertEquals(-1, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From1ToNegative() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(1, -1);
		assertEquals(-1, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_FromNegativeToNegative() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(-1, -1);
		assertEquals(-1, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_OutOfBounds() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(1, 1000000);
		assertEquals(-1, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_FromMinToMax() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(1, 999999);
		assertEquals(525, maxLengthCycle);
	}
	
	@Test
	public void testCalcMaxCycleLength_From22To22() {
		final long maxLengthCycle = algorithm.calcMaxCycleLength(22, 22);
		assertEquals(16, maxLengthCycle);
	}
}
