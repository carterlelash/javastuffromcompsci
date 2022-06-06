//import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
		System.out.println();
		System.out.println("Array Size: " + arr1.size());
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		Random rand = new Random();
		for(int i = 0; i < num; i++){
			int g = rand.nextInt(100);
//			arr.add(new Integer((int)(Math.random()*100)));
			arr.add(g);
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList <Integer> a) {
		for (int x = 0; x < a.size(); x++) {
			for (int y = x+1; y < a.size(); y++) {
				if (a.get(x) == a.get(y)) {
					a.remove(y);
					y--;
				}
			}
		}
	}
}
