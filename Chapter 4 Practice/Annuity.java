

/**
 * Write a description of class Annuity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Annuity
{
    public static void main(String[] args)
    {
        
        double pmt = 10000;
        //PMT: periodic payment
        double i = 0.08;
        //i: periodic interest or compound rate
        double n = 20;
        //n: number of payments
        
        //double first=1+i;
        double answer=(int)((((((Math.pow((1+i),(n-1))-1)/i)/(Math.pow((1+i),(n-1))))+1)*pmt)*100)/100.0;
        
        System.out.println(answer);
    }

}
