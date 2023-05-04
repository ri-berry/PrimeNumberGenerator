package dev.linblackberry;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		PrimeNumberGenerator eratosthenes = new SieveOfEratosthenes();
//
//		for (int n = 1; n <= 100; n++) {
//			System.out.println(n + ", " + Arrays.toString(eratosthenes.primes(n)));
//		}
		System.out.println(Arrays.toString(eratosthenes.primes(50)));

	}

}
