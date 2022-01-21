package yesr_2021_month_12;

import java.util.Scanner;

public class bj10870_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] nArr = new int[N+1];
		int sum = 0 ;
		if(N == 0 || N == 1) {
			System.out.println(N);
			
		}else {
			nArr[0] = 0;
			nArr[1] = 1;
		for(int i = 2; i < nArr.length; i++ ) {
				nArr[i] = nArr[i-2] +nArr[i-1];
				
			
		}
		System.out.print(nArr[nArr.length-1]);

	}
	}

}
