package java.year_2021_month_9;

import java.util.Scanner;

public class bj2920_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ascending = "12345678";
		String descending = "87654321";
		String str = "";
		for(int i = 0; i < 8; i++) {
			str += sc.next();
		}
		if(str.equals(ascending)) {
			System.out.println("ascending");
		}else if(str.equals(descending)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		

	}

}
