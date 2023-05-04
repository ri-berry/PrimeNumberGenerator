package dev.linblackberry;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestSieveOfEratoSthenes {

	private SieveOfEratosthenes sieve = new SieveOfEratosthenes();

	List<Integer> correctPrimesTo100 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
			43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 5, 10, 12, 15, 20, 25, 30, 35, 40, 50, 60, 70, 80, 90, 100 })
	void testCorrectArrayOfPrimesAreReturned(int value) {
		System.out.println("Here1");
		int[] expectedArray = correctPrimesTo100.stream().filter(i -> i <= value).mapToInt(i -> i).toArray();
		System.out.println("Here2");
		assertArrayEquals(expectedArray, sieve.primes(value));
		System.out.println("Here3");
	}

}
