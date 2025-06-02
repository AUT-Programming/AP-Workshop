module org.apworkshop12.timeline {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.apworkshop12.timeline to javafx.fxml;
    exports org.apworkshop12.timeline;
}