package yesr_2021_month_12;

import java.util.Scanner;

public class bj15351_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			String str =sc.nextLine();
			int score = 0;
			if(str.equals("")) {
				i = -1;
				continue;
			}
			for(int j = 'A'; j <='Z'; j++) {
				for(int k = 0; k < str.length(); k++) {
					if(str.charAt(k) == j) {
						score += j-64;
					}
				}
			}
			if(score == 100) {
				System.out.println("PERFECT LIFE");
					
			}else {
				System.out.println(score);
					
			}
		}

	}

}
