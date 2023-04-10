package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj3059_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s = "";
		for(int i = 0; i < 26; i++) {
			s += (char) (i+65);
		}
		String sArr[] = s.split("");
		
		for(int i = 0; i < T; i++) {
			int sum = 0;
			
			String str = sc.next();
			for(int j = 65; j < sArr.length+65; j++) {
				if(!str.contains(sArr[j-65])) {
					sum += j;
				}
			}
			
			System.out.println(sum);
			
		}

	}

}
