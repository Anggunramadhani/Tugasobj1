module com.main.demo5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.main.demo5 to javafx.fxml;
    exports com.main.demo5;
}