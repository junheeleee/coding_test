package coding_test.swea.d1;

import java.util.Scanner;

public class 더블더블 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int tmp = 1;
		
		for(int i = 1; i <= N + 1; i++) {
			System.out.print(tmp + " ");
			tmp *= 2;
		}
	}
}
