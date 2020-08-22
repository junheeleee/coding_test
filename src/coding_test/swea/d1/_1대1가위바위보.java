package coding_test.swea.d1;

import java.util.Scanner;

public class _1대1가위바위보 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int winner = A;

		if (A < B) {
			winner = B;

			if (A == 1 && B == 3)
				winner = A;
		}

		if (winner == A)
			System.out.println("A");
		else
			System.out.println("B");
	}
}
