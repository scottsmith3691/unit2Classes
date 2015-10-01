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
        
        System.out.println("Convert a number with a comma to a number without(OPTION: A) or Covert a number without a comma to one with (OPTION: B) ");
        System.out.println("OPTION: ");
        String choice=input.next();
        
        if (choice=="A")
        {
        
            String number;
            System.out.println("Please enter an integer between 1000 and 999999 ");
            System.out.print("Enter a large number with at least one comma in it: ");
            number=input.next();
            
            int comma = number.indexOf(",");
            int length = number.length();
            String number1 = number.substring(0,(comma));
            String number2 = number.substring((comma+1),length);
            String answer = number1 + number2;
            System.out.println(answer);
        }
        else if (choice=="B")
        {
            int number;
            System.out.println("Please enter an integer between 1000 and 999999 ");
            System.out.print("Enter a large number with no commas in it: ");
            number = input.nextInt();
            
            String numberStr="" + number;
            
            int length = numberStr.length();
            int inverse = length - (length-3);
            String number1 = numberStr.substring(0,inverse);
            String number2 = numberStr.substring((inverse+1),length);
            String answer = number1 + "," + number2;
            System.out.println(answer);
        }
        else 
        {
            System.out.println("Inncorrect choice");
        }
    }    

}
