package dev.linblackberry;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SieveOfEratosthenes implements PrimeNumberGenerator {
	private Logger logger = LoggerFactory.getLogger("eratosthenes");

	@Override
	public int[] primes(int n) {
		logger.trace("Entering primes method. Generating {} prime numbers...", n);
		Boolean[] arePrime = new Boolean[n];
		Arrays.fill(arePrime, true);

		logger.debug("Loop length: {}", (int) Math.sqrt(n));
		for (int i = 2; i <= Math.sqrt(n); i++) {
			logger.debug("Index: {}", i - 1);
			if (arePrime[i - 1] == true) {
				int j = (int) Math.pow(i, 2);

				while (j <= n) {
					arePrime[j - 1] = false;
					logger.debug("isPrime set to FALSE: j is {}", j);
					j += i;
				}
			}
		}

		int[] primes = new int[(int) Arrays.stream(arePrime).filter(b -> b == true).count()];
		int index = 0;

		for (int i = 0; i < arePrime.length; i++) {
			if (arePrime[i] == true) {
				primes[index] = i + 1;
				index += 1;
			}
		}
		logger.trace("Exiting primes method with prime values {}", primes);

		return primes;
	}

}
