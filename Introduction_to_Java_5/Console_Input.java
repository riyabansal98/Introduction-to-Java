package Introduction_to_Java_5;

import java.util.Scanner;

public class Console_Input {

	public static void main(String[] args) {

		//Class
		//new keyword

		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		boolean flag = true;
		for (int div = 2; div <= num / 2; div++) {

			int rem = num % div;

			if (rem == 0) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}

	}

}
