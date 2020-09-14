package coding_test.test.kakao200912;

import java.util.ArrayList;
import java.util.Arrays;

public class kakao3 {

	static class Man {
		String language;
		String skill;
		String career;
		String food;
		String score;

		public Man(String language, String skill, String career, String food, String score) {
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
			infoList.add(new Man(arr[0], arr[1], arr[2], arr[3], arr[4]));
		}

		ArrayList<Man> queryList = new ArrayList<>();

		for (int i = 0; i < query.length; i++) {
			query[i] = query[i].replaceAll(" and", "");
			String[] arr = query[i].split(" ");
			queryList.add(new Man(arr[0], arr[1], arr[2], arr[3], arr[4]));
		}

		for (int i = 0; i < query.length; i++) {
			int cnt = 0;
			for (int j = 0; j < info.length; j++) {
				if (queryList.get(i).language.equals(infoList.get(j).language)
						|| queryList.get(i).language.equals("-")) {
					if (queryList.get(i).skill.equals(infoList.get(j).skill) || queryList.get(i).skill.equals("-")) {
						if (queryList.get(i).career.equals(infoList.get(j).career)
								|| queryList.get(i).career.equals("-")) {
							if (queryList.get(i).food.equals(infoList.get(j).food)
									|| queryList.get(i).food.equals("-")) {
								if (Integer.parseInt(queryList.get(i).score) <= Integer.parseInt(infoList.get(j).score)
										|| queryList.get(i).score.equals("-")) {
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
