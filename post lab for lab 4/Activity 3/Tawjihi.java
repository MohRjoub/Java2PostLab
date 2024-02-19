package tawjihi;

import java.util.ArrayList;

public abstract class Tawjihi extends student implements Comparable<Tawjihi> {

	private int seatingNum;
	private int year=2022;
	protected ArrayList<subject> subjects = new ArrayList<>();
	public Tawjihi(int seatingNum,int iD, String name, char gender, String school) {
		super(iD, name, gender, school);
		setSeatingNum(seatingNum);
	}
	public abstract double calculateAverage();
	public void addSubject(subject sub) {
		this.subjects.add(sub);
	}
	public subject getSubject(String title) {
		for(int i=0;i<subjects.size();i++) {
			if(title.equalsIgnoreCase(subjects.get(i).getTitle()))
				return subjects.get(i);
		}
		return null;
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
	public ArrayList<subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<subject> subjects) {
		this.subjects.addAll(subjects);
	}
	
	@Override
	public abstract String toString();
	
	@Override
	public abstract boolean equals(Object obj);
	
	@Override
	public int compareTo(Tawjihi o) {
		return (int) (this.calculateAverage()-o.calculateAverage());
	}
}
