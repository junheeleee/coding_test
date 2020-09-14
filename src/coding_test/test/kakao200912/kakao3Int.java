package coding_test.test.kakao200912;

import java.util.ArrayList;
import java.util.Arrays;

public class kakao3Int {

	static class Man {
		int language;
		int skill;
		int career;
		int food;
		int score;

		public Man(int language, int skill, int career, int food, int score) {
			this.language = language;
			this.skill = skill;
			this.career = career;
			this.food = food;
			this.score = score;
		}

	}

	static String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
			"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
			"python backend senior chicken 50" };

	static String[] query = { "java and backend and junior and pizza 100",
			"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
			"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(info, query)));
	}

	private static int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];

		ArrayList<Man> infoList = new ArrayList<>();

		for (int i = 0; i < info.length; i++) {
			String[] arr = info[i].split(" ");
			int[] numArr = new int[5];
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					if (arr[j].equals("cpp")) {
						numArr[j] = 1;
					} else if (arr[j].equals("java")) {
						numArr[j] = 2;
					} else if (arr[j].equals("python")) {
						numArr[j] = 3;
					}
				} else if (j == 1) {
					if (arr[j].equals("backend")) {
						numArr[j] = 1;
					} else if (arr[j].equals("frontend")) {
						numArr[j] = 2;
					}
				} else if (j == 2) {
					if (arr[j].equals("junior")) {
						numArr[j] = 1;
					} else if (arr[j].equals("senior")) {
						numArr[j] = 2;
					}
				} else if (j == 3) {
					if (arr[j].equals("chicken")) {
						numArr[j] = 1;
					} else if (arr[j].equals("pizza")) {
						numArr[j] = 2;
					}
				} else {
					numArr[j] = Integer.parseInt(arr[j]);
				}
			}
			infoList.add(new Man(numArr[0], numArr[1], numArr[2], numArr[3], numArr[4]));
		}

		ArrayList<Man> queryList = new ArrayList<>();

		for (int i = 0; i < query.length; i++) {
			query[i] = query[i].replaceAll(" and", "");
			String[] arr = query[i].split(" ");
			int[] numArr = new int[5];
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					if (arr[j].equals("cpp")) {
						numArr[j] = 1;
					} else if (arr[j].equals("java")) {
						numArr[j] = 2;
					} else if (arr[j].equals("python")) {
						numArr[j] = 3;
					} else {
						numArr[j] = -1;
					}
				} else if (j == 1) {
					if (arr[j].equals("backend")) {
						numArr[j] = 1;
					} else if (arr[j].equals("frontend")) {
						numArr[j] = 2;
					} else {
						numArr[j] = -1;
					}
				} else if (j == 2) {
					if (arr[j].equals("junior")) {
						numArr[j] = 1;
					} else if (arr[j].equals("senior")) {
						numArr[j] = 2;
					} else {
						numArr[j] = -1;
					}
				} else if (j == 3) {
					if (arr[j].equals("chicken")) {
						numArr[j] = 1;
					} else if (arr[j].equals("pizza")) {
						numArr[j] = 2;
					} else {
						numArr[j] = -1;
					}
				} else {
					if (arr[j].equals("-")) {
						numArr[j] = -1;
					} else {
						numArr[j] = Integer.parseInt(arr[j]);
					}
				}
			}
			queryList.add(new Man(numArr[0], numArr[1], numArr[2], numArr[3], numArr[4]));
		}

		for (int i = 0; i < query.length; i++) {
			int cnt = 0;
			for (int j = 0; j < info.length; j++) {
				if (queryList.get(i).language == infoList.get(j).language || queryList.get(i).language == -1) {
					if (queryList.get(i).skill == infoList.get(j).skill || queryList.get(i).skill == -1) {
						if (queryList.get(i).career == infoList.get(j).career || queryList.get(i).career == -1) {
							if (queryList.get(i).food == infoList.get(j).food || queryList.get(i).food == -1) {
								if (queryList.get(i).score <= infoList.get(j).score || queryList.get(i).score == -1) {
									cnt++;
								} else
									continue;
							} else
								continue;
						} else
							continue;
					} else
						continue;
				} else
					continue;
			}
			answer[i] = cnt;
		}

		return answer;
	}
}
