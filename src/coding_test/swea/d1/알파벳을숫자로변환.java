package coding_test.swea.d1;

import java.util.Scanner;

public class 알파벳을숫자로변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print((int)(s.charAt(i) - 'A') + 1 + " ");
		}
	}
}
