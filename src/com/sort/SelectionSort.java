package com.sort;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		// Getting size of array
		System.out.println("How many no you want to insert: ");
		int al = sc.nextInt();
		int[] array = new int[al];
		
		// Inserting no's one by one in array
		System.out.println("Insert " + al + " no one by one (press enter after each number to insert..)");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		// Printing array before sort
		System.out.println("Before Sort: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		selectionSort(array);

		// Printing array after sort
		System.out.println("After Selection(Unstable) Sort: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	// Time complexity of selection sort = O(n^2)
	public static void selectionSort(int[] array) {
		
		for(int lastUnsortedIndex=array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			
			int largest = 0;
			
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(array[i] > array[largest]) {
					largest = i;
				}
			}
			
			swap(array,largest,lastUnsortedIndex);
		}
		
	}

	private static void swap(int[] array, int i, int j) {
		
		if(i==j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
