package application;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private int id;
    private String name;
    private char gender;
    private String school;
    private String branch;
    private int seatingNum;
    private int year;
    private int numOfSubjects;
    private String[] subjectTitles;
    private String[] subjectTypes;
    private int[] subjectMarks;
    private int[] subjectMaxMarks;

    public Student(int id, String name, char gender, String school, String branch, int seatingNum, int year,
                   int numOfSubjects, String[] subjectTitles, String[] subjectTypes, int[] subjectMarks, int[] subjectMaxMarks) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.school = school;
        this.branch = branch;
        this.seatingNum = seatingNum;
        this.year = year;
        this.numOfSubjects = numOfSubjects;
        this.subjectTitles = subjectTitles;
        this.subjectTypes = subjectTypes;
        this.subjectMarks = subjectMarks;
        this.subjectMaxMarks = subjectMaxMarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSeatingNum() {
        return seatingNum;
    }

    public void setSeatingNum(int seatingNum) {
        this.seatingNum = seatingNum;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOfSubjects() {
        return numOfSubjects;
    }

    public void setNumOfSubjects(int numOfSubjects) {
        this.numOfSubjects = numOfSubjects;
    }

    public String[] getSubjectTitles() {
        return subjectTitles;
    }

    public void setSubjectTitles(String[] subjectTitles) {
        this.subjectTitles = subjectTitles;
    }

    public String[] getSubjectTypes() {
        return subjectTypes;
    }

    public void setSubjectTypes(String[] subjectTypes) {
        this.subjectTypes = subjectTypes;
    }

    public int[] getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(int[] subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public int[] getSubjectMaxMarks() {
        return subjectMaxMarks;
    }

    public void setSubjectMaxMarks(int[] subjectMaxMarks) {
        this.subjectMaxMarks = subjectMaxMarks;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", school=" + school + ", branch="
				+ branch + ", seatingNum=" + seatingNum + ", year=" + year + ", numOfSubjects=" + numOfSubjects
				+ ", subjectTitles=" + Arrays.toString(subjectTitles) + ", subjectTypes="
				+ Arrays.toString(subjectTypes) + ", subjectMarks=" + Arrays.toString(subjectMarks)
				+ ", subjectMaxMarks=" + Arrays.toString(subjectMaxMarks) + "]";
	}
}

