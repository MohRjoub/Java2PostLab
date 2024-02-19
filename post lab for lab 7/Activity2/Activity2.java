package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Activity2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label fileNameLabel = new Label("File Name:");
        TextField fileNameInput = new TextField();

        Button loadButton = new Button("Load");
        Button saveButton = new Button("Save");
        Label fileContent = new Label("I Dont like javafx!!!");

        HBox root = new HBox(10);
        root.getChildren().addAll(fileNameLabel, fileNameInput, loadButton);
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(root);
        borderPane.setCenter(fileContent);
        borderPane.setBottom(saveButton);
        borderPane.setAlignment(root, Pos.CENTER);
        borderPane.setAlignment(fileContent, Pos.CENTER);
        borderPane.setAlignment(saveButton, Pos.CENTER);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setTitle("File Editor Interface");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
