package java.year_2021_month_11;

import java.util.Scanner;


public class bj1292_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int NM[][] = new int[N][M];
		for(int i = 0; i < NM.length; i++) {
			for(int j = 0; j < NM[i].length; j++) {
				NM[i][j] = sc.nextInt();
			}
		}
		int K = sc.nextInt();
		int arr[][] = new int[K][4];
		for(int i = 0; i< arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt()-1;
				
			}
			
			for(int j = arr[i][0]; j <= arr[i][2]; j++) {
				for(int k = arr[i][1]; k <= arr[i][3]; k++) {
					sum += NM[j][k];
				}
			}
			System.out.println(sum);
		}
		
		
	}

}
