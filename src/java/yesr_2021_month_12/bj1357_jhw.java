package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj1357_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int sum = 0;
		String reverseStr = "";
		for(int i = 0; i < str.length; i++) {
			String s = "";
			for(int j =  str[i].length()-1; j >=0; j--) {
				s += str[i].charAt(j);
			}
			sum += Integer.parseInt(s); 
		}
		String sumStr = Integer.toString(sum);
		for(int i = sumStr.length()-1; i >=0; i--) {
			reverseStr += sumStr.charAt(i);
		}
		System.out.println(Integer.parseInt(reverseStr));
		
		

	}

}
