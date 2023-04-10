package java.yesr_2021_month_12;

import java.util.Scanner;

public class bj11050_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� ��� ���ϴ¹�
		// (N,M) ==> N!/M!(N-M)!
		// 
		int N = sc.nextInt();
		int M = sc.nextInt();
		int nMinusK = N - M;
		int nFactorial = 1;
		int kFactorial = 1;
		int nMinusKFactorial = 1;
		for(int i = N; i > 0; i --) {
			nFactorial *= i;
		}
		for(int i =M; i >0; i--) {
			kFactorial *= i;
		}
		for(int i = nMinusK; i >0; i--) {
			nMinusKFactorial *= i;
		}

		System.out.println(nFactorial/(kFactorial * nMinusKFactorial));
		
	}

}
