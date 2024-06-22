package com.main.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public abstract class LoginGUI extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Login Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Welcome to library");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Button loginButton = new Button("1.Login as student");
        Button loginButton2 = new Button("2.Login as admin");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().addAll(loginButton, loginButton2);
        grid.add(hbBtn, 1, 4);

        Text loginMessage = new Text();
        grid.add(loginMessage, 1, 6);


        loginButton.setOnAction(e -> showHalloLogin());
        loginButton2.setOnAction(e -> showHalloLogin2());

        primaryStage.show();
    }

    private void showHalloLogin() {
        GridPane grid = new GridPane();
        Stage newStage = new Stage();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);
        newStage.setScene(scene);
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        Text loginMessage = new Text();
        grid.add(loginMessage, 1, 6);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userNameTextField = new TextField();
        grid.add(userNameTextField, 1, 1);

        Label Nim = new Label("NIM:");
        grid.add(Nim, 0, 2);

        TextField NimTextField = new TextField();
        grid.add(NimTextField, 1, 2);

        Button Button1 = new Button("Login");
        Button logoutButton = new Button("Log Out");

        Button1.setOnAction(e -> {
            String username = userNameTextField.getText();
            String NIM = NimTextField.getText();

            if (NIM.equals("202310370311077") && username.equals("Anggun Ramadhani")) {
                loginMessage.setText("Login Successful");
                loginMessage.setFill(Color.GREEN);


                logoutButton.setOnAction(event -> {
                    newStage.close();
                    primaryStage.show();
                });

                VBox buttonBox = new VBox(10, logoutButton);
                buttonBox.setAlignment(Pos.CENTER);
                grid.add(buttonBox, 1, 8);
            } else {
                loginMessage.setText("Password atau Username salah");
                loginMessage.setFill(Color.RED);
            }
        });

        vbox.getChildren().addAll(grid, Button1, logoutButton);

        Scene newScene = new Scene(vbox, 300, 200);
        newStage.setScene(newScene);
        newStage.show();
    }

    private void showHalloLogin2() {
        GridPane grid = new GridPane();
        Stage newStage = new Stage();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        Text loginMessage = new Text();
        grid.add(loginMessage, 1, 6);
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userNameTextField = new TextField();
        grid.add(userNameTextField, 1, 1);

        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            String username = userNameTextField.getText();
            String password = passwordField.getText();

            if (username.equals("admin") && password.equals("admin")) {
                loginMessage.setText("Login Successful");
                loginMessage.setFill(Color.GREEN);
            } else {
                loginMessage.setText("Password atau Username salah");
                loginMessage.setFill(Color.RED);
            }
        });

        Button backButton = new Button("Kembali");
        backButton.setOnAction(e -> {
            newStage.close();
            primaryStage.show();
        });

        vbox.getChildren().addAll(grid, loginButton, backButton);

        Scene newScene = new Scene(vbox, 300, 200);
        newStage.setScene(newScene);
        newStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


    public void menu() {
        Stage adminMenuStage = new Stage();


    }
}



