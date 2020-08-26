package coding_test.swea.d2;

import java.util.Scanner;

public class 간단한369게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] number = new String[N + 1];

		for (int i = 1; i <= N; i++) {
			number[i] = Integer.toString(i);

			int cnt = 0;
			for (int j = 0; j < number[i].length(); j++) {
				if (number[i].charAt(j) == '3' || number[i].charAt(j) == '6' || number[i].charAt(j) == '9')
					cnt++;
			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < cnt; j++) {
				sb.append("-");
			}
			if (cnt != 0)
				number[i] = sb.toString();
		}

		for (int i = 1; i <= N; i++)
			System.out.print(number[i] + " ");
	}
}
