package yesr_2021_month_12;

import java.util.Scanner;

public class bj10798_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		int max = 0;
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.next();
			if(max < str[i].length()) {
				max = str[i].length();
			}
		}
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < str.length; j++) {
				if(str[j].length() <= i) {
					continue;
				}else {
				System.out.print( str[j].charAt(i));
			}
		}
		}

	}

}
