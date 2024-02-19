package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Activity1 extends Application {
    Circle circle = new Circle(50, 50, 20);


    @Override
    public void start(Stage stage) {
    	BorderPane borderPane = new BorderPane();
    	HBox box = new HBox();
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        Button left = new Button("Left");
        Button right = new Button("Right");
        Button up = new Button("Up");
        Button down = new Button("Down");

        box.getChildren().addAll(left, right, up, down);
        box.setSpacing(10);
        box.setAlignment(Pos.CENTER);
        borderPane.setCenter(pane);
        borderPane.setBottom(box);


        MoveHandler moveHandler = new MoveHandler();
        left.setOnAction(moveHandler);
        right.setOnAction(moveHandler);
        up.setOnAction(moveHandler);
        down.setOnAction(moveHandler);

        Scene scene = new Scene(borderPane, 300, 300);
        System.out.println(up.getHeight()+""+up.getWidth());
        stage.setTitle("Activity 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    class MoveHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
                switch (((Button) event.getSource()).getText()) {
                    case "Left":
                        circle.setCenterX(circle.getCenterX() - 10);
                        break;
                    case "Right":
                        circle.setCenterX(circle.getCenterX() + 10);
                        break;
                    case "Up":
                        circle.setCenterY(circle.getCenterY() - 10);
                        break;
                    case "Down":
                        circle.setCenterY(circle.getCenterY() + 10);
                        break;
                }
            }
        }
}