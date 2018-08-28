package com.codility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Dominator {
	public int solution(int[] A) {

		int winningScore = A.length / 2;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < A.length; i++) {
			if (map.get(A[i]) == null)
				map.put(A[i], 1);
			else
				map.put(A[i], map.get(A[i]) + 1);

		}

		if (map.size() == 1)
			return map.entrySet().stream().filter(entry -> entry.getValue() != null).collect(Collectors.toList()).get(0)
					.getKey();

		List<Entry<Integer, Integer>> entries = map.entrySet().stream().filter(x -> x.getValue() > winningScore)
				.collect(Collectors.toList());
		int candidate = entries.size() > 0 ? entries.get(0).getKey() : -1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate)
				return i;
		}

		return -1;

	}
}
