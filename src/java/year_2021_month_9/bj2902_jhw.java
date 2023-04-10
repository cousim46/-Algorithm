package java.year_2021_month_9;

import java.util.Scanner;

public class bj2902_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = sc.next().split("-");
		String str = "";
		for(int i = 0; i < strArr.length; i++) {
			str += strArr[i].charAt(0);
		}
		System.out.println(str);

	}

}
