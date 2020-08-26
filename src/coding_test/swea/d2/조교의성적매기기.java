package coding_test.swea.d2;

import java.util.Arrays;
import java.util.Scanner;

public class 조교의성적매기기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			double[] score = new double[N];
			double[] sortedScore = new double[N];

			for (int i = 0; i < N; i++) {
				int middleTest = sc.nextInt();
				int finalTest = sc.nextInt();
				int homework = sc.nextInt();

				score[i] = middleTest * 0.35 + finalTest * 0.45 + homework * 0.20;
				sortedScore[i] = score[i];
			}
			Arrays.sort(sortedScore);

			int grade = 0;

			for (int i = 0; i < N; i++) {
				if (score[K - 1] == sortedScore[i]) {
					grade = i / (N / 10);
					break;
				}
			}

			System.out.print("#" + tc + " ");
			switch (grade) {
			case 9:
				System.out.println("A+");
				break;
			case 8:
				System.out.println("A0");
				break;
			case 7:
				System.out.println("A-");
				break;
			case 6:
				System.out.println("B+");
				break;
			case 5:
				System.out.println("B0");
				break;
			case 4:
				System.out.println("B-");
				break;
			case 3:
				System.out.println("C+");
				break;
			case 2:
				System.out.println("C0");
				break;
			case 1:
				System.out.println("C-");
				break;
			default:
				System.out.println("D0");
				break;
			}
		}

	}
}
