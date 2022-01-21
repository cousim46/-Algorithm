package yesr_2021_month_12;

import java.util.Scanner;


//��õ�


public class bj1157_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] strArr = sc.next().toLowerCase().split("");
		int cnt[] = new int[strArr.length];
		int max = 0;
		int maxIndex = 0;
		int maxCount = 0;
		for(int i = 0; i < strArr.length; i++) {
			int count = 0;
			for(int j = i; j < strArr.length; j++) {
				
				if(strArr[i].equals(strArr[j])) {
					count++;
				}
			
		}
			cnt[i] = count;
			if(max <= cnt[i]) {
				max = cnt[i];
				maxIndex = i;
				maxCount++;
			}
		}
		if(maxCount > 1) { 
			System.out.println("?");
		}else {
			System.out.println(strArr[maxIndex]);
		}
		
	}

}
