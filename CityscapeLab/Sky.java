import java.awt.geom.*;
import java.awt.*;
/**
 * Creates a moon, sun, and changing atmosphere
 * 
 * @author Scott Smith
 * @version 10/11/2015
 */
public class Sky
{
    /** description of instance variable x (add comment for each instance variable) */
    private Ellipse2D.Double sun;
    private int frames;
    private boolean hasSun = true;
   
    public Sky()
    {
        // initialise instance variables
        //none neccesary
    }

    /**
     * Creates an object, represented as the sun if orange or the moon if grey, that drags across the sky and changes the color of the sky
     *
     * @post    an effect of night and day in the background
     */
    public void draw(Graphics2D g2)
    {
        
        
        sun = new Ellipse2D.Double(80*frames,20,60,60);
        if(80*frames > 800){
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
