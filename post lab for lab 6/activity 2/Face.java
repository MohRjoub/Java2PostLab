package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line; 
import javafx.scene.text.Text;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Face extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Ellipse leftEyeOutline = new Ellipse();
        leftEyeOutline.setCenterX(160);
        leftEyeOutline.setCenterY(170);
        leftEyeOutline.setRadiusX(15);
        leftEyeOutline.setRadiusY(12);
        leftEyeOutline.setStroke(Color.BLACK);
        leftEyeOutline.setFill(Color.WHITE);

        Ellipse rightEyeOutline = new Ellipse();
        rightEyeOutline.setCenterX(240);
        rightEyeOutline.setCenterY(170);
        rightEyeOutline.setRadiusX(15);
        rightEyeOutline.setRadiusY(12);
        rightEyeOutline.setStroke(Color.BLACK);
        rightEyeOutline.setFill(Color.WHITE);

        Circle head = new Circle();
        head.setCenterX(200);
        head.setCenterY(200);
        head.setRadius(100);
        head.setStroke(Color.BLACK);
        head.setFill(Color.WHITE);

        Circle leftEye = new Circle();
        leftEye.setCenterX(160);
        leftEye.setCenterY(170);
        leftEye.setRadius(10);
        leftEye.setStroke(Color.BLACK);
        leftEye.setFill(Color.BLACK);

        Circle rightEye = new Circle();
        rightEye.setCenterX(240);
        rightEye.setCenterY(170);
        rightEye.setRadius(10);
        rightEye.setStroke(Color.BLACK);
        rightEye.setFill(Color.BLACK);

        Arc mouth = new Arc();
        mouth.setCenterX(200);
        mouth.setCenterY(230);
        mouth.setRadiusX(50);
        mouth.setRadiusY(20);
        mouth.setStartAngle(180);
        mouth.setLength(180);
        mouth.setType(ArcType.OPEN);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.WHITE);

        Line noseLine1 = new Line(200, 170, 180, 200); 
        noseLine1.setStroke(Color.BLACK);

        Line noseLine2 = new Line(180, 200, 220, 200); 
        noseLine2.setStroke(Color.BLACK);

        Line noseLine3 = new Line(220, 200, 200, 170); 
        noseLine3.setStroke(Color.BLACK);
        
        Text name = new Text("Mohammad Rjoub");
        name.setLayoutX(160);
        name.setLayoutY(350);
        pane.getChildren().addAll(head, leftEyeOutline, rightEyeOutline, leftEye, rightEye, mouth, noseLine1, noseLine2, noseLine3,name);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Rjoub");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
