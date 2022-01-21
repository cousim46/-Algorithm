package yesr_2021_month_12;

import java.util.Scanner;

public class bj2742_jhw {
	static int input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	static void N(int input) {
		for(int i = input; i>0; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		N(input());
	}

}
