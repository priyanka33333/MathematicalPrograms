package com.kodnest.training.java;

import java.util.Scanner;

public class PalindromeCheckerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is palindrome or not");
		int n = scan.nextInt();
		Palindrome palindrome = new Palindrome();
		int rev = palindrome.reverseNumber(n);
		System.out.println("The Reverse of a number "+n+" is "+rev);
		if (n == rev) {
        System.out.println("The entered number is a plaindrome");
		}
		else {
			System.out.println("The entered number is not a palindrome");
		}
	}
}
