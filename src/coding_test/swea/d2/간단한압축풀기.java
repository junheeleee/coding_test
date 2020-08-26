package coding_test.swea.d2;

import java.util.Scanner;

public class 간단한압축풀기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();

			System.out.println("#" + tc);

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < N; i++) {
				char c = sc.next().charAt(0);
				int cnt = sc.nextInt();

				for (int j = 0; j < cnt; j++)
					sb.append(c);
			}
			String answer = sb.toString();
			for (int i = 0; i < answer.length(); i++) {
				System.out.print(answer.charAt(i));
				if ((i + 1) % 10 == 0)
					System.out.println();
			}
			
			if(answer.length() % 10 != 0)
				System.out.println();
		}
	}
}
