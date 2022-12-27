package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MiniExercise {

	public static int findMin (int[] nums) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i= 0; i< nums.length-1; i++) {
		
			if(nums[i] < min) {
				min = nums[i];
						
			}
			
		}
		 System.out.println(min);
		return min;
		
	}
	
	
	public static int[] readIntegers() {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a list of numbers separate by commas");
		 String input = scan.nextLine();

		  
		 String[] results = input.split(",");
		 int[] values = new int[results.length];
		 
		 for (int i=0; i< results.length; i++) {
			 values[i] = Integer.parseInt(results[i].trim());
		 }

		 
		 return values;
	}
	
	public static void main(String[] args) {
		
		//int [] test = readIntegers();
	  
		//System.out.println(test);
		
		int[] tests = {1,993,1,2};
		findMin(tests);
	}
	
	
	

}
