package coding_test.swea.d2;

import java.util.Scanner;

public class 초심자의회문검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			String reverse = new StringBuilder(s).reverse().toString();

			System.out.print("#" + tc + " ");
			if (s.equals(reverse))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
