package week1.day1;

public class FibanocciSeries {
 public static void main(String[] args) {
	int n = 13, firstnumber = 0, secondnumber = 1;
	
	for (int i = 1; i<=n;  ++i)
	{
		System.out.println(firstnumber + "," );
		int nextterm = firstnumber + secondnumber;
		firstnumber = secondnumber;
		secondnumber= nextterm;
		
	}
	 
	// compute the next term
	//int nextterm = firstterm + secondterm;
	//firstterm = secondterm;
	//secondterm= nextterm;
	
	//System.out.println(nextterm);
	
	//secondterm = nextterm;
	
	
}
}
