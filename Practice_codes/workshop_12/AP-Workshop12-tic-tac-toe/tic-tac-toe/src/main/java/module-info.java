module org.apworkshop12.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.web;
    requires javafx.media;

    opens org.apworkshop12.tictactoe.controllers to javafx.fxml;
    opens org.apworkshop12.tictactoe to javafx.fxml;
    exports org.apworkshop12.tictactoe;
}