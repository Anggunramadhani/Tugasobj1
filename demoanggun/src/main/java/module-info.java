module com.main.demoanggun {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.demoanggun to javafx.fxml;
    exports comm;
}