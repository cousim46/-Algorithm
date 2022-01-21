package year_2021_month_10;

import java.util.*;

public class bj2941_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String word = sc.next();
		for(int i = 0; i < str.length; i++) {
			word = word.replace(str[i], " ");
			
		}
		System.out.println(word.length());
	}

}
