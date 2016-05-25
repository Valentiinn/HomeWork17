package com.Karayvansky.HomeWork17;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 1, 6, 4, 3, 7, 0 };
		FindArray findArray = new FindArray(new FullBust());
		findArray.sortArray(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");

		System.out.println();
	}
}
