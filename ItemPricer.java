//Alec McDaugale
//This program allows the user to enter an item and the price they paid for the
//item and the program calculates the price after a 30% markup

//usint the java util
import java.util.*;

public class ItemPricer 
{
    public  static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        int index;
        //holds the index
        int maxIndex = 10;
        //holds the max index
        double markUp = .30;
        //holds the markup percentage
        double[] price = new double[10];
        //the price array
        double[] priceMarkup = new double[10];
        //marked up price
        String[] name = new String[10];
        //the name array
       
        //greet the user
        GREET_USER();
        
        //take the input form the user with two methods, one to get the name 
        //and the other to get the price
        for (index = 0; index < maxIndex; index++)
        {
            //get name
            name[index] = takeInputItemName();
            //get price
            price[index] = takeInputItemPrice();
            priceMarkup[index] = markUpPrice( price[index], markUp);
        }
        //output the results
        outputResults( maxIndex, name, price, priceMarkup);
        
        //method to say goodbye
        BYE();
        //exit
        System.exit(0);
        
    }
    
    //mehtod to geet the user, is a void method does not return anything
    public static void GREET_USER()
    {
        System.out.println("Welcome to the inventory creator. This program \n"
                + "allows you to create an inventory by entering item names \n"
                + "and price you got it for. This program adds a 30% mark-up \n"
                + "rate to the price to ensure your company is pofitable.");
        
        return;
    }
  //loop these next two methods:
    
    //take the name input
    public static String takeInputItemName()
    {
        //initialize item
        String item = "";
        
        //accept users input
        System.out.println("\nPlease enter the item:");
        item = in.next();
            
        //return the item   
        return item;
            
            
       
    }
    //accept the price from user 
    public static double takeInputItemPrice()
    {
        double price = 0;
        
        System.out.println("Please enter the price of the item:");
        price = in.nextInt();
                    
        //return the price
        return price;
    }
    //mark up price
    public static double markUpPrice(double price, double markUp)
    {
        //add price to the percentage
        price += (price * markUp);
        
        return price;
    }
    
    
    //output the results
    public static void outputResults(int maxIndex,String[] name, double[] price, double[] priceMarkup)
    {
        //print to 10  
        System.out.printf("%10s %10s %10s %10s","item #", "Item", "Price", "New Price" );
        for (int index = 0; index < maxIndex; index++)
        {
            System.out.printf("\n%10d %10s %10.2f %10.2f",index + 1, name[index], price[index],
                    priceMarkup[index]);
        }
    }
    
    //method to say goodbye
    public static void BYE()
    {
        //say bye
        System.out.println("\nThank You for calculating your prices with us.");
    }
}
