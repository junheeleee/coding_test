package coding_test.test.ebay;

import java.util.LinkedList;
import java.util.Queue;

public class ebay1 {

	static class Data {
		int start;
		int time;

		public Data(int start, int time) {
			this.start = start;
			this.time = time;
		}
	}

	public static void main(String[] args) {
		int[][] simulation_data = { { 0, 3 }, { 2, 5 }, { 4, 2 }, { 5, 3 } };
		System.out.println(solution(2, simulation_data));
	}

	public static int solution(int N, int[][] simulation_data) {
		int answer = 0;

		Queue<Data> q = new LinkedList<>();

		for (int i = 0; i < simulation_data.length; i++)
			q.add(new Data(simulation_data[i][0], simulation_data[i][1]));


		while(!q.isEmpty()) {
			
		}
		
		
		return answer;
	}
}
