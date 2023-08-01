package com.kodnest.training.java;

public class SumOfDigits {

	public void findSum(long n) {
		int sum = 0;
		while (n != 0) {
			double rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		System.out.println("Sumofdigits of a number" + sum);
	}
}
