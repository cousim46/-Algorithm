package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj14912_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String num = sc.next();
		int cnt = 0;
		for(int i = 1; i <=Integer.parseInt(N); i++) {
			String []iStr = Integer.toString(i).split("");
			
			for(int j = 0; j < iStr.length; j++) {
				
				if(iStr[j].equals(num)) {
					cnt++;
				}
			}
			
		}
		System.out.println(cnt);

	}

}
