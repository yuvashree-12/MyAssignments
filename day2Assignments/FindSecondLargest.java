package week1.day2Assignments;

import java .util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args)
	{

		int [] data  = {3,2,11,4,6,7};

		Arrays.sort(data);

		int i =  data.length ;

		System.out.println(i);

		System.out.println( " The second largest number is "  +  data [i- 2]  );


	}


}
