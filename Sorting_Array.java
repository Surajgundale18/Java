package com.jspider.Arrays_Programs;

import java.util.Arrays;

public class Sorting_Array {
	public static void main(String[] args) {

		int a[] = { 22, 10, 45, 20 };
		int temp = 0;
		Arrays.sort(a);
		System.out.println("Sorting array In Ascending Order: ");
		for (int i : a) {
			System.out.println(+i);
		}
		// Sorting arrays by descending order
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("Sorting array In Descending Order: ");
		for (int i : a) {
			System.out.println(i);

		}
	}
}
