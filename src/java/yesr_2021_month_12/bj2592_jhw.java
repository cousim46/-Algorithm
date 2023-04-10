package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj2592_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			num[i]= sc.nextInt();
			sum += num[i];
		}
		int avg = sum / num.length;
		
		int index = 0;
		int max = 0;
		for(int i = 0; i < num.length; i++) {
			int cnt = 0;
			for(int j = i+1; j < num.length; j++) {
				
				if(num[i] == num[j]) {
					cnt++;
					
				}
			}
			
			if(cnt > max ) {
				max = cnt;
				index = i;
			}
			
		}
		System.out.println(avg);
		System.out.println(num[index]);

	}

}
