package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj10809_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch[] = new char[26];
		for(int i =0; i < 26; i++) {
			ch[i] =  (char)(i+97);
			
		}
		StringBuilder sb = new StringBuilder();
		String str = sc.next();
		for(int i = 0; i < ch.length; i++) {
			boolean minus = true;
			for(int j = 0; j < str.length(); j++) {
				if(ch[i] == str.charAt(j)) {
					sb.append(j +" ");
					minus = false;
					break;
				}
				
			}
			if(minus) {
				sb.append(-1 +" ");
			}
			
		}
		System.out.println(sb);
	}

}
