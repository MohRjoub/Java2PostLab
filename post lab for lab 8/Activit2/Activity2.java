package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Activity2 extends Application {
    VBox box0 = new VBox();
    HBox box1 = new HBox();
    HBox box2 = new HBox();
    Label number1Label = new Label("Number 1:");
    TextField number1Input = new TextField("10");
    Label number2Label = new Label("Number 2:");
    TextField number2Input = new TextField("20");
    Label resultLabel = new Label("Result:");
    TextField resultInput = new TextField("30.0");

    ComboBox<String> operationComboBox = new ComboBox<>();

    @Override
    public void start(Stage stage) {
        resultInput.setEditable(false);
        number1Input.setPrefColumnCount(5);
        number2Input.setPrefColumnCount(5);
        resultInput.setPrefColumnCount(5);

        operationComboBox.getItems().addAll("Add", "Subtract", "Multiply", "Divide");

        box1.getChildren().addAll(number1Label, number1Input, number2Label, number2Input, resultLabel, resultInput);
        box0.setAlignment(Pos.CENTER);
        box1.setAlignment(Pos.CENTER);
        box2.setAlignment(Pos.CENTER);
        box0.getChildren().addAll(box1, operationComboBox);
        box0.setSpacing(30);
        box1.setSpacing(10);

        calculationHandler innerHandler = new calculationHandler();
        operationComboBox.setOnAction(innerHandler);

        Scene scene = new Scene(box0, 450, 100);
        stage.setTitle("Activity 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private class calculationHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            double number1 = Double.parseDouble(number1Input.getText());
            double number2 = Double.parseDouble(number2Input.getText());
            String selectedOperation = operationComboBox.getValue();

            switch (selectedOperation) {
                case "Add":
                    resultInput.setText(String.valueOf(number1 + number2));
                    break;
                case "Subtract":
                    resultInput.setText(String.valueOf(number1 - number2));
                    break;
                case "Multiply":
                    resultInput.setText(String.valueOf(number1 * number2));
                    break;
                case "Divide":
                    if (number2 == 0) {
                        resultInput.setText("Cannot divide by zero");
                    } else {
                        resultInput.setText(String.valueOf(number1 / number2));
                    }
                    break;
            }
        }
    }
}
