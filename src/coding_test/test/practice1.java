package coding_test.test;

public class practice1 {
	public static void main(String[] args) {

		recursion(10);
	}

	static void recursion(int n) {
		if (n == 0)
			return;
		System.out.print(n + " ");
		recursion(n - 1);
	}
}
