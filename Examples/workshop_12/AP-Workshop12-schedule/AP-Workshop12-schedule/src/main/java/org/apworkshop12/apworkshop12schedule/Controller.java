package org.apworkshop12.apworkshop12schedule;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    @FXML
    private Label label;

    private Timer timer;
    private int frame = 0;

    @FXML
    public void startAnimation(ActionEvent e) {
        label.setText("Starting...\n");

        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                javafx.application.Platform.runLater(() -> {
                    label.setText(label.getText() + "Frame: " + frame + "\n");
                    frame++;
                    if (frame >= 10) {
                        label.setText(label.getText() + "Completed");
                        timer.cancel();
                    }
                });
            }
        };

        timer.schedule(task, 0, 100); // 0ms delay, 100ms period (10 fps)
    }
}