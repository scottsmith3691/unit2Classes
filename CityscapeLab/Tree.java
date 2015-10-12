import java.awt.geom.*;
import java.awt.*;
/**
 * Creates 3 preplaced trees to the landscape
 * 
 * @author Scott Smith 
 * @version 10/11/2015
 */
public class Tree
{

    /**
     * Default constructor for objects of class Tree
     */
    public Tree()
    {
        //none necesary
        
    }

    /**
     * Draws the 3 preplaced trees
     * @post   3 more trees in on the grass
     */
    public void draw(Graphics2D g2)
    {
        //tree 1
        int x1=200;
        int y1=450;
        Rectangle trunk = new Rectangle(x1,y1,20,80);
        g2.setColor(new Color(83, 53, 10));
        g2.fill(trunk);
        Ellipse2D.Double leaves11 = new Ellipse2D.Double(x1,y1-50,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves11);
        Ellipse2D.Double leaves12 = new Ellipse2D.Double(x1-20,y1-80,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves12);
        Ellipse2D.Double leaves13 = new Ellipse2D.Double(x1-40,y1-50,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves13);
        
        //tree2
        int x2=650;
        int y2=420;
        Rectangle trunk2 = new Rectangle(x2,y2,20,80);
        g2.setColor(new Color(83, 53, 10));
        g2.fill(trunk2);
        Ellipse2D.Double leaves21 = new Ellipse2D.Double(x2,y2-50,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves21);
        Ellipse2D.Double leaves22 = new Ellipse2D.Double(x2-20,y2-80,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves22);
        Ellipse2D.Double leaves23 = new Ellipse2D.Double(x2-40,y2-50,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves23);
        
        //tree 3
        int x3=60;
        int y3=500;
        Rectangle trunk3 = new Rectangle(x3,y3,20,80);
        g2.setColor(new Color(83, 53, 10));
        g2.fill(trunk3);
        Ellipse2D.Double leaves31 = new Ellipse2D.Double(x3,y3-50,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves31);
        Ellipse2D.Double leaves32 = new Ellipse2D.Double(x3-20,y3-80,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves32);
        Ellipse2D.Double leaves33 = new Ellipse2D.Double(x3-40,y3-50,60,60);
        g2.setColor(new Color(66,165,8));
        g2.fill(leaves33);
    }

}
