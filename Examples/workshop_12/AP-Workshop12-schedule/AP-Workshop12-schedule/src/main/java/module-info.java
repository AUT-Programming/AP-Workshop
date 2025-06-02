module org.apworkshop12.apworkshop12schedule {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.apworkshop12.apworkshop12schedule to javafx.fxml;
    exports org.apworkshop12.apworkshop12schedule;
}