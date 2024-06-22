module com.main.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.demo1 to javafx.fxml;
    exports com.main.demo1;
}