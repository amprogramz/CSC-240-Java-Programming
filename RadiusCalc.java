//alec Mcdaugale
//This program calcualtes the area of a circle or the volume of a sphere

//need the util and the math
import java.util.*;
import java.math.*;



public class RadiusCalc 
{
    //i found that when i declare this here it works everywhere
    public static Scanner in = new Scanner(System.in);
    
    //main method
    public static void main(String[] args) 
    {
        //initialize variables to store the input radius, and the calculated 
        //area and volume
        double radius, area, volume;
        //boolean var to store if the user wants to quit or !quit
        //I find this to be more user friendly than entering 0 
        boolean quit = false;
        
      
            
        //greet the user in the main method
        System.out.println("Welcome to the Radius Calculator. \n This progam is "
            + "designed to take the radius of a circle or sphere and \n"
            + "calcualte the area.");
          
        //while not ready to quit
         while( !quit )
        {    
            //radius is equal to 0
            radius = 0;
            
            //get radius with the get radius method
            radius = getRadius();
            //find the area with the area method
            area = calcArea(radius);
            //calculate the volume with the volume method
            volume = calcVolume(radius);
            //print the results to the user
            printResults(radius, area, volume);
            
            //get the value of quit from the user, do you want to continue?
            quit = continueCalc();
       }
       //exit program
       System.exit(0);
       
    }
    //get the radius from the user
    public static double getRadius()
    {
        //Scanner in = new Scanner(System.in);
        
        int radius;
        //prompt and accept the input radius from the user
        System.out.println("\nPlease enter the radius:");
        radius = in.nextInt();
        
        //return the radius
        return radius;
        
    }
    //calculates the area
    public static double calcArea(double radius)
    {
        double area;
        //calculate area with the given formula
        area = Math.PI * Math.pow(radius, 2);
        
        //debug line
        //System.out.println(area + "\n");
        
        //return the area
        return area;
    }
    //calc volume
    public static double calcVolume(double radius)
    {
        double volume;
        //calculate the volume with the given formula
        volume = .75 * Math.PI * Math.pow(radius, 3);
        
        //debug line
        //System.out.println(volume + "\n");
        
        //return volume
        return volume;
    }
    //method to print the results to 3 decimal places
    public static void printResults (double radius, double area, double volume)
    {
        //print results for the user
        System.out.printf("\nWith a radius of %10.3f :\n"
                + "Circle area = %10.3f\n"
                + "Sphere volume = %10.3f\n", radius, area, volume);
    }
    //method to continue or quit
    public static boolean continueCalc()
    {
        boolean quit, corectInput;
        //prompt user to continue or quit
        System.out.println("\nWould you like to continue calculating(Y/N)?");
        String answer = in.next();
            
        //boolean to enter the error checking loop
        corectInput = false;
        quit = false;
        //errandous input checking loop, loops until user enters the correct form
        while(!corectInput)
        {
            //if the user enters n corect and quit
            if (answer.equalsIgnoreCase("n"))
            {
                corectInput = true;
                quit = true;
                //added a good bye statement 
                System.out.println("\n\nGood Bye, and Thank You for using \n"
                        + "the Radius Calc");
            }
            //if the user enters y corect and !quit
            else if(answer.equalsIgnoreCase("y"))
            {
                corectInput = true;
                quit = false;
            }
            //else reinput until corect
            else
            {
                System.out.println(answer + " is not a valid input, please choose "
                    + "either (Y/N)!");
                    answer = in.next();
            }
        }
        
        //return the boolean value to controle the loop
        return quit;
    }
}
