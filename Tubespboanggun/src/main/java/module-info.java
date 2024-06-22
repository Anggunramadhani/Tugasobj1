module com.main.tubespboanggun {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.tubespboanggun to javafx.fxml;
    exports com.main.tubespboanggun;
}