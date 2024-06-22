package com.main.modul6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        GridPane grid = new GridPane();

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });










    }

    public static void main(String[] args) {
        launch();
    }
}
/*Button btn1 = new Button("Button 1");
Button btn2 = new Button("Button 2");
        vbox.getChildren().addAll(btn1,btn2);

VBox root = new VBox(20);
        root.getChildren().addAll(vbox);
Scene scene = new Scene(root, 400, 600);
        stage.setTitle("Button Test");
        stage.setScene(scene);
        stage.show();//

        stage.setTitle("Hello!");//judul aplikasi
        stage.setScene(scene);//tampilan diagram
        stage.show();//agar aplikasinya jalan(muncul)//*/