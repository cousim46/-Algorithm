package yesr_2021_month_12;

import java.util.Scanner;

public class bj9093_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			String[] str =sc.nextLine().split(" ");
			for(int j = 0; j < str.length; j++) {
				for(int k = str[j].length()-1; k >=0;k--) {
					sb.append(str[j].charAt(k));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
