package com.jspider.String_Programs;

public class VowelsFinding {
	public static void main(String[] args) {
		String string = "i am happy today";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
					|| string.charAt(i) == 'u') {
				System.out.println("vowels in this string " + string.charAt(i) + " at index " + i);
			}
		}
	}
}
