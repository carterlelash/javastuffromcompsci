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
	bubbleSort(arr);
	for (int r = 0; r < arr.length; r++) {
		System.out.println(arr[r]);
	}

		
	}
	
	public static void bubbleSort(int [] arr) {
		for (int outer = 0; outer < arr.length-1; outer++) {
			for (int inner = 0; inner < arr.length-outer-1; inner++) {
				if (arr[inner] > arr[inner+1]) {
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
	}
}
