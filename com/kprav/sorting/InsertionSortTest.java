package com.kprav.sorting;

import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 
 * @author kprav
 * 
 */

public class InsertionSortTest {

	@Test
	public void insertionSortTest() throws Exception {
		try {
			Integer[] a = new Integer[10];

			Random random = new Random();

			for (int i = 0; i < 10; i++) {
				a[i] = random.nextInt(100);
			}

			String array = "";

			for (int i = 0; i < 10; i++)
				array = array + a[i] + " ";

			log.info("Before Insertion Sorting: " + array);

			Insertion.sort(a);

			array = "";

			for (int i = 0; i < 10; i++)
				array = array + a[i] + " ";

			log.info("After Insertion Sorting: " + array);
		} catch (Exception ex) {
			log.error("Caught Exception = " + ex.getMessage());
			StackTraceElement[] stackTrace = ex.getStackTrace();
			log.error(stackTrace.toString());
			for (StackTraceElement trace : stackTrace)
				log.error(trace.toString());
		}
	}

	private static final Logger log = Logger.getLogger(InsertionSortTest.class
			.getName());
}
