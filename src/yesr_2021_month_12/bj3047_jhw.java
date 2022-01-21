package yesr_2021_month_12;

import java.util.Scanner;

public class bj3047_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int max = 0,mid=0,min=0;
		
		if(first > second && first > third) {
			max = first;
			if(second > third) {
				mid = second;
				min = third;
			}else {
				mid = third;
				min = second;
			}
		}else if(first > second && first < third) {
			max = third;
			mid = first;
			min = second;
		}else if(first < second && first < third) {
			min = first;
			if(second > third) {
				max = second;
				mid = third;
			}else {
				max = third;
				mid = second;
			}
		}else if(first < second && first > third) {
			mid = first;
			max = second;
			min = third;
		}
		
		
		int [] num = new int[3];
		String ABC[] = sc.next().split("");
		for(int i = 0; i < ABC.length; i++) {
			if(ABC[i].equals("C")) {
				num[i] = max;
			}else if(ABC[i].equals("B")) {
				num[i] = mid;
			}else {
				num[i] = min;
			}
			
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] +" ");
		}
		

	}

}
