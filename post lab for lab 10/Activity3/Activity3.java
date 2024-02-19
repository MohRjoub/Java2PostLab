package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Activity3 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label fileNameLabel = new Label("File Name:");
		TextField fileNameInput = new TextField();

		Button loadButton = new Button("Load");
		Button saveButton = new Button("Save");
		TextArea fileContent = new TextArea();

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

		loadButton.setOnAction(e -> {
			String fileName = fileNameInput.getText();
			if (!fileName.isEmpty()) {
				File file = new File(fileName);
				if (file.exists() && file.canRead()) {
					try (Scanner scanner = new Scanner(file)) {
						StringBuilder content = new StringBuilder();
						while (scanner.hasNextLine()) {
							content.append(scanner.nextLine()).append("\n");
						}
						fileContent.setText(content.toString());
					} catch (IOException ex) {
						fileContent.setText("Error reading file: " + ex.getMessage());
					}
				} else {
					fileContent.setText("File does not exist or is not readable");
				}
			} else {
				fileContent.setText("Please enter a file name");
			}
		});

		saveButton.setOnAction(e -> {
			String fileName = fileNameInput.getText();
			if (!fileName.isEmpty()) {
				String content = fileContent.getText();
				if (!content.isEmpty()) {
					try (PrintWriter writer = new PrintWriter(fileName)) {
						writer.print(content);
						fileContent.setText("File saved successfully");
					} catch (IOException ex) {
						fileContent.setText("Error saving file: " + ex.getMessage());
					}
				} else {
					fileContent.setText("Please enter some content");
				}
			} else {
				fileContent.setText("Please enter a file name");
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
