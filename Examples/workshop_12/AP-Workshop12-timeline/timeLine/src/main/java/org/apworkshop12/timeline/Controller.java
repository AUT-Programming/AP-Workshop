package org.apworkshop12.timeline;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Controller {
    private int progress = 0;

    @FXML
    private Label label;

    @FXML
    public void start(ActionEvent e) {
        label.setText("0%\n");
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), event -> {
            progress++;
            String text = label.getText() + (progress * 10) + "%\n";
            label.setText(text);
            if (progress == 10) {
                label.setText(label.getText() + "Completed\n");
            }
        }));
        timeline.setCycleCount(10);
        timeline.play();
    }
}