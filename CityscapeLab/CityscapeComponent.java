import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.*;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private Sky sky;
    private House house;
    private Tree trees;
    int xAxis;
        int yAxis;
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    public CityscapeComponent(int xAxis, int yAxis)
    {
        house = new House(xAxis, yAxis);
        sky = new Sky();
        trees = new Tree();
        this.xAxis=xAxis;
        this.yAxis=yAxis;
    }
    
    
    
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        
        
        Graphics2D g2 = (Graphics2D) g;
        sky.draw(g2);
        house.draw(g2);
        trees.draw(g2);
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        //not necesary
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
