// Do you need a Portfolio object to simulate
// the photography shop?
// Write a class Portfolio if you need a portfolio
// to implement your design.
import java.util.ArrayList;
public class Portfolio
{
    private ArrayList<FinishedPhoto> list;
    
    public Portfolio()
    {
        list = new ArrayList<FinishedPhoto>();
    }
    
    public void add(String photoFile, String name)//FinishedPhoto photo)
    {
        
        list.add(new FinishedPhoto(name, photoFile));
    }
    
    public void display()
    {
       int lastX = 0;
       for (FinishedPhoto photo : list)
       {
           photo.draw();
           photo.translate(lastX, 0);
           lastX = photo.getMaxX();
        }
    }

}
