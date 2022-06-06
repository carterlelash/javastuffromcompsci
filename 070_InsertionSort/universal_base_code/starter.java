import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
	int [] arr = new int [200];
	for (int y = 0; y < arr.length; y++) {
		int ran = rand.nextInt(100);
		arr[y] = ran;
	}
	insertionSort(arr);
	for (int r = 0; r < arr.length; r++) {
		System.out.println(arr[r]);
	}
		
	}
	
	public static void insertionSort(int [] arr) {
		int outer;
		int inner;
		int key;
		
		for (outer = 1; outer < arr.length; outer++) {
			key = arr[outer];
			inner = outer-1;
			
			while (inner >= 0 && arr[inner] > key) {
				arr[inner + 1] = arr[inner];
				inner = inner - 1;
			}
			arr[inner + 1] = key;
		}
	}
}
