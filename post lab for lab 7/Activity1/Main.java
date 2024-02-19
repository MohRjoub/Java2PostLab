package application;
	
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        

        Random random = new Random();


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                Label label = new Label(String.valueOf(random.nextInt(2)));

                label.setFont(new Font(30));
                label.setPrefSize(80, 80);
                label.setAlignment(Pos.CENTER);
                label.prefWidthProperty().bind(Bindings.divide(pane.widthProperty(), 3));
                label.prefHeightProperty().bind(Bindings.divide(pane.heightProperty(), 3));
                label.setStyle("-fx-border-color: red;-fx-border-width: 3;");

                pane.add(label, j, i);
            }
        }


        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Display random 0 or 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

