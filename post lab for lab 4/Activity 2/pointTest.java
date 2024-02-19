
public class pointTest {
	public static void main(String[] args) {

	    Point p1 = new Point(1, 2);
	    Point p2 = new Point(3, 4);


	    System.out.println("p1 is " + p1);
	    System.out.println("p2 is " + p2);


	    System.out.println("p1 equals p2? " + p1.equals(p2));


	    System.out.println(p1.compareTo(p2));


	    Point p3 = p1.clone();
	    System.out.println("The cloned point of p1 is " + p3);
	  }
}
