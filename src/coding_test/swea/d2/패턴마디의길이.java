package coding_test.swea.d2;

import java.util.Scanner;

public class 패턴마디의길이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			StringBuilder sb1 = new StringBuilder();
			for (int i = 0; i < 30; i++) {
				sb1.append(s.charAt(i));

				StringBuilder sb2 = new StringBuilder();
				for (int j = 1; j <= sb1.toString().length(); j++) {
					sb2.append(s.charAt(i + j));
				}

				if (sb1.toString().equals(sb2.toString())) {
					System.out.println("#" + tc + " " + sb1.toString().length());
					break;
				}
			}
		}
	}
}
