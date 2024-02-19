package tawjihi;

import java.util.*;

public class RemoveDuplicateTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Please Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            int num = in.nextInt();
            integers.add(num);
        }
        removeDuplicate(integers);

        System.out.println("ArrayList after remove duplicate numbers");
        for (Integer x : integers) {
            System.out.print(x + " ");
        }

	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--; // By decrementing j, we effectively
					// Rechecks the current index (j), making sure we don't miss any potential
					// duplicates that have shifted into the current position after removal.
				}
			}
		}
	}
}
