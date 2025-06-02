package org.apworkshop12.tictactoe.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {
    @FXML
    public void onStart(ActionEvent e) throws Exception {
        Stage stage = (Stage)((javafx.scene.Node)e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/apworkshop12/tictactoe/name.fxml"));
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("/org/apworkshop12/tictactoe/style.css").toExternalForm());
        stage.setScene(scene);
    }

    @FXML
    public void onExit() {
        System.exit(0);
    }
}
