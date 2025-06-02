package org.apworkshop12.tictactoe.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;

import java.net.URL;
import java.util.*;

public class GameController {
    @FXML private Label lblPlayer, lblTimer;
    @FXML private GridPane grid;
    @FXML private ToggleButton btnMusic;

    private String playerName;
    private Timeline timer;
    private int timeLeft = 120;
    private MediaPlayer mediaPlayer;
    private Button[][] cells = new Button[3][3];
    private char[][] board = new char[3][3];

    public void setPlayerName(String name) {
        playerName = name;
        lblPlayer.setText(name);
    }

    @FXML
    public void initialize() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                Button btn = (Button) getNodeByRowColumnIndex(r, c, grid);
                cells[r][c] = btn;
                board[r][c] = ' ';
                btn.setText("");
                btn.setDisable(false);
            }
        }

        URL mediaUrl = getClass().getResource("/org/apworkshop12/tictactoe/music/background.mp3");
        Media media = new Media(mediaUrl.toExternalForm());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.setVolume(1.0);
        mediaPlayer.setAutoPlay(true);

        lblTimer.setText(timeLeft + "s");
        timer = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            timeLeft--;
            lblTimer.setText(timeLeft + "s");
            if (timeLeft <= 0) {
                endGame("Draw! Time's up.");
            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();
    }

    @FXML
    public void onCellClick(ActionEvent e) {
        if (grid.isDisabled()) return;

        Button btn = (Button) e.getSource();
        int r = GridPane.getRowIndex(btn), c = GridPane.getColumnIndex(btn);
        if (board[r][c] != ' ') return;

        makeMove(r, c, 'X');
        if (checkWin('X')) {
            endGame(playerName + " wins!");
            return;
        }
        if (isBoardFull()) {
            endGame("Draw!");
            return;
        }

        makeBotMove();
    }

    private void makeMove(int r, int c, char sym) {
        board[r][c] = sym;
        cells[r][c].setText(String.valueOf(sym));
    }

    private void makeBotMove() {
        List<int[]> empties = new ArrayList<>();
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board[r][c] == ' ')
                    empties.add(new int[]{r, c});
        if (empties.isEmpty()) return;

        int[] m = empties.get(new Random().nextInt(empties.size()));
        makeMove(m[0], m[1], 'O');

        if (checkWin('O')) {
            endGame("Robot wins!");
        } else if (isBoardFull()) {
            endGame("Draw!");
        }
    }

    private boolean checkWin(char sym) {
        for (int i = 0; i < 3; i++)
            if ((board[i][0] == sym && board[i][1] == sym && board[i][2] == sym) ||
                    (board[0][i] == sym && board[1][i] == sym && board[2][i] == sym))
                return true;
        if ((board[0][0] == sym && board[1][1] == sym && board[2][2] == sym) ||
                (board[0][2] == sym && board[1][1] == sym && board[2][0] == sym))
            return true;
        return false;
    }

    private boolean isBoardFull() {
        for (char[] row : board)
            for (char cell : row)
                if (cell == ' ') return false;
        return true;
    }

    private void endGame(String message) {
        timer.stop();

        mediaPlayer.stop();

        grid.setDisable(true);

        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.setHeaderText(null);
            alert.showAndWait();

            onBack(null);
        });
    }

    @FXML
    public void onToggleMusic(ActionEvent e) {
        if (btnMusic.isSelected()) mediaPlayer.setVolume(0);
        else mediaPlayer.setVolume(100);
    }

    @FXML
    public void onBack(ActionEvent e) {
        timer.stop();
        mediaPlayer.stop();
        try {
            Stage stage = (Stage) grid.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/apworkshop12/tictactoe/menu.fxml"));
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(getClass().getResource("/org/apworkshop12/tictactoe/style.css").toExternalForm());
            stage.setScene(scene);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private javafx.scene.Node getNodeByRowColumnIndex(final int row, final int column, GridPane gridPane) {
        for (javafx.scene.Node node : gridPane.getChildren()) {
            if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column)
                return node;
        }
        return null;
    }
}
