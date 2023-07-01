package week1.day2Assignments;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,5,4,7,9};
		
		Arrays.sort(arr);
		
		int length = arr.length;
		
		//System.out.println(length);
		
		for(int i =1 ; i < arr.length; i++)
		{
			if (i != arr[i - 1]) {
				System.out.println(i);
				break;
				
			}
		}
		
	}

}
