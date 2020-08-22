package coding_test.swea.d1;

import java.util.Scanner;

public class 거꾸로출력해보아요 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = N; i >= 0; i--)
			System.out.print(i + " ");
	}
}
