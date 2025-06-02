package org.apworkshop12.tictactoe.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NameController {
    @FXML private TextField tfName;

    @FXML
    public void onPlay(ActionEvent e) throws Exception {
        String name = tfName.getText().trim();
        if (name.isEmpty()) name = "Player";

        Stage stage = (Stage)((javafx.scene.Node)e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/apworkshop12/tictactoe/game.fxml"));
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("/org/apworkshop12/tictactoe/style.css").toExternalForm());

        GameController ctrl = loader.getController();
        ctrl.setPlayerName(name);

        stage.setScene(scene);
    }
}
