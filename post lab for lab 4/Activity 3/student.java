package tawjihi;

public abstract class student extends Human {
	private int ID;
	private String school;

	public student(int iD, String name, char gender, String school) {
		super(name,gender);
		 setID(iD);
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "student [ID=" + ID + ", school=" + school + "]";
	}
}
