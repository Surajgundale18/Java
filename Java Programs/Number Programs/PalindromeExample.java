package com.jspider.Number_Programs;

import java.util.Scanner;

public class PalindromeExample {
	public static void main(String[] args) {
		int r,temp,sum = 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter any No: ");
		int n= scanner.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if (temp==sum) {
			System.out.println(" Given Number is Palindrome Number");
		}
		else {
			System.out.println(" Given Number is not Palindrome Number");
		}
	}

}
