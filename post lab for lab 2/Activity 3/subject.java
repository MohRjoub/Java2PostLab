package tawjihi;

public class subject {
	private String title;
	private String type;
	private int mark;
	
	public subject(String title, String type, int mark) {
		setTitle(title);
		setType(type);
		setMark(mark);
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
	@Override
	public String toString() {
		return "subject [title=" + title + ", type=" + type + ", mark=" + mark + "]";
	}
	
}
