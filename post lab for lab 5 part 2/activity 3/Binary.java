

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Binary {

	public static void main(String[] args) {

		File file = new File("data.dat");

		if(!file.exists()) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}


		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file ,true))) {

			Random random = new Random();


			for (int i = 0; i < 100; i++) {

				int num = random.nextInt(45)+55;


				dos.writeInt(num);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
