package yesr_2021_month_12;

import java.util.Scanner;

public class bj13163_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			String god = "god";
			String str[] = sc.nextLine().split(" ");
			
			for(int j = 1; j < str.length; j++) {
				god += str[j];
			}
			sb.append(god +"\n");
		}
		System.out.println(sb);

	}

}
