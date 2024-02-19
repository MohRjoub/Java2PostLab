package application;
	

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class Main extends Application {

	    @Override
	    public void start(Stage primaryStage) {
	        AnchorPane anchorPane = new AnchorPane();

	        ImageView imgImage = new ImageView("file:/C:/Users/ACTC/eclipse-workspace/rrrrrr/src/application/download.jpeg");
	        anchorPane.getChildren().add(imgImage);

	        Scene scene = new Scene(anchorPane, 400, 300);
	        imgImage.fitHeightProperty().bind(anchorPane.heightProperty());
	        imgImage.fitWidthProperty().bind(anchorPane.widthProperty());
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}


