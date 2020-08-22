package coding_test.swea.d1;

public class 대각선출력하기 {
	public static void main(String[] args) {
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				if (r == c) {
					System.out.print("#");
				} else
					System.out.print("+");
			}
			System.out.println();
		}
	}
}
