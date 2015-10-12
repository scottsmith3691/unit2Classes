import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.*;

public class House
{
    private int xLeft;
    private int yTop;

    public House(int x,int y)
    {
        xLeft=x;
        yTop=y;
    }

    /**
     * This method creates all the entire house and the grass
     * 
     * @post    a placeable house with user inputed x and y coordinates and grass on the bottom of the screen  
     */
    public void draw(Graphics2D g2)
    {
        //Creates grass
        Rectangle grass = new Rectangle(0,420,800,420);
        g2.setColor(Color.GREEN);
        g2.fill(grass);
        
        //Roof Creation
        Rectangle leftRoof = new Rectangle((xLeft+5),(yTop-40),172,80);
        Rectangle rightRoof = new Rectangle(((xLeft+325)-200),(yTop+20),182,80);
        g2.setColor(new Color(47, 48, 53));
        
        //Roof Placement
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(-25), leftRoof.getX() + leftRoof.width/2, leftRoof.getY() + leftRoof.height/2);
        Shape transformed = transform.createTransformedShape(leftRoof);
        g2.fill(transformed);
        transform.rotate(Math.toRadians(45), rightRoof.getX() + rightRoof.width/2, rightRoof.getY() + rightRoof.height/2);
        Shape transformed1 = transform.createTransformedShape(rightRoof);
        g2.fill(transformed1);
        
        //Creates house base
        Rectangle base = new Rectangle(xLeft,yTop,325,300);
        
        //Creates Door
        Rectangle door= new Rectangle((xLeft+115),(yTop+200),65,100);
        
        //Creates Windows
        Rectangle window1= new Rectangle((xLeft+65),(yTop+75),60,60);
        g2.drawLine((xLeft+95),(yTop+75),(xLeft+95),((yTop+75)+60));
        g2.drawLine((xLeft+65),(yTop+105),((xLeft+65)+60),(yTop+105));
        Rectangle window2= new Rectangle((xLeft+200),(yTop+75),60,60);
        g2.drawLine((xLeft+230),(yTop+75),(xLeft+230),((yTop+75)+60));
        g2.drawLine((xLeft+200),(yTop+105),(xLeft+260),(yTop+105));
        
        
        
        //Draws all the objects
        g2.setColor(new Color(255,255,240));
        g2.fill(base);
        g2.setColor(new Color(165, 42, 42));
        g2.fill(door);
        g2.setColor(new Color(128, 128, 255));
        g2.fill(window1);
        g2.fill(window2);
    }

}
