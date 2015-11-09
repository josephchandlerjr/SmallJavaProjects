//This problem will use the same data as the previous one. This time you are
//to complete the TemperatureDifferenceCalculator. It has two methods:

//public double maxDifference() - Calculates the maximum difference between
//any two consecutive days.

//public double minDifference() - Calculates the minimum difference between
//any two consecutive days

//If Jan 7 temperature is 5 degrees and Jan 8 is -10 degrees, the difference
//between the two temperatures is 15. Not that a temperature drop is simply
//considered a 15 degree change. The difference is always the absolute value.
//Assume that the days are in order in the array, so data[0] is the first day,
//data[1] is the second day, and so on.

//Need help starting this question? In the lesson titled 
//"Starting points: Problem Set Questions", go to the
//problem titled "Problem Set 7 - Question 3" for some tips on 
//how to begin.

public class TemperatureDifferenceCalculator
{
    private double[] data;

   /**
    * Constructs a TemperatureDifferenceCalculator with the given array
    * @param the array to process
    */
    public TemperatureDifferenceCalculator(double[] list)
    {
        data = list;
    }

   /**
    * Gets the maximum difference between any two consecutive values
    * @return the maximum difference
    */
    public double maxDifference()
    {
	    if (data.length < 2){return 0;}
	    double result = Math.abs(data[0]-data[1]); 
	    for (int i=1; i < data.length;i++)
	    {
	            double diff = Math.abs(data[i]-data[i-1]);
		    if (diff > result)
		    {
			    result = diff; 
		    }
	    }
	    return result;
    }


   /**
    * Gets the minimum difference between any two consecutive values
    * @return the minimum difference
    */
    public double minDifference()
    {
	    if (data.length < 2){return 0;}
	    double result = Math.abs(data[0]-data[1]); 
	    for (int i=1; i < data.length;i++)
	    {
	            double diff = Math.abs(data[i]-data[i-1]);
		    if (diff < result)
		    {
			    result = diff; 
		    }
	    }
	    return result;
    }
}

