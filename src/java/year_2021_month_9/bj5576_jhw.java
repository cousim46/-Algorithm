package java.year_2021_month_9;

import java.util.Arrays;
import java.util.Scanner;

public class bj5576_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < 2; i++) {
			int sum = 0;
			int[] arr = new int[10];
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			
			}
			Arrays.sort(arr);
			sum = arr[arr.length-1] + arr[arr.length-2] + arr[arr.length-3];
			System.out.println(sum +" ");
		}

	}

}
