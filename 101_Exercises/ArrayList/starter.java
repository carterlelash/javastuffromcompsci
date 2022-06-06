import java.util.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
public static void printArrayList(ArrayList <Integer> userchoice, int howmany) {
	for (int e = 0; e < userchoice.size(); e++) {
		System.out.println(userchoice.get(e));
	}
}
	
public static void addValuesArrayList(ArrayList <Integer> userchoice, int howmany) {
	for (int y = 0; y < howmany; y++) {
		double r = (Math.floor(Math.random()*100+1));
		userchoice.add((int)r);
	}
}
	
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList <Integer> userchoice = new ArrayList <Integer> ();
	
	System.out.println("How many objects should be added to the array?: ");
	int howmany = sc.nextInt();
	
	
	addValuesArrayList(userchoice,howmany);
	printArrayList(userchoice,howmany);
}
}
