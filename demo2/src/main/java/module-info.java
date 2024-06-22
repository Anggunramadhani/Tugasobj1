module com.main.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.demo2 to javafx.fxml;
    exports com.main.demo2;
}