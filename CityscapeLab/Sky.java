import java.awt.geom.*;
import java.awt.*;
/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky
{
    /** description of instance variable x (add comment for each instance variable) */
    private Ellipse2D.Double sun;
    private int frames;
    private boolean hasSun = true;
    /**
     * Default constructor for objects of class Sky
     */
    public Sky()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        
        
        sun = new Ellipse2D.Double(30*frames,20,50,50);
        if(30*frames > 800){
            frames = -2;
            hasSun = !hasSun;
        }
        if(hasSun){
            g2.setColor(new Color(200, 200, 255));
            g2.fill(new Rectangle.Double(0, 0, 800, 600));
            g2.setColor(Color.ORANGE);
        } else {
            g2.setColor(new Color(0, 0, 100));
            g2.fill(new Rectangle.Double(0, 0, 800, 600));
            g2.setColor(Color.GRAY);
        }
        g2.fill(sun);
        frames++;
    }

}
