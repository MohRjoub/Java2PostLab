package application;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Activity3 extends Application {

	private boolean turn = true; 

	@Override
	public void start(Stage primaryStage) {

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				Label label = new Label("");

				label.setFont(new Font(30));
				label.setPrefSize(80, 80);
				label.setAlignment(Pos.CENTER);
				label.prefWidthProperty().bind(Bindings.divide(pane.widthProperty(), 3));
				label.prefHeightProperty().bind(Bindings.divide(pane.heightProperty(), 3));
				label.setStyle("-fx-border-color: red;-fx-border-width: 3;");
				pane.add(label, j, i);

				label.setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						if ("".equals(label.getText())) {
							if (turn) {
								label.setText("1");
							} else {
								label.setText("0");
							}
							turn = !turn;
						}
					}
				});

			}
		}

		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Tic-Tac-Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
