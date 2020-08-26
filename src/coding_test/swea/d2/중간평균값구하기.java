package coding_test.swea.d2;

import java.util.Arrays;
import java.util.Scanner;

public class 중간평균값구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int[] arr = new int[10];

			for (int i = 0; i < 10; i++)
				arr[i] = sc.nextInt();

			int sum = 0;
			Arrays.sort(arr);

			for (int i = 1; i < 9; i++)
				sum += arr[i];

			double avg = sum / 8.0;

			System.out.println("#" + tc + " " + Math.round(avg));
		}
	}
}