package coding_test.test.kakao200912;

public class kakao1 {

	static String new_id = "...!@BaT#*..y.abcdefghijklm";

	public static void main(String[] args) {
		System.out.println(solution(new_id));
	}

	private static String solution(String new_id) {
		String answer = new_id.toLowerCase(); // 1단계

		for (int i = 0; i < answer.length(); i++) {
			if ((answer.charAt(i) >= 'a' && answer.charAt(i) <= 'z')
					|| (answer.charAt(i) >= '0' && answer.charAt(i) <= '9') || answer.charAt(i) == '-'
					|| answer.charAt(i) == '_' || answer.charAt(i) == '.') {

			} else {
				String delete = Character.toString(answer.charAt(i));
				answer = answer.replace(delete, " "); // 2단계
			}
		}
		answer = answer.replaceAll(" ", "");

		for (int i = 0; i < 1000; i++)
			answer = answer.replace("..", "."); // 3단계

		char firstChar = answer.charAt(0);
		char lastChar = answer.charAt(answer.length() - 1);

		if (firstChar == '.') {
			if (answer.length() > 1)
				answer = answer.substring(1);
			else
				answer = "";
		}
		if (lastChar == '.') {

			if (answer.length() > 1)
				answer = answer.substring(0, answer.length() - 1); // 4단계
			else
				answer = "";
		}
		if (answer.equals(""))
			answer = "a"; // 5단계

		if (answer.length() >= 16)
			answer = answer.substring(0, 15);

		firstChar = answer.charAt(0);
		lastChar = answer.charAt(answer.length() - 1);

		if (firstChar == '.') {
			if (answer.length() > 1)
				answer = answer.substring(1);
			else
				answer = "";
		}
		if (lastChar == '.') {

			if (answer.length() > 1)
				answer = answer.substring(0, answer.length() - 1);
			else
				answer = "";
		} // 6단계

		StringBuilder sb = new StringBuilder();

		sb.append(answer);

		if (answer.length() <= 2) {
			int size = answer.length();
			String last = Character.toString(answer.charAt(size - 1));
			for (int i = 0; i < 3 - size; i++) {
				sb.append(last);
			}
		} // 7단계

		answer = sb.toString();

		return answer;
	}
}
