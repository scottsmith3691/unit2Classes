import java.awt.*;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class House
{
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class House
     */
    public House(int x,int y)
    {
        xLeft=x;
        yTop=y;
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
        Rectangle base = new Rectangle(xLeft,yTop,325,300);
        
        Rectangle door= new Rectangle((xLeft+115),(yTop+200),65,100);
        
        Rectangle window1= new Rectangle((xLeft+65),(yTop+75),60,60);
        g2.drawLine((xLeft+95),(yTop+75),(xLeft+95),((yTop+75)+60));
        g2.drawLine((xLeft+65),(yTop+105),((xLeft+65)+60),(yTop+105));
        
        Rectangle window2= new Rectangle((xLeft+200),(yTop+75),60,60);
        g2.drawLine((xLeft+230),(yTop+75),(xLeft+230),((yTop+75)+60));
        g2.drawLine((xLeft+200),(yTop+105),(xLeft+260),(yTop+105));
        
        g2.drawLine(xLeft,yTop,(xLeft+172),(yTop-55));
        g2.drawLine((xLeft+325),yTop,(xLeft+170),(yTop-55));
        
        g2.drawLine(0,420,800,420);
        
        g2.draw(base);
        g2.draw(door);
        g2.draw(window1);
        g2.draw(window2);
    }

}
