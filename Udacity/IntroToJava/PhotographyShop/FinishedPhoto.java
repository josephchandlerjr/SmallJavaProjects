// Optional
// Does your design use FinishedPhoto objects?
// If so, fill in this class with your code.

public class FinishedPhoto
{
    private Picture pic;
    private Photographer photographer;
    private Text byLine;
    
    
    public FinishedPhoto(String name, String photoFile)
    {
        
        this.photographer = photographer;
        this.pic = new Picture(photoFile);
        this.byLine = new Text(pic.getX(), pic.getMaxY(), name);
    }
    /**
     * draws both pic and byLine
     */
    public void draw()
    {
        this.pic.draw();
        this.byLine.draw();
    }
    
    public int getMaxX()
    {
        return pic.getMaxX();
    }
    /*
     * translates both pic and byLine, which is x, maxY of pic
     */
    public void translate(double dx, double dy)
    {
        this.pic.translate(dx,dy); 
        this.byLine.translate(pic.getX(), 0);
    }
    
}
