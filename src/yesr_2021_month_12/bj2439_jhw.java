package yesr_2021_month_12;

import java.util.Scanner;

public class bj2439_jhw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = num; i >0; i--) {
			for( int j =i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k = num; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
