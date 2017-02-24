//Alec McDaugale//
//////////////////
//This is the seccond version of the flashcard game presented to the user with 
//a nice GUI interface using JOptionPane

//import the java utill for the scanner
import java.util.*;
//import the math to use random
import java.math.*;
//allows joptionpane
import javax.swing.*;

//name of program
public class flashCardsMathTutor {
    
    //main method
    public static void main(String[] args) {
        //scanner to retrive user input
        Scanner userIn = new Scanner(System.in);
        
        //random number 1
        int num1 = 0;
        //random number 2   
        int num2 = 0;
        //the sum of the random numbers
        int sum = num1+ num2;
    
        //holds the users answer
        int usersAnswer = 0;
        
     
        //prints the instructions
        JOptionPane.showMessageDialog(null, "Welcome to the Math Tutor \n"
             + " adition problems will be presented in a random order, answer \n"
             + " the problem and the tutor will provide you with the results.\n\n"
                , "Flash Cards Math Tutor", JOptionPane.PLAIN_MESSAGE);
     
        //assighns a random number between 0 and 100 to num1
        num1 = (int) (Math.random()*101);
        //assighns a random number between 0 and 100 to num1
        num2 = (int) (Math.random()*101);
        
        //calculates the sum
        sum = num1 + num2;
        
        //presents the adition problem to the user and takes the users answer
        usersAnswer = Integer.parseInt(JOptionPane.showInputDialog( "Answer the "
                + "problem: \n" + num1 + "+" + num2 + "="));
        
        
        
        //if the users answer is correct, inform the user they got the problem
        //correct
        if (usersAnswer == sum)
        {
            JOptionPane.showMessageDialog(null,  "Fantastic, your answer is "
                    + "correct.", "Flash Cards Math Tutor",
                    JOptionPane.PLAIN_MESSAGE);
        }
        //otherwise tell the user they have lost and present them with the 
        //correct answer to the problem
        else
        {
            JOptionPane.showMessageDialog(null, "Incorect, The correct "
                    + "answer is " + sum + ".", "Flash Cards Math Tutor", 
                    JOptionPane.PLAIN_MESSAGE);
        }
            
        //exit system
        System.exit(0);
    }
    
}
