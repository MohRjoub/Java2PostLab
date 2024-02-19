package tawjihi;

public class student {
	private int ID;
	private String name;
	private char gender;
	private String school;

	public student(int iD, String name, char gender, String school) {
		 setID(iD);
		 setName(name);
		 setGender(gender);
		 setSchool(school);
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		if(iD>99999999)
		ID = iD;
		else
			System.out.println("Enter a valid ID");
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if(gender=='F'||gender=='M')
		this.gender = gender;
		else
			System.out.println("Please Enter A Valid Gender");
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "student [ID=" + ID + ", name=" + name + ", gender=" + gender + ", school=" + school + "]";
	}
	
}
