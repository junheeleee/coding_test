//package coding_test.test.ebay;
//
//import java.util.Scanner;
//
//public class ebay4 {
//	static int[][] logg = new int[2 * 3 * 3 * 3 * 3][2];
//	static int[][][][][] v = new int[2][3][3][3][3];
//
//	static int[][] permCann = new int[3][2];
//	static int ans = Integer.MAX_VALUE;
//	int ansk[][] = new int[2 * 3 * 3 * 3 * 3][2];
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int p = sc.nextInt();
//
//		bkt(n, m, 0, 0, 0, 0);
//	}
//
//	private static void bkt(int left_Canni, int left_Sungyo, int right_Canni, int right_Sungyo, int cnt,
//			int boatposition) {
//		logg[cnt][0] = left_Canni; /* 답을 알기위해 기록한다. */
//		logg[cnt][1] = left_Sungyo;/* 답을 알기위해 기록한다. */
//		if (ans <= cnt) { /* 만약에 지금의 이동횟수가 지금 가진 답보다 크다면 나간다. */
//			return;
//		}
//		if (right_Canni == 3 && right_Sungyo == 3) { /* 모두가 섬에 도착했다면 */
//			ans = cnt; /* 답을 갱신한다. */
//			/* 이 답에 대한 경로를 갱신한다. */
//		  for(int i=0;i   ansk[i][0]=logg[i][0];){
//				   ansk[i][1]=logg[i][1];
//				  }
//				  return;
//		}
//
//		v[boatposition][left_Canni][left_Sungyo][right_Canni][right_Sungyo] = cnt + 1;
//		/*
//		 * v[배의위치][1번섬식인종][1번섬선교사]
//		 * 
//		 * [2번섬식인종][2번섬선교사] 의 값을 cnt+1로 변경합니다.
//		 */
//		for (int i = 0; i <= 2; i++)
//
//		{ /* i는 선교사 수이다. */
//			for (int j = 0; j <= i && i + j <= 2; j++) { /*
//															 * j는 배에 탈 식인종수입니다. 식인종수는 선교사 수보다 작거나 같아야 한다. (j<=i) 그리고 한
//															 * 보트에는 최대 2명이 탈 수 있다. (i+j <=2)
//															 */
//				if (boatposition == 0) {/* boat의 위치가 1번섬일경우, */
//					if (left_Canni - j >= 0) { /* 인원수가 음수값이 될수 없으므로, 체크한다. */
//						if (left_Sungyo - i >= 0) { /* 마찬가지로 인원수가 음수값이 될수 없으므로, 체크한다. */
//							if (v[1][left_Canni - j][left_Sungyo - i][right_Canni + j][right_Sungyo + i] < 0
//									|| v[1][left_Canni - j][left_Sungyo - i][right_Canni + j][right_Sungyo + i] > cnt
//											+ 1) {/* 이미 이 경우는 고려해봤는지 따져본다. */
//
//								bkt(left_Canni - j, left_Sungyo - i, right_Canni + j, right_Sungyo + i, cnt + 1, 1);
//								// 위에 각 인자값에 대한 설명 해놨습니다. 재귀호출이죠. ^^;
//							}
//						}
//					}
//				} else {/* boat의 위치가 2번섬일경우 */
//					if (right_Canni - j >= 0) { /* 인원수가 음수값이 될수 없으므로, 체크한다. */
//						if (right_Sungyo - i >= 0) { /* 마찬가지로 인원수가 음수값이 될수 없으므로, 체크한다. */
//							if (v[0][left_Canni + j][left_Sungyo + i][right_Canni - j][right_Sungyo - i] < 0
//									|| v[0][left_Canni + j][left_Sungyo + i][right_Canni - j][right_Sungyo - i] > cnt
//											+ 1) {
//
//								bkt(left_Canni + j, left_Sungyo + i, right_Canni - j, right_Sungyo - i, cnt + 1, 0);
//								// 위에 각 인자값에 대한 설명 해놨습니다. 재귀호출이죠. ^^;
//							}
//						}
//					}
//				}
//			}
//		}
//	}
//}