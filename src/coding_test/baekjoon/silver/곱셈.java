package coding_test.baekjoon.silver;

import java.util.Scanner;

public class 곱셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();

		System.out.println(pow(A, B, C));
	}

	private static long pow(long A, long B, long C) {
		if (B == 1)
			return A % C;

		long num = pow(A, B / 2, C);
		num = num * num % C;

		if (B % 2 == 0) // B가 짝수일 때
			return num;

		return num * A % C; // B가 홀수일 때
	}
}
