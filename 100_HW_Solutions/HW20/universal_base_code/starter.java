//import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	ArrayList <Integer> arr1 = new ArrayList <Integer>();
	ArrayList <Integer> arr2 = new ArrayList <Integer>();
	ArrayList <Integer> arr3 = new ArrayList <Integer>();
	ArrayList <Integer> arr4 = new ArrayList <Integer>();
	assignValues(arr1);
	assignValues(arr2);
	assignValues(arr3);
	
	bubbleSort(arr1);
	selectionSort(arr2);
	insertionSort(arr3);
	
	printValues(arr1);
	median(arr1);
	printValues(arr2);
	median(arr2);
	printValues(arr3);
	median(arr3);
	
	}
	
	public static void bubbleSort(ArrayList <Integer> arr) {
		for (int outer = 0; outer < arr.size() - 1; outer++) {
			for (int inner = 0; inner < arr.size()-outer-1; inner++) {
				if (arr.get(inner) > arr.get(inner + 1)) {
					int temp = arr.get(inner);
					arr.set(inner, arr.get(inner + 1));
					arr.set(inner+1, temp);
				}
			}
		}
	}
	public static void selectionSort(ArrayList <Integer> arr) {
		int outer;
		int inner;
		int key;
		for (outer = 1; outer < arr.size(); outer++) {
			key = arr.get(outer);
			inner = outer-1;
			
			while (inner >= 0 && arr.get(inner) > key) {
				arr.set(inner+1, arr.get(inner));
				inner = inner - 1;
			} 
			arr.set(inner + 1, key);
		}
	}
	public static void insertionSort(ArrayList <Integer> arr) {
		int outer;
		int inner;
		int key;
		
		for (outer = 1; outer < arr.size(); outer++) {
			key = arr.get(outer);
			inner = outer-1;
			
			while (inner >= 0 && arr.get(inner) > key) {
				arr.set(inner + 1, arr.get(inner));
				inner = inner - 1;
			}
			arr.set(inner + 1, key);
		}
	}
	public static void assignValues(ArrayList <Integer> arr) {
		for (int y = 0; y < 100; y++) {
			int u = (int)(Math.floor(Math.random()*100+1));
			arr.add((int)u);
		}
	}
	public static void median(ArrayList <Integer> arr) {
		int x = arr.size();
		System.out.println("Median: " + (int)x/2);
	}
	public static void printValues(ArrayList <Integer> arr) {
		System.out.println("Array: ");
		for (int y = 0; y < arr.size(); y++) {
			System.out.println(arr.get(y));
		}	
	}
}
