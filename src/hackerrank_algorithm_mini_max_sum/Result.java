package hackerrank_algorithm_mini_max_sum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {
	public static void miniMaxSum(List<Integer> arr) {
		long minSum = 0;
		long maxSum = 0;

		Collections.sort(arr);

		for (int i = 0; i < arr.size() - 1; i++) {
			if (1 <= arr.get(i) && arr.get(i) <= Math.pow(10, 9)) {
				minSum += arr.get(i);
				maxSum += arr.get(i + 1);
			}
		}
		System.out.println(minSum + " " + maxSum);
	}

}
