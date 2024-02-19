package tawjihi;

import java.util.*;

public class Max {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println("Enter a sequence of numbers or enter 0 to stop");
		int num = in.nextInt();
		while (num != 0){
				numbers.add(num);
				num = in.nextInt();
		}
		
		if (max(numbers) == null) {
			System.out.println("The list is empty.");

		} else {
			System.out.println("The largest number is: " + max(numbers));
		}
	}

	public static Integer max(ArrayList<Integer> list) {
		if (list == null || list.size() == 0) {
			return null;
		}

		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		return max;
	}
}
