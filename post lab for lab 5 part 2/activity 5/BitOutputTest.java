import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BitOutputTest {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("vvv");
		BitOutputStream bitOutputStream = new BitOutputStream(file);
		try {
			bitOutputStream.writeBit('0');
			bitOutputStream.writeBit('1');
			bitOutputStream.writeBit('1');
			bitOutputStream.writeBit('1');
			bitOutputStream.writeBit("010101010100101010");
			bitOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
