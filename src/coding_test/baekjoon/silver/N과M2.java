package coding_test.baekjoon.silver;

import java.util.Scanner;

public class N과M2 {

	static int[] sel;
	static int N;
	static int M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		sel = new int[M];
		
		func(1, 0);
	}

	private static void func(int num, int s_idx) {
		if (s_idx == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			return;
		}
		
		if(num > N) {
			return;
		}

		sel[s_idx] = num;

		func(num + 1, s_idx + 1);
		func(num + 1, s_idx);
	}

}
