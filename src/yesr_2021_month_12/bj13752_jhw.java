package yesr_2021_month_12;

import java.util.Scanner;

public class bj13752_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int  k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				sb.append("=");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}  
   
}
