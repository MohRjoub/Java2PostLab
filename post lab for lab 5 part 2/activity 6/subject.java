package tawjihi;

public class subject implements Comparable<subject>{
	private String title;
	private String type;
	private int mark;
	private int maxMark=100;
	
	public subject(String title, String type, int mark) {
		setTitle(title);
		setType(type);
		setMark(mark);
	}
	public subject(String title, String type, int mark, int maxMark) {
		setTitle(title);
		setType(type);
		setMark(mark);
		setMaxMark(maxMark);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		if(mark>=0&&mark<=200)
		this.mark = mark;
		else
			System.out.println("Please Enter a Valid Mark");
	}
	public int getMaxMark() {
		return maxMark;
	}
	public void setMaxMark(int maxMark) {
		if(maxMark==100||maxMark==150||maxMark==200)
		this.maxMark = maxMark;
		else 
			System.out.println("Please Enter a valid Mark");
	}
	
	@Override
	public int compareTo(subject o) {
		if(this.title.equalsIgnoreCase("Mandatory")&&
				(o.title.equalsIgnoreCase("elective1")||o.title.equalsIgnoreCase("elective2")))
		return 1;
		else if(o.title.equalsIgnoreCase("Mandatory")&&
				(this.title.equalsIgnoreCase("elective1")||this.title.equalsIgnoreCase("elective2")))
		return -1;	
		return 0;
		}
	
	@Override
	public boolean equals(Object obj) {
		subject other = (subject) obj;
		return mark == other.mark && maxMark == other.maxMark && other.title.equalsIgnoreCase(title)
				&& other.type.equalsIgnoreCase(type);
	}
	@Override
	public String toString() {
		return "subject [title=" + title + ", type=" + type + ", mark=" + mark + ", maxMark=" + maxMark + "]";
	}
	
	
}
