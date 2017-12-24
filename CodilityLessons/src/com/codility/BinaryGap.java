package com.codility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BinaryGap {

	public static void main(String[] args) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		boolean flag = false;
		int zeroCount = 0;
		int counter = 0;
		char[] binaryRep = "10000010001".toCharArray();

		for (int i = 0; i < binaryRep.length; i++) {

			if (binaryRep[i] == '1' && !flag) {
				flag = true;
			} else if (binaryRep[i] == '1' && flag) {
				m.put(counter++, zeroCount);
				zeroCount = 0;
			} else if (flag) {
				zeroCount++;
			}

		}

		System.out.println  (Collections.max(m.values()));
	}

}
