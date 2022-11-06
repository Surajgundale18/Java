package com.jspider.String_Programs;

public class Duplicate_Char_string {
	public static void main(String[] args) {
		String string = "Surreajj";
		char a[] = string.toCharArray();
		System.out.println("Duplicate Char: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);

				}

			}

		}
	}
}
