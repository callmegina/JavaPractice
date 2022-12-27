package Array;

import java.util.Arrays;
import java.util.Random;

public class SortDescending {
	
	//sort array in descending order 
	//random generate int array 
	
	public static int[] getArray(int len) {
		Random ran = new Random();
		int[] test = new int[len];
		
		for(int i =0; i < test.length; i++) {
			test[i]= ran.nextInt(90);		
			System.out.println(test[i]);
		}
		
		String results = Arrays.toString(test);
		//System.out.println(results);
		return test;			
	}
	
	public static int[] sortedArray(int[]mytest) {
		//max = int[0] if int[i]> int[i+1] then max = int[i]

		int temp;
		
		System.out.println("Unsorted Array---->" + Arrays.toString(mytest));
		
		for (int i = 0; i < mytest.length-1; i++) {
			if(mytest[i] < mytest[i+1]) {
				temp = mytest[i];
				mytest[i] = mytest[i+1];
				mytest[i+1] = temp;
				System.out.println("Inside Loop --->" + Arrays.toString(mytest));
			}
		}
		System.out.println("Sorted Array---->" + Arrays.toString(mytest));
		return mytest;
	}

	
	public static void main(String[] args) {
	
		int[] result;
		result = getArray(5);
		sortedArray(result);	

	}
	
	
}


