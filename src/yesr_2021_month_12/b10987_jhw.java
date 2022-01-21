package yesr_2021_month_12;

import java.util.Scanner;



public class b10987_jhw {
	 static final char[]ch = {'a','e','i','o','u'};
	static String input() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	static int chCnt(String str, char[] ch) {
		int cnt = 0;
		for(int i = 0; i < ch.length; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == ch[i]) {
					cnt++;
				}
			}
		}
		return cnt;
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(chCnt(input(),ch));
	}

}
