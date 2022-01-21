package yesr_2021_month_12;

import java.util.Scanner;

public class bj2857_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String[] strArr =new String[5];
		int cnt = 0;
		for(int i = 0; i < strArr.length; i++) {
			String str = sc.next();
			if(str.contains("FBI")) {
				sb.append((i+1) +" ");
				cnt ++;
			}
		}
		if(cnt == 0) {
			System.out.println("HE GOT AWAY!");
		}else {
			System.out.println(sb);
		}
	}

}
