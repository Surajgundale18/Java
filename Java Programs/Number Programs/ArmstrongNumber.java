package com.jspider.Number_Programs;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n = 152, arm = 0, r, c;
		c = n;
		while (n > 0) {
			r = n % 10;
			arm = (r * r * r) + arm;
			n = n / 10;
		}
		if (c == arm) {
			System.out.println("arm no");
		} else {
			System.out.println("not arm no");
		}
	}

}
