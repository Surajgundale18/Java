package com.jspider.Number_Programs;

public class Swipping {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("Befor swipping: " + "A= " + a + " ," + "B= " + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("After swipping: " + "A= " + a + " ," + "B= " + b);

	}
}
