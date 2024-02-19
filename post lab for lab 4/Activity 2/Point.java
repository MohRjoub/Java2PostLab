
public class Point implements Comparable<Point>, Cloneable {
	private int x;
	private int y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	 public double getX() {
		    return x;
		  }

		  public double getY() {
		    return y;
		  }


	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point other = (Point) obj;
			return this.x == other.x && this.y == other.y;
		}
		return false;
	}

	public int compareTo(Point other) {
		if (this.x > other.x || (this.x == other.x && this.y > other.y)) {
			return 1;
		} else if (this.x < other.x || (this.x == other.x && this.y < other.y)) {
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return "[" + x + ", " + y + "]";
	}

	public Point clone() {
		try {
			return (Point) super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}

}
