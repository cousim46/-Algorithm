package year_2022_month_1;

import java.util.Arrays;
import java.util.Scanner;

public class bj10808_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] stringChar = S.toCharArray();
		Arrays.sort(stringChar);
		
		int[] count = new int[26];
		char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w'
,'x','y','z'};		
		for(int i = 0; i < alpha.length; i++) {
			int cnt = 0;
			for(int j = 0; j < stringChar.length; j++) {
				if(alpha[i] == stringChar[j]) {
					cnt++;
				}
			}
			count[i] = cnt;
		}
		for(int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}


	}

}
