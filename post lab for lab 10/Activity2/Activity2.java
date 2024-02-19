package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Activity2 extends Application {

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
        RadioButton redButton = new RadioButton("Red");
        RadioButton yellowButton = new RadioButton("Yellow");
        RadioButton greenButton = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        redButton.setToggleGroup(group);
        yellowButton.setToggleGroup(group);
        greenButton.setToggleGroup(group);

        redButton.setOnAction(e -> {
            redLight.setFill(Color.RED);
            yellowLight.setFill(Color.WHITE);
            greenLight.setFill(Color.WHITE);
        });

        yellowButton.setOnAction(e -> {
            redLight.setFill(Color.WHITE);
            yellowLight.setFill(Color.YELLOW);
            greenLight.setFill(Color.WHITE);
        });

        greenButton.setOnAction(e -> {
            redLight.setFill(Color.WHITE);
            yellowLight.setFill(Color.WHITE);
            greenLight.setFill(Color.GREEN);
        });
        rectangle.setStyle("-fx-border-color: black;");
        vBox.getChildren().addAll(redLight, yellowLight, greenLight);
        pane.getChildren().addAll(rectangle,vBox);
        box.getChildren().addAll(redButton, yellowButton, greenButton);
        vBox2.getChildren().addAll(pane,box);
        vBox2.setSpacing(10);
        vBox.setSpacing(10);
        box.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox2.setAlignment(Pos.CENTER);
        box.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox2, 200, 300);
        stage.setTitle("Activity2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

