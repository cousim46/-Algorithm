package year_2022_month_2;

import java.util.Scanner;

public class bj14489_jhw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int ch = sc.nextInt();
        if (ch * 2 > first + second) {
            System.out.println(first + second);
        } else if (ch * 2 <= first + second) {
            System.out.println((first + second) - ch * 2);
        }
    }

}
