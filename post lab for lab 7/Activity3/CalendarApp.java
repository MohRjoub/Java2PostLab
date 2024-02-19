package application;

//Import the required JavaFX classes
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//Import the required java.util classes
import java.util.Calendar;
import java.util.GregorianCalendar;

//Define the main class that extends Application
public class CalendarApp extends Application {

	private Label lblYear;
	private Label lblMonth;
	private Button btnPrior;
	private Button btnNext;
	private GridPane calendar;

	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();

		HBox top = new HBox(10);
		top.setAlignment(Pos.CENTER);

		lblYear = new Label();
		lblMonth = new Label();

		lblYear.setFont(Font.font(20));
		lblMonth.setFont(Font.font(20));
		lblYear.setStyle("-fx-text-fill: blue");
		lblMonth.setStyle("-fx-text-fill: blue");

		top.getChildren().addAll(lblYear, lblMonth);

		HBox bottom = new HBox(10);
		bottom.setAlignment(Pos.CENTER);

		btnPrior = new Button("Prior");
		btnNext = new Button("Next");

		bottom.getChildren().addAll(btnPrior, btnNext);

		calendar = new GridPane();
		calendar.setAlignment(Pos.CENTER);
		calendar.setHgap(10);
		calendar.setVgap(10);

		displayCalendar();

		root.setTop(top);
		root.setCenter(calendar);
		root.setBottom(bottom);

		Scene scene = new Scene(root, 600, 400);
		primaryStage.setTitle("JavaFX Calendar Example");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	private void displayCalendar() {

		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);

		lblYear.setText("Year: " + year);
		lblMonth.setText("Month: " + getMonthName(month));

		int startDay = getStartDay(year, month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		this.calendar.getChildren().clear();

		String[] dayNames = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		for (int i = 0; i < 7; i++) {
			Label dayLabel = new Label(dayNames[i]);
			dayLabel.setFont(Font.font(15));
			dayLabel.setStyle("-fx-text-fill: red");
			dayLabel.setAlignment(Pos.CENTER);
			this.calendar.add(dayLabel, i, 0);
		}

		int i = startDay;
		for (int day = 1; day <= numberOfDaysInMonth; day++) {
			Label dateLabel = new Label(String.valueOf(day));
			dateLabel.setFont(Font.font(15));
			dateLabel.setStyle("-fx-text-fill: black");
			dateLabel.setAlignment(Pos.CENTER);
			this.calendar.add(dateLabel, i % 7, i / 7 + 1);
			i++;
		}
	}

	private String getMonthName(int month) {
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return monthNames[month];
	}

	private int getStartDay(int year, int month) {
		int total = getTotalNumberOfDays(year, month);
		return (total + 3) % 7;
	}

	private int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) {
				total += 366;
			} else {
				total += 365;
			}
		}

		for (int i = 0; i < month; i++) {
			total += getNumberOfDaysInMonth(year, i);
		}

		return total;
	}

	private int getNumberOfDaysInMonth(int year, int month) {
		if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
			return 31;
		}

		if (month == 3 || month == 5 || month == 8 || month == 10) {
			return 30;
		}

		if (month == 1) {
			return isLeapYear(year) ? 29 : 28;
		}

		return 0;
	}


	private boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}


	public static void main(String[] args) {
        launch(args);
    }

}