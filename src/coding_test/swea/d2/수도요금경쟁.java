package coding_test.swea.d2;

import java.util.Scanner;

public class 수도요금경쟁 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();

			int companyA = P * W;
			int companyB = Q;
			if (W > R)
				companyB += (W - R) * S;

			System.out.println("#" + tc + " " + Math.min(companyA, companyB));
		}
	}
}
