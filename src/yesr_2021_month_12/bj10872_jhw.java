package yesr_2021_month_12;

import java.util.Scanner;

public class bj10872_jhw {
	
	static int factorial(int N) { 
		if(N == 1 || N == 0) {
			return 1;
		}
		return N * factorial(N-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(factorial(N));

	}

}
