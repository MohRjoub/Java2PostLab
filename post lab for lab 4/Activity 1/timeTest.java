
public class timeTest {	
	public static void main(String[] args) {
			Time t1 = new Time();
			System.out.println("The current time is " + t1);
			
			Time t2 = new Time(12, 34, 56);
			System.out.println(t2);
		
			Time t3 = new Time(123456789L);
			System.out.println(t3);
	
			System.out.println(t1.compareTo(t2));
		
			Time t4 = t3.clone();
			System.out.println(t4);
	}
}
