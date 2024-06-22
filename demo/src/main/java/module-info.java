module com.main.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.demo to javafx.fxml;
    exports com.main.demo;
}