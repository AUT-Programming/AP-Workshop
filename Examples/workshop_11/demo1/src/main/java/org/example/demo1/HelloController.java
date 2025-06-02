package org.example.demo1;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;

public class HelloController {

    @FXML
    private Button myBotton;

    @FXML
    void onButtonClicked(MouseEvent event) {
        System.out.println("hello there");
    }

    @FXML
    void onEnterPresed(KeyEvent event) {
        System.out.println("User pressed enter");
    }

    @FXML
    public void initialize(){
        System.out.println("hello");

        myBotton.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, mouseEvent -> {
            System.out.println("helle from here AAAAAA");
        });

        myBotton.setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent event) {
                System.out.println(" user scrolled");
            }
        });
    }

}
