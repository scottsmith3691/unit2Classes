import java.util.Scanner;

/**
 * Write a description of class Parsing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parsing
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String number;
        
        System.out.print("Enter a large number with at least one comma in it: ");
        number=input.next();
        
        int comma = number.indexOf(",");
        int length = number.length();
        String number1 = number.substring(0,(comma));
        String number2 = number.substring((comma+1),length);
        String answer = number1 + number2;
        System.out.println(answer);
        
        
        
        
    }    

}
