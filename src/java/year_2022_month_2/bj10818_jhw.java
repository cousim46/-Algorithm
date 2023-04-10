package java.year_2022_month_2;

import java.util.Scanner;

public class bj10818_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int min = 0;
        int [] numArr = new int[N];
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            numArr[i] = num;
        }
        //numArr[20,10,35,30,7]
        max = numArr[0];
        min = numArr[0];
        for(int i = 0; i < numArr.length; i++) {
            if(max < numArr[i]) {
                max = numArr[i];
            }
            if(min >= numArr[i]) {
                min = numArr[i];
            }
        }
        System.out.println(min+ " " + max);
    }
}
