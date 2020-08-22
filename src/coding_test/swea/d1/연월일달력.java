package coding_test.swea.d1;

import java.util.Scanner;

public class 연월일달력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int yearMonthDate = sc.nextInt();

			int year = yearMonthDate / 10000;
			int month = (yearMonthDate - year * 10000) / 100;
			int date = (yearMonthDate - year * 10000) % 100;

			boolean flag = false;

			if (month >= 1 && month <= 12) {
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if (date >= 1 && date <= 31)
						flag = true;
				} else if (month == 2) {
					if (date >= 1 && date <= 28)
						flag = true;
				} else {
					if (date >= 1 && date <= 30)
						flag = true;
				}
			}
			System.out.print("#" + tc + " ");
			if (flag) {
				String prefixYear = String.format("%04d", year);
				String prefixMonth = String.format("%02d", month);
				String prefixDate = String.format("%02d", date);
				System.out.println(prefixYear + "/" + prefixMonth + "/" + prefixDate);
			} else
				System.out.println(-1);
		}

	}

}
