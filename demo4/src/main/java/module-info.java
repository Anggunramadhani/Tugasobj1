module com.main.demo4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.main.demo4 to javafx.fxml;
    exports com.main.demo4;
}