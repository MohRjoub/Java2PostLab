package tawjihi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class driver {

	public static void main(String[] args) {
		ArrayList<Tawjihi> students = new ArrayList<>();

		students.add(new scientific(1, 123456789, "Ali", 'F', "School1"));
		students.add(new scientific(2, 987654321, "Ahmad", 'M', "School2"));
		students.add(new scientific(3, 345678901, "Noor", 'M', "School3"));
		students.add(new literary(4, 999129999, "Mohammad", 'F', "School1"));
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

		students.get(3).addSubject(new subject("Arabic", "Mandatory", 150));
		students.get(3).addSubject(new subject("History", "Mandatory", 100));
		students.get(3).addSubject(new subject("Physics", "Mandatory", 100));
		students.get(3).addSubject(new subject("English", "Mandatory", 150));
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

		students.get(5).addSubject(new subject("Arabic", "Mandatory", 140));
		students.get(5).addSubject(new subject("History", "Mandatory", 90));
		students.get(5).addSubject(new subject("Physics", "Mandatory", 105));
		students.get(5).addSubject(new subject("English", "Mandatory", 135));
		students.get(5).addSubject(new subject("Geography", "Elective1", 18));
		students.get(5).addSubject(new subject("Religious Education", "Elective1", 85));
		students.get(5).addSubject(new subject("Scientific Culture", "Elective2", 15));
		students.get(5).addSubject(new subject("Technology", "Elective2", 92));

		System.out.println("Student\t\tAverage Mark");
        System.out.println("==========================");
        for (Tawjihi student : students) {
            double average = student.calculateAverage();
            System.out.println(student.getName() + "\t\t" + average);
        }
	        ArrayList<Tawjihi> topScientific = new ArrayList<>();
	        for(int i=0; i<3;i++) {
	        	topScientific.add(students.get(i));
	        }
	        Collections.sort(topScientific, Comparator.comparing(Tawjihi::calculateAverage).reversed());
	        
	        ArrayList<Tawjihi> topLiterary = new ArrayList<>();
	        for(int i=3; i<6;i++) {
	        	topLiterary.add(students.get(i));
	        }
	        Collections.sort(topLiterary, Comparator.comparing(Tawjihi::calculateAverage).reversed());

	        System.out.println("\nTop Scientific Students:    " + topScientific.get(0).getName() +"  Mark "+topScientific.get(0).calculateAverage());

	        System.out.println("\nTop Literary Students:      " + topLiterary.get(0).getName() +"  Mark "+topLiterary.get(0).calculateAverage());
	}

}
