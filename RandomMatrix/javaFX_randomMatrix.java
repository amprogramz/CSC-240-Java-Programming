//Alec McDaugale
//This is the new and improved random matrix application. It now includes:
//*buttons
//*event handelers to set all to 0, 1, random, or quit. 
//*new and improved GUI with matrix theme for the matrix

//many predefined javafx classes to import
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Group;
import javafx.stage.Stage;
//color
import javafx.scene.paint.*;
//images for use
import javafx.scene.image.*;
//allows for font
import javafx.scene.text.*;
//allows for new input devices like key pressed or mouse clicked
import javafx.scene.input.*;

import javafx.geometry.*;
//for random
import java.math.*;

               
public class javaFX_randomMatrix extends Application 
{   
    //background with image
    public BackgroundImage background = new BackgroundImage(new Image
        ("matrix.jpg"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, 
            BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
    
    //background fill collors
    public BackgroundFill b = new BackgroundFill(Color.BLACK, new CornerRadii
        (.2), new Insets(0,0,0,0));
    public BackgroundFill c = new BackgroundFill(Color.LIGHTGREEN, new 
        CornerRadii(.2), new Insets(0,0,0,0));
    
    //two green borders, one is thicker than the other
    public BorderStroke buttonBorder = new BorderStroke(Color.GREEN, 
            BorderStrokeStyle.SOLID, new CornerRadii(.2), new BorderWidths(1));
    public BorderStroke buttonBorder2 = new BorderStroke(Color.GREEN, 
            BorderStrokeStyle.SOLID, new CornerRadii(.2), new BorderWidths(2) , new Insets(-1,-1,-1,-1));
     
    //this invokes this method as an arg as i understand it
    @Override
    //start
    public void start(Stage primaryStage) 
    {
        //flowPane named begin
        FlowPane begin = new FlowPane();
        //my attempt to format the window, still needs work
        begin.setPadding(new Insets(50, 50, 50, 50));
        begin.setHgap(25);
        begin.setVgap(25);
         
        //define the button object with my newButton method
        Button buttonBegin = newButton("begin");
        //buttonBegin.setAlignment(Pos.BASELINE_CENTER);
        //sets the min width to 75 pixles
        buttonBegin.setMinWidth(75);
        //buttonBegin.setPadding(Insets.);
        //buttonBegin.setLayoutY(150);
       //buttonBegin.setAlignment(Pos.BOTTOM_CENTER);
        
        //buttonBegin.setTextFill(new Color(0, 0, 0, 1));
        //buttonBegin.setOpacity(1);
        //instantiate the pane 
       
        //sets the padding, still working on the format
        
        //begin.setHgap(5);
        //begin.setVgap(5);
        
        //get the cildren onto the stage of the pane
        begin.getChildren().add( intro());
        begin.getChildren().add (buttonBegin);
        
        //i used a matrix themed background for the welcome screen
        begin.setBackground(new Background(background));
        
        
        
        
                
        //put the pane in the scene
        Scene scene = new Scene(begin, 300, 250);
        //scene.setFill(new Color(0,0,0,.98));
        
        
        
        //set the title on the stage
        primaryStage.setTitle("Random Matrix");
        //set resizeable to false, formating for this program is not binded
        primaryStage.setResizable(false);
        //i set the opacity to 5% for a nice window effect, looks cool with the 
        //matrix theme
        //opacity in the primary stage makes the entire window opaque
        primaryStage.setOpacity(.95);
        //stage the scene
        primaryStage.setScene(scene);
        
        //this is like lifting the curtens, shows the window
        primaryStage.show();
        
        // i diddnt use the lombada style here so i could save this for reference
        //i set the next scene as an action event of begin
        buttonBegin.setOnAction(new EventHandler<ActionEvent>() 
        {
            //the method wanted to be called handel
            @Override
            public void handle(ActionEvent event) 
            {
                    //created the matrix in a grid pane view
                    GridPane randomMatrix = new GridPane();
                    
                    //set the background to black
                    randomMatrix.setBackground(new Background(b));
                    //centers the matrix
                    randomMatrix.setAlignment(Pos.CENTER);
                    //sets the padding and i added 2 pixels in between the boxes
                    randomMatrix.setPadding(new Insets(5, 5, 5, 5));
                    randomMatrix.setHgap(2);
                    randomMatrix.setVgap(2);
                    
                    
                    //button created with my newButton method
                    Button set0 = newButton("Reset to 0");
                    //lomboda style, i like it because it has a cleaner apperance
                    //the action event sets all variables to 0
                    set0.setOnAction((ActionEvent event2)->{
                        //debug line
                        System.out.println("set 0");
                        
                        //redeclare all values with my new numstring method
                        for(int row = 10; row < 20; row ++)
                        {
                            for (int column = 0; column < 10; column++)
                            {
                            
                            
                                randomMatrix.add(numString(0), column, row);
                               
                            }
                        }
                    });
                    
                    //sets all variables to 1
                    Button set1 = newButton("Reset to 1");
                    set1.setOnAction((ActionEvent event3)->{
                        //debug
                        System.out.println("set 1");
                        
                        for(int row = 10; row < 20; row ++)
                        {
                            for (int column = 0; column < 10; column++)
                            {
                            
                            
                                randomMatrix.add(numString(1), column, row);
                               
                            }
                        }
                    });
                    
                    //resets all randomly
                    Button setRandom = newButton("Reset Randomly");
                    setRandom.setOnAction((ActionEvent event4)->{
                        System.out.println("Set Randomly");
                        
                        for(int row = 10; row < 20; row ++)
                        {
                            for (int column = 0; column < 10; column++)
                            {
                            
                            
                                randomMatrix.add(RandomNumString(), column, row);
                               
                            }
                    }
                    });
                    
                    //event triggers systen exit
                    Button quit = newButton("Quit");
                    quit.setOnAction((event5)->{
                        System.out.println("quiting");
                        
                        System.exit(0);
                    });
                    
                    //sets the excape key to also exit the program with the  key
                    //event method
                    randomMatrix.setOnKeyPressed(keyEvent->{
                        if(keyEvent.getCode() == KeyCode.ESCAPE )
                        {
                            System.exit(0);
                        }
                    });
                    
                    //adds the buttons to the grid pane set by cordinants, and 
                    //button size
                    randomMatrix.add(set0, 0, 0, 2, 4);
                    randomMatrix.add(set1, 2, 0, 2, 4);
                    randomMatrix.add(setRandom, 4, 0, 3, 4);
                    randomMatrix.add(quit, 8, 30, 2, 4);
                    
                
                    //create nodes with for loop
                    for(int row = 10; row < 20; row ++)
                    {
                        for (int column = 0; column < 10; column++)
                        {
                            
                            //this adds a random number and textfield in order 
                            //through the grid layout. makes things easy.
                            randomMatrix.add(RandomNumString(), column, row);
                            
                        }
                    }
                
                    //create a new scene
                    Scene scene2 = new Scene(randomMatrix,500,400);
                    //scene2.setFill(new Color(1,1,1,.98));
                    
                //holds these form the original primary stage
                    //primaryStage.setTitle("Random Matrix");
                    //primaryStage.setFullScreen(false);
                    //add the scene to the primary stage
                    primaryStage.setScene(scene2);
                    //update and show the next scene
                    primaryStage.show();
                
                
            }
        });
        
        
        
        
        
    }
    //method to return the intro
    public Label intro()
    {
        Label welcome = new Label("Welcome to the Matrix");
        
        System.out.println(welcome.computeAreaInScreen());
        //welcome.setLayoutX(150 - (welcome.getWidth() / 2));
        //welcome.setLayoutY(100);
        //adds color to the text
        welcome.setTextFill(new Color(0,1,0,1));
        //formats
        welcome.setPadding(new Insets(5,5,5,5));
        welcome.setBackground(new Background(b));
        welcome.setFont(new Font("Times New Roman", 24));
        
        //return the label object
        return welcome;
    }
    //new method to create my custom button object
    public Button newButton(String buttonName)
    {
        //initialize
        Button button = new Button(buttonName);
        //set the background
        button.setBackground(new Background(b));
        //fill the text with color
        button.setTextFill(new Color(0,1,0,1));
        //set the first border
        button.setBorder(new Border(buttonBorder));
           
        //when the mouse is hovering
        button.setOnMouseEntered((hover)->{
             //set to the thicker border 2           
            button.setBorder(new Border(buttonBorder2));
                        
        });
        //once the mouse has left
        button.setOnMouseExited(hoverOff->{
            //set the border and the background back to normal
            button.setBorder(new Border(buttonBorder));
            button.setBackground(new Background(b));
        });
        //when the mouse clics on the button
        button.setOnMouseClicked(click->{
            //give it a new highlighted background to show the click
            button.setBackground(new Background(c));
        });
            
        //return the button
        return button;
            
    }
    //the numString method with an int
    public TextField numString(int num)
    {
        //converts the num into string format
        String numString = num + "";
        //the text field is declared
        TextField numInField = new TextField();
        //sets the text
        numInField.setText(numString);
        
        //sets the background black
        numInField.setBackground(new Background(b));
        //This is the only way i could find to make the text green. it uses CSS 
        //to set the style of the text box text color
        numInField.setStyle("-fx-text-inner-color: green;");
        
        //return the textField object
        return numInField;
    }
    //method to return the text field with the random number string in it, i 
    //think it cool that this works
    public TextField RandomNumString()
    {
        //declare and find a random number, in this case 0 or 1
        int randomNumber;
        randomNumber =(int) (Math.random() * 2);
        //debug
        //System.out.println(randomNumber);
        
        //converts to string
        String rand = randomNumber + "";;
        //debug
        //System.out.println(randomNumber);
        
        //create the textfield object to return
        TextField num = new TextField();
        
        //set the text to the converted random num
        num.setText(rand);
        //set background and text color again
        num.setBackground(new Background(b));
        num.setStyle("-fx-text-inner-color: green;");
        
        //return the object
        return num;
                            
    }

    //launch the args in main
   public static void main(String[] args) 

    {
        launch(args);
    }
    
}
