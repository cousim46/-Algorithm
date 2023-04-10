package java.year_2021_month_11;

import java.util.Scanner;

public class bj1009_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int pow[] = new int[4];
			int A = sc.nextInt();
			int num = A;
			int B = sc.nextInt() -1;
			if(A == 1 || A == 5 || A ==6) {
				sb.append(A+"\n");
			}else {
				for(int j = 0; j < 4; j++) {
					pow[j] = num;
					num *= A;
					
				}
				
				String str = Integer.toString(pow[B%4]);
				sb.append(str.charAt(str.length()-1)+"\n");
			}
			
		}
		System.out.println(sb);

	}

}
