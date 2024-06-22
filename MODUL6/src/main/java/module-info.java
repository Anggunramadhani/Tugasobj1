module com.main.modul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.modul6 to javafx.fxml;
    exports com.main.modul6;
}