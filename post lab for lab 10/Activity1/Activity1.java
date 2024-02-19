package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Activity1 extends Application {

	@Override
	public void start(Stage stage) {
	    	StackPane pane = new StackPane();
	        VBox vBox = new VBox(10);
	        VBox vBox2 = new VBox();
	        HBox box = new HBox();
	        Circle redLight = new Circle(20, Color.WHITE);
	        Circle yellowLight = new Circle(20, Color.WHITE);
	        Circle greenLight = new Circle(20, Color.WHITE);
	        Rectangle rectangle = new Rectangle(50,150);

		CheckBox redCheckBox = new CheckBox("Red");
		CheckBox yellowCheckBox = new CheckBox("Yellow");
		CheckBox greenCheckBox = new CheckBox("Green");

		
		redCheckBox.setOnAction(e -> redLight.setFill(redCheckBox.isSelected() ? Color.RED : Color.WHITE));
		yellowCheckBox.setOnAction(e -> yellowLight.setFill(yellowCheckBox.isSelected() ? Color.YELLOW : Color.WHITE));
		greenCheckBox.setOnAction(e -> greenLight.setFill(greenCheckBox.isSelected() ? Color.GREEN : Color.WHITE));
		 rectangle.setStyle("-fx-border-color: black;");
	        vBox.getChildren().addAll(redLight, yellowLight, greenLight);
	        pane.getChildren().addAll(rectangle,vBox);
	        box.getChildren().addAll(redCheckBox, yellowCheckBox, greenCheckBox);
	        vBox2.getChildren().addAll(pane,box);
	        vBox2.setSpacing(10);
	        vBox.setSpacing(10);
	        box.setSpacing(10);
	        vBox.setAlignment(Pos.CENTER);
	        vBox2.setAlignment(Pos.CENTER);
	        box.setAlignment(Pos.CENTER);
	        Scene scene = new Scene(vBox2, 250, 300);
	        stage.setTitle("Activity1");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
