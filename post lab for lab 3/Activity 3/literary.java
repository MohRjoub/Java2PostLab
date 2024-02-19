package tawjihi;

public class literary extends Tawjihi {

	public literary(int seatingNum, int iD, String name, char gender, String school) {
		super(seatingNum, iD, name, gender, school);
	}
	@Override
	public double calculateAverage() {
		double sum=0;
		int elc2Mark =0,bioMark=0,cheMark=0,reMark=0,techMark=0;

		int elc1Mark =0;
		for(int i=0;i<subjects.size();i++) {
			if(subjects.get(i).getTitle().equalsIgnoreCase("Arabic")
					||subjects.get(i).getTitle().equalsIgnoreCase("English")
					||subjects.get(i).getTitle().equalsIgnoreCase("Physics")
					||subjects.get(i).getTitle().equalsIgnoreCase("History"))
			sum+=subjects.get(i).getMark();
			if(subjects.get(i).getType().equalsIgnoreCase("Elective1")) {
				if(subjects.get(i).getTitle().equalsIgnoreCase("Geography")) {
					bioMark=subjects.get(i).getMark();
				}
				if(subjects.get(i).getTitle().equalsIgnoreCase("Religious Education")) {
					cheMark=subjects.get(i).getMark();
				}				
			}
			if(subjects.get(i).getType().equalsIgnoreCase("Elective2")) {
				if(subjects.get(i).getTitle().equalsIgnoreCase("Scientific Culture")) {
					reMark=subjects.get(i).getMark();
				}
				if(subjects.get(i).getTitle().equalsIgnoreCase("Technology")) {
					techMark=subjects.get(i).getMark();
				}
				

				}
			
		}
		if(bioMark>cheMark)
			elc1Mark = bioMark;
		else
			elc1Mark=cheMark;
		sum+=elc1Mark;
		if(reMark>techMark)
			elc2Mark = reMark;
		else
			elc2Mark=techMark;
		sum+=elc2Mark;
		
		return sum/7;
	}
	@Override
	public String toString() {
		return "literary student";
	}
}
