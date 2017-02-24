//Alec McDaugale
//This program allows you to calculate a loan and how much it cost to pay off for
//the number of months you choose, ive been having a problem finding out how you 
//produced the principal ammount to produce an even monthly payment,I can't wait 
//to see the solution


//New In Update:
   //added system exit
   
   
   
   
   

//diddnt use
//import javax.swing.*;
import java.util.*;

public class LoanAmortizationCalculator 
{

   
    public static void main(String[] args) 
    {
        //define scanner
        Scanner in = new Scanner(System.in);
        //setinal value
        boolean done = false;
        
        //user input variables
        double loanAmmount, aprPercentage;
        int months;
        
        //calculated variables
        double apr, aprPerMonth, monthlyPayment, totalPayed, intrestAccumulator;
        double[] monthlyIntrest, principal, balance;
        
        
        // this does not repeat because the user should only see the intro on the  
        // first execution of the loop
        System.out.println("Welcome to the loan shark calculator. This program\n"
                + "can help you find out how much you will owe on your loan\n"
                + "based on your loan ammount, the number of months you have to\n"
                + "pay and the APR.\n "
                + "\n  Lets Begin:\n" );
        
        //main loop
        //executes untill done "setinal value"
        while ( !done )
        {
            //prompt user to enter the loan ammount
            System.out.println("\nEnter the loan ammount:");
            loanAmmount = in.nextDouble();
            
            //prompt the user for the number of monts they have to pay loan
            System.out.println("Enter the number of months you have to pay the "
                    + "loan:");
            months = in.nextInt();
            
            //prompt user for the apr %
            System.out.println("Enter the APR or Anual Percentage Rate:");
            aprPercentage = in.nextDouble();
            //assuning a montly payment is in account divide the total percent 
            //by 12 months in a year
            aprPerMonth = aprPercentage / 12;
            //then convert it for multiplycation
            apr = aprPerMonth / 100;
            
            //initialize arrays to hold the data
            monthlyIntrest = new double[months];
            //this array has one more spot to hold the initial value in 0
            balance = new double[months + 1];
            balance[0] = loanAmmount;
            principal = new double[months];
            
            //initialize the accumulator to 0
            intrestAccumulator = 0;
            
            // the div month is the month that is divided by the balance to get 
            //the estimated principal, decrimental value
            int divMonth = months;
            
            //for all of the monts calculate the loan
            for(int month = 1; month <= months; month++)
            {
                
               //the intrest is equal to the ballance times the apr
               monthlyIntrest[month - 1] = balance[month - 1] * apr;
               //the principal is the balance over the divisible month, inverse
               principal[month - 1] = balance[month - 1] / divMonth;
               //the balance is the principle and the intrest subtracted from the 
               //current balance
               balance[month] =  balance[month-1] - (principal[month - 1] + 
                       monthlyIntrest[month-1]);
               //accumulates the montly intrest
               intrestAccumulator += monthlyIntrest[month - 1];
               //post decrement the divMonth
               divMonth--;
            }
            
            //estimate the monthly payment
            monthlyPayment = principal[0] + monthlyIntrest[0];
            
            //the total paid is the intrest added to the loan, extra money paid 
            //must be returned to the loaner
            totalPayed = intrestAccumulator + loanAmmount;
            
            //print the monthly payment and the total paid
            System.out.printf("\nThe monthly payment is:  %.2f \nThe total paid"
                    + "with intrest is:  %.2f \n\n", monthlyPayment, totalPayed);
            
             //print the lablels first
            System.out.printf("%10s %10s %10s %10s \n", "Month", "Intrest", "Principal",
                     "Balance");
            //for loop to print the results
            for(int month = 1; month <= months; month++)
            {
                //format the outputs to print with the for loop
                System.out.printf("%10d %10.2f %10.2f %10.2f \n", month, monthlyIntrest[month - 1],
                       principal[month - 1], balance[month]);
                
            }
            
            //prompt the user to continue and accept user input
            System.out.println("\nWould you like to continue(Y/N)?");
            String answer = in.next();
            
            //boolean to enter the error checking loop
            boolean corect = false;
            while(!corect)
            {
                //if the user enters n input is corect and the user is done
                if (answer.equalsIgnoreCase("n"))
                {
                    corect = true;
                    done = true;
                }
                //if the user enters y input is correct and the user reinputs data
                else if(answer.equalsIgnoreCase("y"))
                {
                    corect = true;
                    done = false;
                }
                //otherwise the input is unacceptable and the user must reinput 
                //their answer untill it is acceptable
                else
                {
                    System.out.println(answer + " is not a valid input, please choose "
                        + "either (Y/N)!");
                        answer = in.next();
                }
            }
            
            
            
            
            
            
        }
        
        //added system exit
        System.exit(0);
    }
    
}
