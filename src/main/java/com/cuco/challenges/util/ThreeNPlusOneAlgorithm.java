package com.cuco.challenges.util;

/**
 * 
 * @author josorio
 *
 */
public class ThreeNPlusOneAlgorithm {
	private static long MIN_N_VALUE = 1;
	private static long MAX_N_VALUE = 999999;
	/**
	 * 
	 * @param n
	 * @return
	 */
	public long calcCycleLength(long n) {
		long cycleLength = 1;
		if(n < MIN_N_VALUE || n > MAX_N_VALUE) {
			cycleLength = -1;
		} else {
			while(n != 1) {
				++ cycleLength;
				if(n % 2 == 0) {
					n = n/2;
				} else {
					n = 3*n + 1;
				}
			}
		}
		return cycleLength;
	}
	/**
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	public long calcMaxCycleLength(long from, long to) {
		long maxCycleLength = -1;
		if(from > to) {
			long aux = from;
			from = to;
			to = aux;
		}
		for(long i=from; i<=to; ++i) {
			long cycleLength = calcCycleLength(i);
			if(cycleLength < 0 ) {
				maxCycleLength = -1;
				break;
			}
			if(maxCycleLength < cycleLength) {
				maxCycleLength = cycleLength;
			}
		}
		return maxCycleLength;
	}
}
