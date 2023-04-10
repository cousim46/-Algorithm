package java.year_2022_month_1;

import java.util.Scanner;

public class bj5355_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String str[] = sc.nextLine().split(" ");
            float num = Float.parseFloat(str[0]);
            for (int j = 1; j < str.length; j++) {
                if (str[j].equals("@")) {
                    num *= 3;
                } else if (str[j].equals("%")) {
                    num += 5;
                } else if (str[j].equals("#")) {
                    num -= 7;
                }
            }
            System.out.println(String.format("%.2f", num));
        }
    }

}


