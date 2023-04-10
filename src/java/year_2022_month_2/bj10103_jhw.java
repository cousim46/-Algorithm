package java.year_2022_month_2;

import java.util.Scanner;

public class bj10103_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int changScore = 100;
        int sangScore = 100;
        for (int i = 0; i < N; i++) {
            int chang = sc.nextInt();
            int sang = sc.nextInt();
            if (chang > sang) {
                sangScore -= chang;
            } else if (chang < sang) {
                changScore -= sang;
            }
        }
        System.out.println(changScore);
        System.out.println(sangScore);
    }
}
