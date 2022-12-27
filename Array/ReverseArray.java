package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	
	
	//Approach 1
	public static int[] reverseTest(int[] test) {

		int newArray[] = new int[test.length];

		for (int i = 0; i < test.length; i++) {
			newArray[test.length - i - 1] = test[i];
			//System.out.println("new array" + Arrays.toString(newArray));
			//System.out.println("old array" + Arrays.toString(test));
		}
		return newArray;
	}
	
	
	//Approach 2
	
	public static void reverse(Integer[] a) {
		
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
		
	}

	public static void main(String[] args) {
		
		Integer []test = {33,3,45,1}; 
		int[] result; 
		reverse(test);
		//System.out.println(Arrays.toString(result));
	
	}

}
