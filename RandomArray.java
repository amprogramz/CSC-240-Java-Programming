/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

/**
 *
 * @author David
 */
public class RandomArray extends Application 
{
    
    public RandomArray()
    {
        System.out.println("Test constructor is invoked");
    }  
    @Override
    public void start(Stage primaryStage)
    {
        System.out.println("Start method invoked");
        //circle
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.AQUAMARINE);
        
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        
        Scene scene = new Scene(pane,200,200);
        primaryStage.setTitle("circle test");
        primaryStage.setScene(scene);
        primaryStage.show( );
        
        
        
        //button
        /*
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("yea"));
        Scene scene = new Scene(pane,200,50);
        primaryStage.setTitle("this is a test title");
        primaryStage.setScene(scene);
        primaryStage.show();//shows primary stage
        */
    }
    public static void main(String []args)
    {
        System.out.println("Launch app");
        Application.launch(args);
    }
    
    //@Override
    /*public void start(Stage primaryStage) 
    {
        Button btn = new Button();
        btn.setText("begin");
        btn.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Random Array");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) 
    {
        launch(args);
    }
    */
}
