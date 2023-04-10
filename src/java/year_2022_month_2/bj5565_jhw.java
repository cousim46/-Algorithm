package java.year_2022_month_2;

import java.util.Scanner;

public class bj5565_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[10];

        for(int i =0;i<10;i++) {

            num[i] = sc.nextInt();

        }

        int num2 =num[0];

        for(int i =1;i<num.length;i++) {
            num2-=num[i];
        }
        System.out.println(num2);

        sc.close();
    }
}
