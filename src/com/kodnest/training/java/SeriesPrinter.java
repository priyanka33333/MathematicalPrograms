package com.kodnest.training.java;

import java.util.Scanner;

public class SeriesPrinter {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to print the fibanocci series of numbers");
	int n=scan.nextInt();
	Series series=new Series();
	series.fibanocciSeries(n);
    scan.close();
	}

}
