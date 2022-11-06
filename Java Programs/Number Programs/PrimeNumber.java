package com.jspider.Number_Programs;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 100;
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count = 1;
			}
		}
		if (count > 0) {
			System.out.println(n+" is not a Prime Number");
		} else {
			System.out.println(n+" is a Prime Number");
		}
	}
}
