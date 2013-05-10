package com.kprav.heap;

import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 
 * @author kprav
 * 
 */

public class MinPQTest {

	@Test
	public void minPQTest() throws Exception {
		try {
			MinPQ<Integer> pq = new MinPQ<Integer>(10);

			Integer[] a = new Integer[10];

			Random random = new Random();

			for (int i = 0; i < 10; i++) {
				a[i] = random.nextInt(100);
			}

			String array = "";

			for (int i = 0; i < 10; i++) {
				pq.insert(a[i]);
				array = array + a[i] + " ";
			}

			log.info("Original Array: " + array);

			array = "";

			for (int i = 0; i < 10; i++) {
				int max = pq.delMin();
				array = array + max + " ";
			}

			log.info("Min Order from PQ: " + array);
		} catch (Exception ex) {
			log.error("Caught Exception = " + ex.getMessage());
			StackTraceElement[] stackTrace = ex.getStackTrace();
			log.error(stackTrace.toString());
			for (StackTraceElement trace : stackTrace)
				log.error(trace.toString());
		}
	}

	private static final Logger log = Logger.getLogger(MinPQTest.class
			.getName());
}
