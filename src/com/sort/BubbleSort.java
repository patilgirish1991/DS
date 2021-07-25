package com.sort;
import java.util.Scanner;

public class BubbleSort {

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

		bubbleSort(array);

		// Printing array after sort
		System.out.println("After Bubble(Stable) Sort: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	// Time complexity of bubble sort = O(n^2)
	public static void bubbleSort(int[] array) {
		
		// if array contains only a single element
		if(array.length==1) {
			return;
		}
		
		// bubble sort logic
		for(int lastUnsortedIndex = array.length -1; lastUnsortedIndex>0;lastUnsortedIndex--) {
			for(int i=0;i<lastUnsortedIndex;i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
				
			}
		}
		
	}
}
