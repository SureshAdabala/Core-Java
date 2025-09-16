package Java_Programs;

import java.util.*;

public class LeftAngleTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("  ".repeat(num - i) + " *".repeat(i));
		}
		sc.close();
	}
}
