package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class MoveHandler implements EventHandler<ActionEvent> {
    private Circle circle;

    public MoveHandler(Circle circle) {
        this.circle = circle;
    }

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


