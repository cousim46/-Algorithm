package year_2022_month_1;

import java.util.Scanner;

public class bj11557_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int TT = sc.nextInt();
            sc.nextLine();
            int max = 0;
            String maxSchool = "";
            for (int j = 0; j < TT; j++) {
                String[] str = sc.nextLine().split(" ");
                if (max < Integer.parseInt(str[1])) {
                    maxSchool = str[0];
                    max = Integer.parseInt(str[1]);
                }
            }
            sb.append(maxSchool +"\n");
        }
        System.out.println(sb);
    }
}
