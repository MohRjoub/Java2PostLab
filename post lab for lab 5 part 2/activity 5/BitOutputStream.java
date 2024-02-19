import java.io.*;

public class BitOutputStream {
    private FileOutputStream output;
    private DataOutputStream dataOutputStream;
    private int currentByte;
    private int numBitsFilled;

    public BitOutputStream(File file) throws FileNotFoundException {
        output = new FileOutputStream(file);
        dataOutputStream = new DataOutputStream(output);
        currentByte = 0;
        numBitsFilled = 0;
    }

    public void writeBit(char bit) throws IOException {
        if (!(bit == '0' || bit == '1')) {
            throw new IllegalArgumentException("Argument must be 0 or 1");
        }
        
        currentByte = ((currentByte << 1) | (bit - '0'));
        System.out.println(currentByte);
        numBitsFilled++;
        
        if (numBitsFilled == 8) {
        	dataOutputStream.write(currentByte);
            currentByte = 0;
            numBitsFilled = 0;
        }
    }

    public void writeBit(String bit) throws IOException {
        for (int i = 0; i < bit.length(); i++) {
            writeBit(bit.charAt(i));
        }
    }

    public void close() throws IOException {
        while (numBitsFilled != 0) {
            writeBit('0');
        }
        
        output.close();
    }
}
