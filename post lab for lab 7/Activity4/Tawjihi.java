package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Tawjihi extends Application {


	@Override
	public void start(Stage primaryStage) {


		BorderPane root = new BorderPane();

		GridPane top = new GridPane();
		top.setHgap(10);
		top.setVgap(10);
		top.setAlignment(Pos.CENTER);

		Label lblID = new Label("ID:");
		Label lblName = new Label("Name:");
		Label lblGender = new Label("Gender:");
		Label lblSeatNum = new Label("Seat Num:");
		Label lblBranch = new Label("Branch:");
		Label lblYear = new Label("Year:");
		Label lblSchool = new Label("School:");

		TextField txtID = new TextField("2472021");
		TextField txtName = new TextField("Nizar Banat");
		TextField txtGender = new TextField("M");
		TextField txtSeatNum = new TextField("2781978");
		TextField txtBranch = new TextField("Scientific");
		TextField txtYear = new TextField("2022");
		TextField txtSchool = new TextField("Birzeit");
		txtGender.setPrefHeight(10);
		txtGender.setPrefWidth(30);
		
		top.add(lblID, 0, 0);
		top.add(txtID, 1, 0);
		top.add(lblName, 2, 0);
		top.add(txtName, 3, 0);
		top.add(lblGender, 4, 0);
		top.add(txtGender, 5, 0);
		top.add(lblSeatNum, 0, 2);
		top.add(txtSeatNum, 1, 2);
		top.add(lblBranch, 2, 2);
		top.add(txtBranch, 3, 2);
		top.add(lblYear, 0, 3);
		top.add(txtYear, 1, 3);
		top.add(lblSchool, 2, 3);
		top.add(txtSchool, 3, 3);

		ImageView photo = new ImageView(new Image("file:/C:/Users/ACTC/eclipse-workspace/lab7/src/application/نزار_بنات.webp.png"));
		photo.setFitWidth(200);
		photo.setFitHeight(250);
		
		GridPane center = new GridPane();
		center.setHgap(10);
		center.setVgap(10);
		center.setAlignment(Pos.CENTER);

		Label lblSubject = new Label("Subject");
		Label lblType = new Label("Type");
		Label lblScore = new Label("Mark");

		lblSubject.setFont(Font.font(15));
		lblType.setFont(Font.font(15));
		lblScore.setFont(Font.font(15));
		lblSubject.setStyle("-fx-text-fill: blue");
		lblType.setStyle("-fx-text-fill: blue");
		lblScore.setStyle("-fx-text-fill: blue");

		center.add(lblSubject, 0, 0);
		center.add(lblType, 1, 0);
		center.add(lblScore, 2, 0);

		Label lblMath = new Label("Math");
		Label lblEnglish = new Label("English");
		Label lblBiology = new Label("Biology");
		Label lblChemistry = new Label("Chemistry");
		Label lblMathType = new Label("Mandatory");
		Label lblEnglishType = new Label("Mandatory");
		Label lblBiologyType = new Label("Elective");
		Label lblChemistryType = new Label("Elective");
		Label lblMathScore = new Label("185/200");
		Label lblEnglishScore = new Label("94/100");
		Label lblBiologyScore = new Label("95/100");
		Label lblChemistryScore = new Label("88/100");

		center.add(photo, 3, 0, 1, 7);
		center.add(lblMath, 0, 1);
		center.add(lblEnglish, 0, 2);
		center.add(lblBiology, 0, 3);
		center.add(lblChemistry, 0, 4);
		center.add(lblMathType, 1, 1);
		center.add(lblEnglishType, 1, 2);
		center.add(lblBiologyType, 1, 3);
		center.add(lblChemistryType, 1, 4);
		center.add(lblMathScore, 2, 1);
		center.add(lblEnglishScore, 2, 2);
		center.add(lblBiologyScore, 2, 3);
		center.add(lblChemistryScore, 2, 4);

		Label lblAverage = new Label("Average = 93%");
		lblAverage.setFont(Font.font(20));
		lblAverage.setStyle("-fx-text-fill: green");

		center.add(lblAverage, 0, 5, 3, 1);

		HBox bottom = new HBox(10);
		bottom.setAlignment(Pos.CENTER);

		Button btnPrior = new Button("Prior");
		Button btnNext = new Button("Next");

		bottom.getChildren().addAll(btnPrior, btnNext);

		root.setTop(top);
		root.setCenter(center);
		root.setBottom(bottom);

		Scene scene = new Scene(root, 550, 550);

		primaryStage.setTitle("Tawjihi Editor");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
