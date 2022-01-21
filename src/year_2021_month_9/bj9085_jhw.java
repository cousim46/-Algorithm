package year_2021_month_9;

import java.util.Scanner;

public class bj9085_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int sum = 0;
			int N = sc.nextInt();
			for(int j = 0; j < N; j++) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
		}

	}

}
