//alec mcdaugale
        //This program is designed to teach kids to do basic math by taking 
        //them step by step with simple mathmatic problems
        
        //no longer needed, converted to gui
        //java.util.*;
//gui options
import javax.swing.*;

//program name
public class ElementaryCalculator {

    //main method
    public static void main(String[] args) 
    {
        // no longer need
        //Scanner in = new Scanner(System.in);
        //the ints to hold the first and seccond number and the answer
        int num1, num2, answer;
        //string to hold the operator
        String operator;
        //name on title bar
        final String TITLE = "Elementary Calculator";
        //boolean to controle the loop
        boolean done = false;
        //initialize the answer to enter the switch
        answer = 0;
              
        
        //greet user
        JOptionPane.showMessageDialog(null, "Welcome to the elementary calculator",
                TITLE,
                JOptionPane.PLAIN_MESSAGE);
        //enter main loop
        while(!done)
        {
            //get the first number from the user
            num1 = Integer.parseInt( JOptionPane.showInputDialog(null,"Type the 1st number",
                    TITLE,
                    JOptionPane.PLAIN_MESSAGE));
            
             //get the operator number from the user
            
            operator = JOptionPane.showInputDialog(null, 
                    "Pick an operator \n"
                    + " + add "
                    + "\n- subtract"
                    + "\n/ divide,"
                    + "\n* multiply)",
                    TITLE,
                    JOptionPane.PLAIN_MESSAGE
                    );
            
             //get the seccond number from the user
            num2 = Integer.parseInt( JOptionPane.showInputDialog(null, "Type the 2nd number",
                    TITLE,
                    JOptionPane.PLAIN_MESSAGE));
            
        
            //decide wich formula to use based on the operator string
            switch (operator)
            {
                case "+":
                    answer = num1 + num2;
                    break;
                case "-":
                    answer = num1 - num2;
                    break;
                case "/":
                    answer = num1 / num2;
                    break;
                case "*":
                    answer = num1 * num2;
        
            }
            
            //display problem to user with answer
            JOptionPane.showMessageDialog(null, num1 + " " + operator + " " + 
                    num2 + " = " + answer,
                    TITLE,
                    JOptionPane.PLAIN_MESSAGE);
            
            //give the user a user friendly option to continue or quit
            Object[] userMenue= {"continue", "quit"};
            int finished = JOptionPane.showOptionDialog(null,
                    "Continue the mathmatical fun,\n"
                    + "or quit?",
                    TITLE,
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    userMenue,
                    userMenue[0]);
        
            //if finished is the no option
            if(finished == JOptionPane.NO_OPTION)
            {
                //set done as true to exit the loop
                done = true;
            }
            
        
        
        }
        //exit program once loop has been terminated
        System.exit(0);
    }
    
}
