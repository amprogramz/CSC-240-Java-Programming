/*
Alec McDaugale
This is the main method that controles the coffee sales program
*/
import java.util.*;

public class CofeeSalesMain 
{
    public static Scanner in = new Scanner(System.in);
    //main method
    public static void main(String[] args) 
    {
        //int to store two variables 
        int bags;
        double weight;
        
        //boolean to controle main loop
        boolean continueLoop;
        
        //great the user
        greetUser();
        //prompt user to begin
        continueLoop = begin();
        //while true
        while (continueLoop)
        {
            //get bags 
            bags = getBags();
            //get weight 
            weight = getWeight();
            //show the results
            showResults(bags, weight);
            
            //continue?
            continueLoop = repeat();
            
        }
        //bye
        Bye();
        System.exit(0);
    }
    
    //greet the user when the program begins
    public static void greetUser()
    {
        System.out.println("Welcome to the coffee calculator. Sit Back and \n"
                + "enjoy a freshly roasted bag of coffee beans. This program \n"
                + "displays the price with the weight and number of equally \n"
                + "weighted bags you wish to purchace.");
        return;
    }
    //input for the bag weight 
    public static int getWeight()
    {
        System.out.println("\nPlease enter the weight of the bags you want to "
                + "purchace:");
        return in.nextInt();
    }
    //input number of bags
    public static int getBags()
    {
        System.out.println("Please enter the number of bags you wish to purchace:");
        return in.nextInt();
    }
    //method that handles output for the results
    public static void showResults(int bags, double weight)
    {
        coffeeSalesClass purchace = new coffeeSalesClass(bags, weight);
        
        System.out.printf(" %-25s %8d\n %-25s %11.2flbs\n %-25s $%10.2f\n %-25s %11.2f%%\n"
                 + " %-25s $%10.2f\n %-25s $%10.2f\n\n %-25s $%10.2f\n",
                "Number of bags:", bags,
                "Weight Per Bag:", weight,
                "Price Per Pound:", purchace.getPrice(),
                "Sales Tax:", purchace.getTaxRate(),
                "Sub Total:", purchace.getSale(), 
                "Total Tax:", purchace.getSaleTax(),
                "Total Sale:", purchace.getTotalPrice() );
    }

    

    //output a message that is displayed when the user is done
    public static void Bye()
    {
        System.out.println("Thank You for using the coffee calculator to \n"
                + "calulate the price of your coffee bag. See you next time.");
    }
    
    //prompt user to begin, check for invalid output
    public static boolean begin()
    {
        System.out.println("Would you like to begin Y/N");
        String ans = in.next();
        boolean answering = true;
        while (answering)
        {
            if (ans.equalsIgnoreCase("y"))
            {
                answering = false;
                return true;
            
            }
            else if (ans.equalsIgnoreCase("n"))
            {
                answering = false;
                return false;
            }
            else
            {
                System.out.println("Invalid input! Please enter either Y or N");
                ans = in.next();
            }
        }
        //had to add this to compile
        return true;
        
    }
    //prompt user to repeat
    public static boolean repeat()
    {
        System.out.println("Would you like to continue? Y/N");
        String ans = in.next();
        
        boolean answering = true;
        while (answering)
        {
            if (ans.equalsIgnoreCase("y"))
            {
                answering = false;
                return true;
                
            }
            else if (ans.equalsIgnoreCase("n"))
            {
                answering = false;
                return false;
            }
            else
            {
                System.out.println("Invalid input! Please enter either Y or N");
                ans = in.next();
            }
        }
        return true;
    }
    
}
