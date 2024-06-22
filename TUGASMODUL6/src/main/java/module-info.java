module com.main.tugasmodul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.tugasmodul6 to javafx.fxml;
    exports com.main.tugasmodul6;
}