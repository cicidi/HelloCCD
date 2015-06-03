package com.cicidi.prime;

public class PrimeSieve {

	public static void main(String[] args) {
		int N = 121;
		boolean[] isPrime = new boolean[N + 1];
		for (int i = 2; i < N; i++) {
			isPrime[i] = true;
		}
		for (int i = 2; i < N; i++) {
			if (isPrime[i])
				for (int j = i; j < N; j++) {
					if (i * j < N) {
						isPrime[i * j] = false;
					}
				}
		}
		int count = 0;
		for (int i = 2; i < N; i++) {
			if (isPrime[i]) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("total Primes count is "+count);
	}

}