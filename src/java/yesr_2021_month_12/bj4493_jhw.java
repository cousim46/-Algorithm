package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj4493_jhw {
	static void winner(String str1, String str2 ) {
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int player1 = 0;
			int player2 = 0;
			String N = sc.next();
			
			for(int j = 0; j < Integer.parseInt(N); j++) {
				String str1 = sc.next();
				String str2 = sc.next();
				
				if(str1.equals("R")) {
					if(str2.equals("P")) {
						player2++;
					}else if(str2.equals("S")) {
						player1++;
					}
				}else if(str1.equals("P")) {
					if(str2.equals("S")) {
						player2++;
					}else if(str2.equals("R")) {
						player1++;
					}
				}else {
					if(str2.equals("R")) {
						player2++;
					}else if(str2.equals("P")) {
						player1++;
					}
				}
			}
			if(player1 > player2) {
				System.out.println("Player 1");
			}else if( player1 < player2) {
				System.out.println("Player 2");
			}else {
				System.out.println("TIE");
			}
		}

	}

}
