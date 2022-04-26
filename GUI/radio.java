package com.example.demo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class wasted extends Application {
    public void start(Stage stg){

        FlowPane root = new FlowPane(15,15);
        Scene s = new Scene(root, 750, 750);
        stg.setScene(s);
        stg.setTitle("Radio Button Demo!");

        RadioButton rb1 = new RadioButton("BTech");
        RadioButton rb2 = new RadioButton("MTech");
        RadioButton rb3 = new RadioButton("BCom");
        Label l2 = new Label();
        RadioButton r = new RadioButton();
        ToggleGroup tg = new ToggleGroup();
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        rb3.setToggleGroup(tg);

        root.addEventHandler(ActionEvent.ANY, (ActionEvent ae) ->
        {r = (RadioButton)tg.getSelectedToggle();
                System.out.println(r.getText());}
        );

        root.getChildren().addAll(rb1,rb2,rb3,l2,r);
        stg.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
