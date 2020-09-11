package coding_test.programmers.level2;

import java.util.Arrays;

public class 주식가격 {

	static int[] prices = { 1, 2, 3, 2, 3 };
//	static int[] prices = { 3, 4, 2, 6, 5 };

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(prices)));
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		label: for (int i = 0; i < prices.length - 1; i++) {
			int cnt = 0;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] <= prices[j])
					cnt++;
				else {
					if (i != prices.length - 1)
						cnt++;
					answer[i] = cnt;
					continue label;
				}
			}
			answer[i] = cnt;
		}

		return answer;
	}
}
