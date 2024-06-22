package data;

import com.main.demo.LoginGUI;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Admin extends LoginGUI {


    @Override
    public void menu(){
        Stage adminMenuStage = new Stage();
        adminMenuStage.setTitle("Menu admin");

        Label sceneTitle = new Label("Menu Admin");
        sceneTitle.setFont(Font.font("Times New Roman", FontWeight.BOLD,20));
        sceneTitle.setStyle("-fx-twxt-fill: #A91D3A");

        Button addStudentButton = new Button("1.Tambah Mahasiswa");
        Button displayStudentButton = new Button("2.Daftar Mhasiswa");
        Button displayBook = new Button("3.Daftar Buku");
        Button addBookButton = new Button("4.Tambah Buku");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        grid.add(sceneTitle,0,1);

        grid.add(addStudentButton, 2,0);
        grid.add(displayStudentButton, 2,1);
        grid.add(displayBook, 2,2);
        grid.add(addBookButton,2,3);

        grid.setVgap(10);
        grid.setHgap(6);

        Scene scene = new Scene(grid, 1360, 720);
        adminMenuStage.setScene(scene);
        adminMenuStage.show();

        addStudentButton.setOnAction(event -> {


            addstudent();
            adminMenuStage.close();//belum di perbaiki
        });

        displayStudentButton.setOnAction(event -> {
            displaystudent();
            adminMenuStage.close();
        });

        addBookButton.setOnAction(event -> {
            adminMenuStage.close();
        });

        logoutButton.setOnAction(event -> {
            LibrarySystem librarySystemObj = new LibrarySystem();
            librarySystemObj.start(new Stage());
            adminMenuStage.close();
        });

    }

    public void addstudent() {
        Stage addStudentStage = new Stage();
        addStudentStage.setTitle("Tambah Mahasiswa");
        Label sceneTitle    = new Label("Tambah Mahasiswa");
        Label nameLabel     = new Label("Nama");
        Label nimLabel      = new Label("NIM");
        Label fakultasLabel = new Label("Fakultas");
        Label jurusanLabel  = new Label("Jurusan");
        Label sumbitFailed = new Label("NIM harus 15 digit!");
        sumbitFailed.setVisible(false);


        TextField nameField     = new TextField();
        TextField nimField      = new TextField();
        TextField fakultasField = new TextField();
        TextField jurusanField  = new TextField();


        sceneTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        nameLabel.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));
        nimLabel.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));
        fakultasLabel.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));
        jurusanLabel.setFont(Font.font("Calibri Body", FontWeight.NORMAL, 15));


        sceneTitle.setStyle("-fx-text-fill: #A91D3A;");
        sumbitFailed.setStyle("-fx-text-fill: #FF1E1E;");


        Button submitButton = new Button("Submit");


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.add(sceneTitle, 0,0);

        grid.add(nameLabel, 0,1);
        grid.add(nimLabel, 0,2);
        grid.add(fakultasLabel, 0,3);
        grid.add(jurusanLabel, 0,4);

        grid.add(nameField, 1,1);
        grid.add(nimField, 1,2);
        grid.add(fakultasField, 1,3);
        grid.add(jurusanField, 1,4);

        grid.add(submitButton,1,5);

        grid.add(sumbitFailed, 0,5);

        grid.setVgap(10);
        grid.setHgap(5);

        Scene scene = new Scene(grid, 1360, 720);
        addStudentStage.setScene(scene);
        addStudentStage.show();

        submitButton.setOnAction(event -> {
            if (nimField.getText().length() == 15) {
                Admin adminObj = new Admin();

                Student.arr_userStudent.add(new Student.UserStudent(nameField.getText(), nimField.getText(), fakultasField.getText(), jurusanField.getText()));
                adminObj.menu();
                addStudentStage.close();

            } else {
                sumbitFailed.setVisible(true);
            }
        });


    }


}
