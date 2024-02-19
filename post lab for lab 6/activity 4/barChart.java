package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class barChart extends Application {
	Scanner in = new Scanner(System.in);
    @Override
    public void start(Stage stage) {
    	System.out.println("Please Enter Project Percentage");
    	double projectPercentage = in.nextDouble();
    	System.out.println("Please Enter Quiz Percentage");
    	double quizPercentage = in.nextDouble();
    	System.out.println("Please Enter Midterm Percentage");
    	double midtermPercentage = in.nextDouble();
    	System.out.println("Please Enter Final Percentage");
    	double finalPercentage = in.nextDouble();
    	
    	double projectHeight = 2 * projectPercentage;
    	double quizHeight = 2 * quizPercentage;
    	double midtermHeight = 2 * midtermPercentage;
    	double finalHeight = 2 * finalPercentage;
    	
        Pane pane = new Pane();

        Label projectLabel = new Label("Project"+projectPercentage+"%");
        projectLabel.setFont(new Font("Arial", 14));		
        projectLabel.setTextFill(Color.BLACK);

        Label quizLabel = new Label("Quiz"+quizPercentage+"%");
        quizLabel.setFont(new Font("Arial", 16));
        quizLabel.setTextFill(Color.BLACK);

        Label midtermLabel = new Label("Midterm"+midtermPercentage+"%");
        midtermLabel.setFont(new Font("Arial", 14));
        midtermLabel.setTextFill(Color.BLACK);

        Label finalLabel = new Label("Final"+finalPercentage+"%");
        finalLabel.setFont(new Font("Arial", 16));
        finalLabel.setTextFill(Color.BLACK);

        Rectangle projectBar = new Rectangle(80, projectHeight);
        projectBar.setFill(Color.RED);

        Rectangle quizBar = new Rectangle(80, quizHeight);
        quizBar.setFill(Color.BLUE);

        Rectangle midtermBar = new Rectangle(80, midtermHeight);
        midtermBar.setFill(Color.GREEN);

        Rectangle finalBar = new Rectangle(80, finalHeight);
        finalBar.setFill(Color.ORANGE);

        projectLabel.setTranslateX(60);
        projectLabel.setTranslateY(200 - projectHeight);

        projectBar.setTranslateX(60);
        projectBar.setTranslateY(220 - projectHeight); 

        quizLabel.setTranslateX(150);
        quizLabel.setTranslateY(200 - quizHeight);

        quizBar.setTranslateX(150);
        quizBar.setTranslateY(220 - quizHeight); 

        midtermLabel.setTranslateX(240);
        midtermLabel.setTranslateY(200 - midtermHeight);

        midtermBar.setTranslateX(240);
        midtermBar.setTranslateY(220 - midtermHeight); 
        
        finalLabel.setTranslateX(330);
        finalLabel.setTranslateY(200-finalHeight);

        finalBar.setTranslateX(330);
        finalBar.setTranslateY(220-finalHeight);

        pane.getChildren().addAll(projectLabel, projectBar, quizLabel, quizBar, midtermLabel, midtermBar, finalLabel,
                finalBar);
        Scene scene = new Scene(pane, 450, 400);
        stage.setScene(scene);
        stage.setTitle("Bar Chart Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
