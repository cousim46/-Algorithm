package java.year_2021_month_11;

import java.util.Scanner;

public class bj2455_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		for(int i = 0; i < 4; i++) {
			int down = -sc.nextInt();
			int up = sc.nextInt();
			sum += up + down;
			if(sum > max) {
				max = sum;
			}
			
		}
		System.out.println(max);

	}

}
