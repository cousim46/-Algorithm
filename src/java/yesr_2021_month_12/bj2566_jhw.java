package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj2566_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N[][] = new int[9][9];
		int max = 0;
		int row=0;
		int col =0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				N[i][j] = sc.nextInt();
				if(max < N[i][j]) {
					max = N[i][j];
					row = i;
					col = j;
				}
			}
			
		}
		System.out.println(max);
		System.out.println((row+1) +" " + (col+1));
	}

}
