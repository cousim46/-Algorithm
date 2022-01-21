package yesr_2021_month_12;

import java.util.Scanner;

public class bj14489_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ch = sc.nextInt() * 2;
		int AB = A+B;
		if(AB >= ch) {
			System.out.println(AB-ch);
		}else {
			System.out.println(AB);
		}
		

	}

}
