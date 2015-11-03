// BlueJ Project: lesson6/BuffonPiExperiment
// Estimates pi using the Compte de Buffon's needle dropping method
// Take a 1 inch needle. Repeatedly drop it on a sheet of
// ruled paper whose lines are 2 inches apart 
// tries / hits = an approximation of pi

import java.util.Random;
import java.util.Scanner;

public class BuffonPiEstimate
{
    public static void main(String[] args) 
    {
        System.out.println("Buffon Pi Estimation");
        System.out.println("Enter the number of tries: ");
        Scanner in = new Scanner(System.in);
        int tries = in.nextInt();

        Random generator = new Random(42);
	int hits = 0;

	for (int i = 0; i < tries; i++)
	{

		// generate a yLow, the lowest point, or the farthest point on 
		// the needle from the line (a number between 0 and 2).
		double yLow = 2 * generator.nextDouble();// low point of needle

		// generate a random angle a between 0 and 180 degrees. 
		//angle between 0 and 180
		double angle = 180 * generator.nextDouble(); 
		angle = Math.toRadians(angle);
		
		// yHigh is yLow plus the sine of a. 
		double yHigh= yLow + Math.sin(angle);

		// Calculate the number of hits. 
		// if yHigh is above the line (the line is at a height of 2), 
		// the needle is touching the line, and counts as a hit.
		if (yHigh >= 2) { hits++;}
	} 
	double piEstimate = tries / (double)(hits); 
        
        System.out.println();
        System.out.println(piEstimate);
    }   
}

