package coding_test.swea.d1;

import java.util.Scanner;

public class 큰놈작은놈같은놈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			char c = '<';

			if (num1 == num2)
				c = '=';
			else if (num1 > num2)
				c = '>';

			System.out.println("#" + tc + " " + c);
		}
	}
}
