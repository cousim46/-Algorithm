package java.yesr_2021_month_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bj1292_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int num = 1;
		int sum = 0;
		int deadLine = 0;
		
		while(true) {
			for(int i = 0; i < num; i++) {
				list.add(num);
				if(list.size() == end) {
					for(int j = start-1; j < end; j++) {
						sum +=list.get(j);
					}
					System.out.println(sum);
					return;
				}
			}
		
			num++;
			
			
		}
	

	}

}
