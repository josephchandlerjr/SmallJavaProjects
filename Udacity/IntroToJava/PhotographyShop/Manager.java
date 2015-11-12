// TO-DO
// Fill in the methods in the manager class so
// that when the simulation runs, and simulates the
// story, the assignments are assigned to photographers
// in the correct order, and printed out with photographers
// signatures below them in the order in which they are completed.
import java.util.ArrayList;

public class Manager
{
    // YOUR CODE HERE
    // What does the manager need to remember to do his/her job?
        private ArrayList<Assignment> assignments;
        private ArrayList<Photographer> photographers;
        public Portfolio portfolio;
    public Manager()
    {
        assignments    = new ArrayList<Assignment>();
        photographers  = new ArrayList<Photographer>();
        portfolio      = new Portfolio();
    }

  
    
   
      /**
     * Called when it's time to hire a new photographer.
     * @param photographer name of photographer to add to ArrayList of photographers
     */
    public void hire(String photographer)
    {
       photographers.add(new Photographer(photographer));
    }
    
    
    public int getMaxPriorityIndex()
    {
        int maxIndex = 0;
        int maxPriority = -1;
        for (int i=0; i < assignments.size(); i++)
        {
            int priority = assignments.get(i).getPriority();
            if (priority > maxPriority)
            {
                maxIndex = i;
                maxPriority = priority;
            }
        }
        return maxIndex;
    }
    /**
     * Called when it's time for the daily meeting where
     * the highest priority assignments are given to photographers.
     * Each photographer can take one assignment. The highest priority
     * assignment should be given out first and the highest priority
     * assignment should go to the photographer who was hired first.
     */
    public void giveOutAssignments()
    {
        int photographerIndex = 0;
        for (int i=0; i < photographers.size() && assignments.size() > 0;i++)
        {
            int maxIndex = getMaxPriorityIndex();
            Photographer photographer = photographers.get(i);
            Assignment assignment = assignments.get(maxIndex);
            assignments.remove(maxIndex);
            String photoFile =  photographer.takeAssignment(assignment.description());
          
            portfolio.add(photoFile, photographer.getName());
            
            
        }
        
      
    }

    /**
     * A Customer came up with a new assignment. The manager should
     * add it to the to-do list so that next time it's time to give
     * out assignments, the new assignment will be a possibility.
     */
    public void newAssignment(int priority, String description)
    {
        Assignment assignment = new Assignment(priority, description);
        assignments.add(assignment);
    }

    /**
     * It's the end of the story for now. Time to look at all the
     * work the company has done.
     */
    public void checkPortfolio()
    {
        portfolio.display();
    }
}
