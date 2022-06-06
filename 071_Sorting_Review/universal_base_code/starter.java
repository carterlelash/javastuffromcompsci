import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public void threemergeSort(int [] A, int [] B, int [] C){
		
	}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public static void mergeSort(int [] A, int first, int last){
		int [] arr1 = new int [((int)last/2)+1];
		int [] arr2 = new int [((int)last/2)+1];
		
		for (int y = 0; y < A.length-(last/2)-1; y++) {
			arr1[y] = A[y];
		}
		for (int u = (last/2)+1; u < A.length; u++) {
			arr2[u-((last/2)+1)] = A[u];
		}
		
		 System.out.println("A: ");
		 for (int w = 0; w < A.length; w++) {
		 	System.out.println(A[w] + ", ");
		 }
		System.out.println("arr1: ");
		for (int a = 0; a < arr1.length; a++) {
			System.out.println(arr1[a] + ", ");
		}
		System.out.println("arr2: ");
		for (int s = 0; s < arr1.length; s++) {
			System.out.println(arr2[s] + ", ");
		}
	}
	
	public static void main(String args[]) {
	int [] A = {5,7,3,8,2,6};
	
	mergeSort(A,0,5);
	//System.out.println(A.length-(5/2));
	}
}
