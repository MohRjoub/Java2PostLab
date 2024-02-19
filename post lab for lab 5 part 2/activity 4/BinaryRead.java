import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class BinaryRead {
	public static void main(String[] args) {

		File file = new File("data.dat");

		int c=0;
		int sum =0;
		try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
			while(in.available()!=-1) {
				int num=in.readInt();
			System.out.println(num);
			sum+=num;
			c++;
			}
		} catch (IOException e) {			
			System.out.println(c+" Number Readed");
			System.out.println("average : " + sum /c);

			e.printStackTrace();
		}
	}
}
