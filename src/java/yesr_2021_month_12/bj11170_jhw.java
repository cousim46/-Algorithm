package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj11170_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char zero = '0';
		for(int i = 0; i < T; i++) {
			String N = sc.next();
			String M = sc.next();
			int zeroCnt = 0;
		for(int j = Integer.parseInt(N); j <=Integer.parseInt(M); j++) {
			if(Integer.toString(j).contains("0")) {
				
				for(int k = 0; k < Integer.toString(j).length(); k++) {
					if(Integer.toString(j).charAt(k) == zero) {
						zeroCnt++;	
					}
				}
			}
		}
		System.out.println(zeroCnt);
			
		}

	}

}
