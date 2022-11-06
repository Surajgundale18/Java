package com.jspider.Arrays_Programs;

import java.util.Arrays;

public class Largest_No_Array {
	public static int largestNo(int a[], int total) {
		Arrays.sort(a);
		return a[total - 1];//We Can find second and third....so on just changing [total-2,3,...]

	}

	public static void main(String[] args) {
		int a[] = { 22, 12, 1, 25 };
		int total;
		System.out.println("Largest Number In Array is " + largestNo(a, 4));
	}

}
