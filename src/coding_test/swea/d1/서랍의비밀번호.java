package coding_test.swea.d1;

import java.util.Scanner;

public class 서랍의비밀번호 { // p가 무조건 k보다 크다는 전제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int K = sc.nextInt();

		System.out.println(P - K + 1);
	}
}
