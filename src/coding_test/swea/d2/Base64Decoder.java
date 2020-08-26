package coding_test.swea.d2;

import java.util.Base64;
import java.util.Scanner;

public class Base64Decoder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String encoding = sc.next();
			String decoding = new String(Base64.getDecoder().decode(encoding));
			System.out.println("#" + tc + " " + decoding);

		}
	}
}
