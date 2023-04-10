package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj2789_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split("");
		String[] cambridge = {"C","A","M","B","R","I","D","G","E"};
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < cambridge.length; j++) {
				if(str[i].equals(cambridge[j])) {
					str[i] = "";
					break;
				}
				
			}
		}
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}

}
