module org.apworkshop12.apworkshop12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.apworkshop12.apworkshop12 to javafx.fxml;
    exports org.apworkshop12.apworkshop12;
}