package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj1547_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		boolean ball[] = {true, false, false};
		boolean temp = false;
		for(int i = 0; i < M; i++) {
			int X  = sc.nextInt()-1;
			int Y = sc.nextInt() -1; 
			temp = ball[X];
			ball[X] = ball[Y];
			ball[Y] = temp;
		}
		for(int i = 0; i < ball.length; i++) {
			if(ball[i] == true) {
				System.out.println(i+1);
			}
		}

	}

}
