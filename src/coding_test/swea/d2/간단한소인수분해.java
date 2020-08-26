package coding_test.swea.d2;

import java.util.Scanner;

public class 간단한소인수분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			System.out.print("#" + tc + " ");

			int prime2 = 0, prime3 = 0, prime5 = 0, prime7 = 0, prime11 = 0;

			while (N % 2 == 0) {
				N /= 2;
				prime2++;
			}
			System.out.print(prime2 + " ");

			while (N % 3 == 0) {
				N /= 3;
				prime3++;
			}
			System.out.print(prime3 + " ");

			while (N % 5 == 0) {
				N /= 5;
				prime5++;
			}
			System.out.print(prime5 + " ");

			while (N % 7 == 0) {
				N /= 7;
				prime7++;
			}
			System.out.print(prime7 + " ");

			while (N % 11 == 0) {
				N /= 11;
				prime11++;
			}
			System.out.println(prime11);

		}
	}
}
