package com.Karayvansky.ProceduralSort;

public class Sort {

	private String typeSort;

	public Sort(String typeSort) {
		this.typeSort = typeSort;
	}

	public void sorting(int[] arr) {
		switch (typeSort) {
		case "FullBust":
			fullBust(arr);
			break;
		case "InsertionSort":
			insertionSort(arr);
			break;
		case "MergeSort":
			mergeSort(arr);
			break;
		case "QuickSort":
			quickSort(arr);
			break;
		case "SelectionSort":
			selectionSort(arr);
			break;
		}
	}

	private void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");
	}

	private void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		printArr(arr);
	}

	private void quickSort(int[] arr) {
		// TODO Auto-generated method stub
	}

	private void mergeSort(int[] arr) {
		// TODO Auto-generated method stub

	}

	private void insertionSort(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		printArr(arr);
	}

	private void fullBust(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printArr(arr);
	}
}