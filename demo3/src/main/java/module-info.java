module com.main.demo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.demo3 to javafx.fxml;
    exports com.main.demo3;
}