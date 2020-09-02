package coding_test.baekjoon.silver;

import java.util.Scanner;

public class 하노이탑이동순서 { // 시간 초과
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		System.out.println((1 << N) - 1); // 횟수는 2^N -1

		func(1, 3, N);
	}

	private static void func(int a, int b, int n) {
		if (n == 1) {
			System.out.println(a + " " + b);
			return;
		}
		
		func(a, 6 - a - b, n - 1);
		
		System.out.println(a + " " + b);
		
		func(6 - a - b, b, n - 1);
	}
}
