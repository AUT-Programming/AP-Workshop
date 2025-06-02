package org.apworkshop12.apworkshop12;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    private int progress = 0;
    @FXML
    private Label label;

    @FXML
    public void execute(ActionEvent e) {
        label.setText("0%\n");
        Thread taskThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    progress++;

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String text = label.getText() + (progress * 10) + "%" + '\n';
                            label.setText(text);
                            if (progress == 10) {
                                text = label.getText() + "Completed" + '\n';
                                label.setText(text);
                            }
                        }
                    });

                }
            }
        });
        taskThread.start();
    }
}

