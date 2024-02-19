package application;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Activity4 extends Application {
    private TextField txtID;
    private TextField txtName;
    private RadioButton maleRadio;
    private RadioButton femaleRadio;
    private TextField txtSeatNum;
    private ComboBox<String> txtYear;
    private TextField txtSchool;
    private ComboBox<String> branchCombo;
    private TextArea area;
    private ImageView photo;
    private Label lblAverage;
    private Button btnPrior;
    private Button btnNext;

    private ArrayList<Student> students =new ArrayList<>();
    private int currentIndex = -1;

    @Override
    public void start(Stage primaryStage) {

        initializeUI();
        loadDataFromFile("Tawjihi.dat");
        if (currentIndex < students.size() - 1) {
            currentIndex++;
            displayStudent();
        }    

        primaryStage.setTitle("Tawjihi Editor");
        primaryStage.setScene(createScene());
        primaryStage.show();
    }

    private void initializeUI() {
        txtID = new TextField();
        txtName = new TextField();
        maleRadio = new RadioButton("M");
        femaleRadio = new RadioButton("F");
        txtSeatNum = new TextField();
        txtYear = new ComboBox<>();
        txtSchool = new TextField();
        branchCombo = new ComboBox<>();
        area = new TextArea();
        photo = new ImageView();
        lblAverage = new Label("Average = 0%");
        btnPrior = new Button("Prior");
        btnNext = new Button("Next");

        ToggleGroup genderGroup = new ToggleGroup();
        maleRadio.setToggleGroup(genderGroup);
        femaleRadio.setToggleGroup(genderGroup);

        branchCombo.getItems().addAll("Scientific", "Literary");

        for (int i = 1990; i <= 2024; i++) {
            txtYear.getItems().add(String.valueOf(i));
        }

        btnPrior.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	  if (currentIndex > 0) {
                      currentIndex--;
                      displayStudent();
                  }            }
        });

        btnNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	if (currentIndex < students.size() - 1) {
                    currentIndex++;
                    displayStudent();
                }           
            }
        });
    }

    private void loadDataFromFile(String filename) {
        try (DataInputStream dataInput = new DataInputStream(new FileInputStream(filename))) {
            while (true) {
                int id = dataInput.readInt();
                String name = dataInput.readUTF();
                char gender = dataInput.readChar();
                String school = dataInput.readUTF();
                String branch = dataInput.readUTF();
                int seatingNum = dataInput.readInt();
                int year = dataInput.readInt();
                int numOfSubjects = dataInput.readInt();
                // Arrays to store subjects information
                String[] subjectTitles = new String[numOfSubjects];
                String[] subjectTypes = new String[numOfSubjects];
                int[] subjectMarks = new int[numOfSubjects];
                int[] subjectMaxMarks = new int[numOfSubjects];

                // Read data for each subject
                for (int i = 0; i < numOfSubjects; i++) {
                    subjectTitles[i] = dataInput.readUTF();
                    subjectTypes[i] = dataInput.readUTF();
                    subjectMarks[i] = dataInput.readInt();
                    subjectMaxMarks[i] = dataInput.readInt();
                }

                Student student = new Student(id, name, gender, school, branch, seatingNum, year,
                        numOfSubjects, subjectTitles, subjectTypes, subjectMarks, subjectMaxMarks);
                students.add(student);
            }
        } catch (EOFException ex) {

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private Scene createScene() {
        BorderPane root = new BorderPane();
        VBox top = new VBox(10);
        HBox genderBox = new HBox(maleRadio, femaleRadio);
        HBox box1 = new HBox(new Label("ID:"), txtID, new Label("Name:"), txtName, new Label("Gender:"), genderBox);
        HBox box2 = new HBox(new Label("Seat Num:"), txtSeatNum, new Label("Branch:"), branchCombo);
        HBox box3 = new HBox(new Label("Year:"), txtYear, new Label("School:"), txtSchool);
        top.getChildren().addAll(box1, box2, box3);

        HBox center = new HBox(area, photo);
        center.setSpacing(10);
       HBox dBox = new HBox(btnPrior, btnNext);
       dBox.setAlignment(Pos.CENTER);
        VBox bottom = new VBox(10, lblAverage,dBox);
        bottom.setAlignment(Pos.CENTER);

        root.setTop(top);
        root.setCenter(center);
        root.setBottom(bottom);

        return new Scene(root, 600, 600);
    }

    private void displayStudent() {
        if (currentIndex >= 0 && currentIndex < students.size()) {
            Student student = students.get(currentIndex);

            txtID.setText(String.valueOf(student.getId()));
            txtName.setText(student.getName());
            if (student.getGender() == 'M') {
                maleRadio.setSelected(true);
            } else {
                femaleRadio.setSelected(true);
            }
            txtSeatNum.setText(String.valueOf(student.getSeatingNum()));
            branchCombo.setValue(student.getBranch());
            txtYear.setValue(String.valueOf(student.getYear()));
            txtSchool.setText(student.getSchool());
            area.setText(""); 
            for (int i = 0; i < student.getNumOfSubjects(); i++) {
                area.appendText(student.getSubjectTitles()[i] + "\t");
                area.appendText(student.getSubjectTypes()[i] + "\t");
                area.appendText(student.getSubjectMarks()[i] + "/");
                area.appendText(student.getSubjectMaxMarks()[i] + "\n");
            }
            lblAverage.setText("Average = " + calculateAverage(student) + "%");
            String photoPath = "file:C:\\Users\\ACTC\\eclipse-workspace\\Lab10\\"+student.getId()+".png";
            photo.setImage(new Image(photoPath));
            photo.setFitWidth(200);
    		photo.setFitHeight(250);
    		}
    }

    private double calculateAverage(Student student) {
        int totalMarks = 0;
        int totalMaxMarks = 0;
        for (int i = 0; i < student.getNumOfSubjects(); i++) {
            totalMarks += student.getSubjectMarks()[i];
            totalMaxMarks += student.getSubjectMaxMarks()[i];
        }
        return (double) totalMarks / totalMaxMarks * 100;
    }

    public static void main(String[] args) {
        launch(args);
    }
}