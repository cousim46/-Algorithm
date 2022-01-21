package yesr_2021_month_12;

import java.util.Scanner;

public class bj11023_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str= sc.nextLine().split(" ");
		int sum = 0;
		
		for(int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		System.out.println(sum);

	}

}
