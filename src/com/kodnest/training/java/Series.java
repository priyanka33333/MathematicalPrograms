package com.kodnest.training.java;

public class Series {
	public void fibanocciSeries(int n) {
		int fib1=0;
		int fib2=1;
		if(n==1) {
			System.out.println(fib1+" ");
		}
		else if(n==2) {
			System.out.print(fib1+" "+fib2+" ");
		}
		else {
			System.out.print(fib1+" "+fib2+" "+" ");
			{
				for(int i=3;i<=n;i++) {
				int nextNum=fib1+fib2;
				System.out.print(nextNum+" ");
				fib1=fib2;
				fib2=nextNum;
				}
			}
		}
	}

}