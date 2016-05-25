package com.Karayvansky.HomeWork17;

public class FindArray {
	private SortStrategy sortStrategy;

	public FindArray(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void sortArray(int arr[]) {
		sortStrategy.getArray(arr);
	}

}
