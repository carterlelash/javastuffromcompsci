import pkg.*;
import java.util.*;

class starter {
	public static int recurPower(int base, int n){
		if (n <= 1) {
			return n;
		}
		else {
			return base * recurPower(base,n-1);
		}
	}	

	public static void main(String args[]) {
		System.out.println(recurPower(4,4));
	}
}
