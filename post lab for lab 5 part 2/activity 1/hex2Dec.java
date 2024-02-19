
public class hex2Dec {
	
	
	public static int hex2dec(String hexString) throws NumberFormatException{
		  int dec = 0;
		  for (int i = 0; i < hexString.length(); i++) {
		    char ch = hexString.charAt(i);
		    int value;

		    if (ch >= '0' && ch <= '9') {
		      value = ch - '0';
		      System.out.println();
		    } else if (ch >= 'A' && ch <= 'F') {
		      value = ch - 'A' + 10;
		    } else {
		      throw new NumberFormatException();
		    }
		    int power = hexString.length() - i - 1;
		    value = (int) (value * Math.pow(16, power));
		    dec += value;
		  }
		  return dec;
		}

}
