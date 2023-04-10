package java.year_2022_month_2;

import java.util.Scanner;

public class bj2845_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int personCnt = sc.nextInt();
        int width = sc.nextInt();
        int partyPersonCnt = personCnt * width;
        for (int i = 0; i < 5; i++) {
            sb.append((sc.nextInt() - partyPersonCnt) + " ");
        }
        System.out.println(sb);

    }
}
