import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A car has a certain fuel efficancy and a certain amount 
 * of fuel in the gas tank. The car can be driven a certain 
 * distance
 * 
 * @author Scott Smith
 * @version 10 September 2015
 */
public class Car
{
    /** fuel efficiency of the car in miles per gallon (mpg)*/
    private double fuelE;
    
    /**amount of fuel left in the cars tank in gallons*/
    private double fuelTank;

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car(double fuelE)
    {
        // initialise instance variables
        this.fuelE = fuelE;
        fuelTank=0;

    }

    /**
     * Simulates driving a car the specified distance and reduces the amount of fuel in the tank
     *
     * @pre        specified distance cannot result in the consumption of more gas than is available
     * @param    distance the car drives in miles
     */
    public void drive(double distance)
    {
        fuelTank-=distance/fuelE;

    }


    /**
     * returns amount of gas in the car's tank in units of gallons

     * @returns amount of gas in the car's tank in units of gallons
     */
    public double getGasInTank()
    {
        // put your code here
        return fuelTank;
    }


    /**
     * Increments the fuel in the cars tank by the specified amount in gallons
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void addGas(double gallonsOfGas)
    {
        fuelTank+=gallonsOfGas;
        
    }

}
