//Fibonacci numbers
//Problem 2
//Each new term in the Fibonacci sequence is generated by adding the 
//previous two terms. By starting with 1 and 2, the first 10 terms will be:
//    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//    By considering the terms in the Fibonacci sequence whose values 
//do not exceed four million, find the sum of the even-valued terms.

public class FibonacciNumbers
{
	private static double limit = 4 * Math.pow(10,6);
	private double last = 0; 
        private double current = 1;
	public static void main(String[] args)
	{
		double evenSum = 0; 
		FibonacciNumbers generator = new FibonacciNumbers();
	        double fibNum = generator.next();
		for (int i = 0; fibNum < limit; i++)
		{	
			if (fibNum % 2 == 0)
			{
				evenSum = evenSum + fibNum;
			}
			fibNum = generator.next();
		}
		System.out.println(evenSum);
	}
	/** returns fibonacci numbers one at a time
	 * @return the next fibonacci number as a double
	 */
	public double next()
	{
		double result = last + current;
		last = current;
		current = result;
		return result;

	}
}

