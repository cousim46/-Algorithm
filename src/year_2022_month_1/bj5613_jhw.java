package year_2022_month_1;

import java.util.Scanner;

public class bj5613_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		while(true) {
			String str = sc.next();
			if(str.equals("+")) {
				result += sc.nextInt();
			}else if(str.equals("-")) {
				result -= sc.nextInt();
			}else if(str.equals("*")) {
				result *= sc.nextInt();
			}else if(str.equals("/")) {
				result /= sc.nextInt();
			}else if(str.equals("=")) {
				System.out.println(result);
				break;
			}else {
				result = Integer.parseInt(str);
			}
		}
	}

}
