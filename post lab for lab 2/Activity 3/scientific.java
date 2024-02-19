package tawjihi;

public class scientific extends Tawjihi {

	public scientific(int seatingNum, int iD, String name, char gender, String school) {
		super(seatingNum, iD, name, gender, school);
	}
	public double calculateAverage() {
		double sum=0;
		int elc2Mark =0;
		int elc1Mark =0;
		for(int i=0;i<subjects.size();i++) {
			if(subjects.get(i).getType().equalsIgnoreCase("Mandatory"))
			sum+=subjects.get(i).getMark();
			if(subjects.get(i).getType().equalsIgnoreCase("Elective1")) {
				elc1Mark = subjects.get(i).getMark();}
			if(subjects.get(i).getType().equalsIgnoreCase("Elective2")) {
				 elc2Mark = subjects.get(i).getMark();}
		}
		if(elc2Mark > elc1Mark)
			sum+=elc2Mark;
		else
			sum+=elc1Mark;
		return sum/(subjects.size());
	}
}
