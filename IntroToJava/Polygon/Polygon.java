//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.

import java.util.ArrayList;
import java.awt.Point;
/**
	This class models a polgon
 */
public class Polygon
{
    private ArrayList<Point> points;
    
    public Polygon()
    {
        points = new ArrayList<Point>();
    }

    /**
      adds a Point to the polygon
     */ 
    public void add(Point pt)
    {
	    this.points.add(pt);
    }
    /**
      perimeter: returns the perimeter of the polygon
      */
    public double perimeter()
    {
	    double res = 0.0;
	    Point p1;
	    Point p2;
	    //distances as doubles so we doubles for disance
	    double xdist; //x1 - x2
	    double ydist; //y1 - y2
	    for (int i = 0; i < points.size(); i++)
	    {
		    p1 = points.get(i);
		    p2 = points.get((i+1)% points.size());
		    xdist = p1.x - p2.x;
		    ydist = p1.y - p2.y;
		    // distance formula
		    res = res + Math.sqrt(Math.pow(xdist,2)+Math.pow(ydist,2)); 
	    }
	    return res;
    } 
    /**draw: draws the polygon by connecting consecutive points 
       and then connecting the last point to the first. 
       Line class is part of custom graphics library so 
       this method doesn't method is pretty useless right now.
       */
    public void draw()
    {
        for (int i = 0; i < points.size(); i++)
        {
            Point p1 = points.get(i);
            Point p2 = points.get((i+1) % points.size());
            //new Line(p1.x,p1.y,p2.x,p2.y).draw();
        }
    }
}


