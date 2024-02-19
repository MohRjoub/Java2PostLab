package tawjihi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class driver {

	public static void main(String[] args) {
		ArrayList<Tawjihi> students = new ArrayList<>();
		students.add(new scientific(1, 123456789, "Ali", 'F', "School1"));
		students.add(new scientific(2, 987654321, "Ahmad", 'M', "School2"));
		students.add(new scientific(3, 345678901, "Noor", 'M', "School3"));
		students.add(new literary(4, 999129999, "Alawi", 'F', "School1"));
		students.add(new literary(5, 999139999, "Ibrahem", 'M', "School2"));
		students.add(new literary(6, 999149999, "Mosa", 'M', "School3"));

		students.get(0).addSubject(new subject("Math", "Mandatory", 190));
		students.get(0).addSubject(new subject("Physics", "Mandatory", 85));
		students.get(0).addSubject(new subject("Arabic", "Mandatory", 85));
		students.get(0).addSubject(new subject("English", "Mandatory", 88));
		students.get(0).addSubject(new subject("Biology", "Elective1", 80));
		students.get(0).addSubject(new subject("Chemistry", "Elective1", 75));
		students.get(0).addSubject(new subject("History", "Elective2", 92));
		students.get(0).addSubject(new subject("Religious Education", "Elective2", 70));

		students.get(1).addSubject(new subject("Math", "Mandatory", 180));
		students.get(1).addSubject(new subject("Physics", "Mandatory", 92));
		students.get(1).addSubject(new subject("Arabic", "Mandatory", 78));
		students.get(1).addSubject(new subject("English", "Mandatory", 85));
		students.get(1).addSubject(new subject("Biology", "Elective1", 70));
		students.get(1).addSubject(new subject("Chemistry", "Elective1", 85));
		students.get(1).addSubject(new subject("History", "Elective2", 88));
		students.get(1).addSubject(new subject("Religious Education", "Elective2", 75));

		students.get(2).addSubject(new subject("Math", "Mandatory", 195));
		students.get(2).addSubject(new subject("Physics", "Mandatory", 78));
		students.get(2).addSubject(new subject("Arabic", "Mandatory", 90));
		students.get(2).addSubject(new subject("English", "Mandatory", 92));
		students.get(2).addSubject(new subject("Biology", "Elective1", 80));
		students.get(2).addSubject(new subject("Chemistry", "Elective1", 92));
		students.get(2).addSubject(new subject("History", "Elective2", 85));
		students.get(2).addSubject(new subject("Religious Education", "Elective2", 88));

		students.get(3).addSubject(new subject("Arabic", "Mandatory", 149));
		students.get(3).addSubject(new subject("History", "Mandatory", 100));
		students.get(3).addSubject(new subject("Physics", "Mandatory", 100));
		students.get(3).addSubject(new subject("English", "Mandatory", 149));
		students.get(3).addSubject(new subject("Geography", "Elective1", 10));
		students.get(3).addSubject(new subject("Religious Education", "Elective1", 100));
		students.get(3).addSubject(new subject("Scientific Culture", "Elective2", 10));
		students.get(3).addSubject(new subject("Technology", "Elective2", 100));

		students.get(4).addSubject(new subject("Arabic", "Mandatory", 130));
		students.get(4).addSubject(new subject("History", "Mandatory", 85));
		students.get(4).addSubject(new subject("Physics", "Mandatory", 100));
		students.get(4).addSubject(new subject("English", "Mandatory", 140));
		students.get(4).addSubject(new subject("Geography", "Elective1", 20));
		students.get(4).addSubject(new subject("Religious Education", "Elective1", 95));
		students.get(4).addSubject(new subject("Scientific Culture", "Elective2", 12));
		students.get(4).addSubject(new subject("Technology", "Elective2", 88));

		students.get(5).addSubject(new subject("Arabic", "Mandatory", 120));
		students.get(5).addSubject(new subject("History", "Mandatory", 90));
		students.get(5).addSubject(new subject("Physics", "Mandatory", 105));
		students.get(5).addSubject(new subject("English", "Mandatory", 135));
		students.get(5).addSubject(new subject("Geography", "Elective1", 18));
		students.get(5).addSubject(new subject("Religious Education", "Elective1", 85));
		students.get(5).addSubject(new subject("Scientific Culture", "Elective2", 15));
		students.get(5).addSubject(new subject("Technology", "Elective2", 92));

		System.out.println("Student\t\tAverage Mark");
        System.out.println("============================");
        for (Tawjihi student : students) {
            double average = student.calculateAverage();
            System.out.printf("%s\t\t%3.2f\n", student.getName(), average);

        }
	        Collections.sort(students, Comparator.comparing(Tawjihi::calculateAverage));
	        System.out.println("\nStudent\t\tAscending Mark");
	        System.out.println("===============================");
	        for (Tawjihi student : students) {
	        	double average = student.calculateAverage();
	            System.out.printf("%s\t\t%5.2f\n", student.getName(), average);
	            }
	}

}
