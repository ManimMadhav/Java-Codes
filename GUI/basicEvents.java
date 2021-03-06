//add two numbers and display to user using JavaFX

package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
        public void start(Stage stg){

            Rectangle r = new Rectangle(200,100,400,400);
            r.setFill(Color.BLUE);
            Label lb1 = new Label("Number 1: ");
            Label lb2 = new Label("Number 2: ");
            Button b1 = new Button("Add Numbers.");
            TextField tf1 = new TextField();
            TextField tf2 = new TextField();

            FlowPane root = new FlowPane(Orientation.VERTICAL);
            Scene s1 = new Scene(root, 800, 600, Color.BLACK);
            stg.setScene(s1);

            stg.setTitle("Sample App");
            Label out = new Label("Sum of the two numbers is: ");
            Label response = new Label();
            b1.setOnAction(new EventHandler<ActionEvent>(){
                public void handle(ActionEvent e){
                    int x = Integer.parseInt(tf1.getText());
                    int y = Integer.parseInt(tf2.getText());
                    int sum = x+y;
                    response.setText(Integer.toString(sum));
                }
            });
            root.getChildren().addAll(lb1,tf1,lb2,tf2,b1,out,response);
            stg.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

