//Complete the class ArrayListMethods. It consists of four short methods
//to manipulate an array list of strings. The method header and javadoc
//are given to you.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 1" for some tips on 
// how to begin.

import java.util.ArrayList;

public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;
	
	for (int i = 0; i < list.size()-1 && sorted; i++)
	{
		if (list.get(i).compareTo(list.get(i+1)) > 0)
		{
			sorted = false;
		}
	}

        return sorted;
    }

    /**
     * Replaces all but the first and last elements with the larger of its two neighbors
     * You can use the compareTo() method to determine which string is larger (larger in alphabetical
     * order).
     * Example: if the list is originally
     *    ["cat", "ape", "dog", "horse", "zebra"]
     * after this method it should be: 
     *    ["cat", "dog", "horse", "zebra", "zebra"]
     */
    public void replaceWithLargerNeighbor()
    {
	    String left;
	    String right;
	    for (int i = 0; i < list.size(); i++)
	    {
		    if (i != 0 && i != list.size()-1)
		    {
			    left  = list.get(i-1);
			    right = list.get(i+1);
			    if (left.compareTo(right) > 0)
			    {
				    list.set(i, left);
			    }
			    else
			    {
				    list.set(i, right);
			    }
		    }
	    }
    }

    /**
     * Gets the number of duplicates in the list.
     * Be careful to only count each duplicate once. Start at index 0. (Does it match any of the other elements?)
     * Get the next word. It is at index i. (Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;
	String thisElem;
	for (int i = 0; i < list.size(); i++)
	{
		thisElem = list.get(i);
		for (int j = i+1; j < list.size(); j++)
		{
			if (thisElem == list.get(j))
			{
				duplicates++;
				break;
			}
		}
		
	}


        return duplicates;
    }

     /**
     * Moves any word that starts with x, y, or z to the front of the ArrayList, but
     * otherwise preserves the order
     * Example: if the list is orginially
     *   ["ape", "dog", "xantus", "zebra", "cat", "yak"]
     * after this method is called it should be
     *   ["xantus", "zebra", "yak", "ape", "dog", "cat"]
     */
    public void xyzToFront()
    {
        int insertAt = 0;
	String thisElem;
	
	
	for (int i = 0; i < list.size(); i++)
	{
		thisElem = list.get(i);
		if (thisElem.length() < 1)
		{
			continue;

		}
		else if ("xyz".contains(thisElem.substring(0,1))) 
		{
			list.remove(i);
			list.add(insertAt, thisElem);
			insertAt++;
		}
	}
    } 
    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collection format
     */
    public String toString()
    {
        return list.toString();
    }
}

