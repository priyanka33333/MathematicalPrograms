package com.kodnest.training.java;

import java.util.Scanner;

public class SumOfDigitsApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to calculate sum of digits of given number");
		long n = scan.nextLong();
		SumOfDigits sumofdigits = new SumOfDigits();
		sumofdigits.findSum(n);
	}

}
