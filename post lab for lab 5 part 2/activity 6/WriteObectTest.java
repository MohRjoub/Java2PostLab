package tawjihi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteObectTest {
	public static void main(String[] args) {
		 try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object.dat"))) {
	            // Write the object to the file
	            objectOutputStream.writeObject(new scientific(111111111, 123456789, "Ali", 'M', "School1"));
	            objectOutputStream.writeObject(new literary(444444444, 999129999, "Alawi", 'M', "School1"));
	            System.out.println("Object written to file successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Object.dat"))){
			 System.out.println( (scientific)(inputStream.readObject()));
			 System.out.println((literary)(inputStream.readObject()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
