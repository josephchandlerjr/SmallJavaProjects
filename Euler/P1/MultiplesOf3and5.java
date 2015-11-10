//Multiples of 3 and 5
//Problem 1
//If we list all the natural numbers below 10 that are 
//multiples of 3 or 5, we get 3, 5, 6 and 9. The sum 
//of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

public class MultiplesOf3and5
{
	
	/**Prints the sum of all the multiples of 3 or 5 
	 * below 1000. 
	 */
	public static void main(String args[])
	{
		int[] multiples = {3, 5};
		int answer = 0;
		for (int mult : multiples)
		{
			answer = answer + sumOfIntArray(multiplesOfXBelowN(mult,1000));
		}
                // remove sum of multiples of both 3 and 5
		answer = answer - sumOfIntArray(multiplesOfXBelowN(15,1000));
		System.out.println(answer);
		
	}
	/* Sums all elements in an array of integers
	 * @param list an array of integers
	 * @return some of all elements in list
	 */
	public static int sumOfIntArray(int[] list)
	{
		int sum = 0;
		for (int num : list)
		{
			sum = sum + num;
		}
		return sum;
	}
	/** finds all multiples of a given x less than n
	 *@param x multiple
	 *@param n upper limit
	 *@return array of multiples of x less than n
	 */
	public static int[] multiplesOfXBelowN(int x, int n)
	{
		int arraySize;
		// if n is multiple of x, exclude it from array
		if (n % x == 0)
		{
			arraySize = (n/x)-1;
		}
		else
		{
			arraySize = n/x;
		}
	        int[] multiples = new int[arraySize];
		for(int i = 1; (i*x) < n; i++)
		{
			multiples[i-1] = i*x;
		}
		return multiples;
	}
}

