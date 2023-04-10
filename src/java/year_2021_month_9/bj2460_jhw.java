package java.year_2021_month_9;

import java.util.Scanner;

public class bj2460_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int people = 0;
		for(int i = 0; i < 10; i++) {
			int down = sc.nextInt();
			people -= down;
			int up = sc.nextInt();
			people += up;
			if(max < people) {
				max = people;
			}
			
		}
		System.out.println(max);

	}

}
