//Multiples of 3 and 5
//Problem 1
//If we list all the natural numbers below 10 that are 
//multiples of 3 or 5, we get 3, 5, 6 and 9. The sum 
//of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

import java.util.Arrays;
import java.util.ArrayList;

public class MultiplesOf3and5
{
	
	/**Prints the sum of all the multiples of 3 or 5 
	 * below 1000
	 */
	public static void main(String args[])
	{
		int upperLimit = 1000;
		int[] mult3 =multiplesOfXBelowN(3,upperLimit);
	        int[] mult5 =multiplesOfXBelowN(5,upperLimit);
	        int[] mult15=multiplesOfXBelowN(15,upperLimit);	
	        int sum3 = sumOfIntArray(mult3);
	        int sum5 = sumOfIntArray(mult5);
	        int sum15 = sumOfIntArray(mult15);
		System.out.println(sum3 + sum5 - sum15);
		
	}
	/* Sums all elements in an array of integers
	 * @param list an array of integers
	 * @return some of all elements in list
	 */
	public static int sumOfIntArray(int[] list)
	{
		int sum = 0;
		for (int i=0; i< list.length; i++)
		{
			sum = sum + list[i];
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
		if (n % x == 0)
		{
			arraySize = (n/x)-1;
		}
		else
		{
			arraySize = n/x;
		}
	        int[] multiples = new int[arraySize];
		for(int i=0; (i*x)<n;i++)
		{
			if (i != 0)
			{
			multiples[i-1] = i*x;
			}
		}
		return multiples;
	}
}

