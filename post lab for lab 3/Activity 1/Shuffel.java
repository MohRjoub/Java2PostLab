package lab3;

import java.util.ArrayList;
import java.util.Random;

public class Shuffel {

	public static void main(String[] args) {
		ArrayList<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2.5);
        numberList.add(3);
        numberList.add(4.8);
        numberList.add(6);
        numberList.add(9);


        System.out.println(numberList);
        shuffle(numberList);
        System.out.println(numberList);
	}
	 public static void shuffle(ArrayList<Number> list) {
	        Random rand = new Random();

	        for (int i = 0; i <list.size(); i++) {
	            int index = rand.nextInt(list.size());
	            Number temp = list.get(i);
	            list.set(i, list.get(index));
	            list.set(index, temp);
	        }
	    }

}
