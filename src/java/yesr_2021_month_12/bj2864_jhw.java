package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj2864_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] AB = sc.nextLine().split(" ");
		int min = Integer.parseInt(AB[0].replace('6','5')) +  Integer.parseInt(AB[1].replace('6','5'));
		int max = Integer.parseInt(AB[0].replace('5','6')) +  Integer.parseInt(AB[1].replace('5','6'));
		System.out.println(min + " " + max);
	
		
		

	}

}
