import java.util.Scanner;

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        double l=input.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double w=input.nextDouble();
        double d = (Math.pow(l,2))+(Math.pow(w,2));
        double diagonal=Math.pow(d,0.5);
        
        
        double perimeter=(l*2)+(w*2);
        double area=l*w;
        System.out.print("Perimeter: "+ perimeter + "/Area: " + area + "/Diagonal Angle: " + diagonal);
    }    

}
