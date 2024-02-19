import java.util.Scanner;

public class TestHex2Dec {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a hex number: ");
    String hex = input.nextLine();
    try {
      int dec =  hex2Dec.hex2dec(hex);
      System.out.println("The decimal equivalent is " + dec);
    } catch (HexFormatException e) {
		e.printStackTrace();
	}
    input.close();
  }
}
