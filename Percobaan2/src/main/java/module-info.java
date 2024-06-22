module com.main.percobaan2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.percobaan2 to javafx.fxml;
    exports com.main.percobaan2;
}