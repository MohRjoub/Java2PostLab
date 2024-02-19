package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle cell = new Rectangle();
                cell.widthProperty().bind(grid.widthProperty().divide(8));
                cell.heightProperty().bind(grid.heightProperty().divide(8));

                Color color = (row + col) % 2 == 0 ? Color.WHITE : Color.BLACK;
                cell.setFill(color);

                grid.add(cell, col, row);
            }
        }

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Checkerboard");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
