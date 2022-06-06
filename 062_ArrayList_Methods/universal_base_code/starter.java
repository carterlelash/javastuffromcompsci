import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	
	public static void toStringArrayList(ArrayList <Integer> array1) {
		for (int y = 0; y < array1.size(); y++) {
			System.out.println(array1.get(y));
		}
	}
	
	public static int getArrayListAverage(ArrayList <Integer> array1) {
		int average = 0;
		for (int y = 0; y < array1.size(); y++) {
			average = average + array1.get(y);
		}
		return (average/(array1.size()));
	}
	
	public static int getArrayListMax(ArrayList <Integer> array1) {
		int max = 0;
		for (int y = 0; y < array1.size(); y++) {
			if (array1.get(y) > max) {
				max = array1.get(y);
			}
		}
		return max;
	}
	
	public static int getArrayListMin(ArrayList <Integer> array1) {
		int min = 200;
		for (int y = 0; y < array1.size(); y++) {
			if (array1.get(y) < min) {
				min = array1.get(y);
			}
		}
		return min;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	ArrayList <Integer> array1 = new ArrayList <Integer> ();
	System.out.println("How many values would you like to add to this array: ");
	int values = sc.nextInt();
	
	for (int u = 0; u < values; u++) {
		double x = (Math.floor(Math.random()*100+1));
		array1.add((int)x);
	}
	
	toStringArrayList(array1);
	System.out.println("Average: " + getArrayListAverage(array1));
	System.out.println("Max: " + getArrayListMax(array1));
	System.out.println("Min: " + getArrayListMin(array1));
	}
}
