/////////////////////
//Alec McDaugale/////
/////////////////////
//This is a simple program for the conversion calculator, it simply converts 
//the user data input into the equivalant in meeters.


//import java utilities
import java.util.*;
import java.math.*;

//program name, convert feet to meeters
public class conversionFeet_Meeters {

    
    // main method
    public static void main(String[] args) {
        //creates the scanner object in
        Scanner in = new Scanner(System.in);
        
        //displays message to user to enter feet
        System.out.println("Welcome to the Java Conversion Calculator \nThis"
                + "program converts feet to meeters. \nplease enter a "
                + "measurement in feet:");
        //a double value to store the user input
        double convert = in.nextDouble();
        //double value to store the value in meeters
        double answer = convert / 3.2808;
        
        //prints results to the user
        System.out.printf(convert + " feet is equal to  %.3f meeters",answer);
        //exit
        System.exit(0);
    }
    
}
