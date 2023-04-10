package java.year_2022_month_3;

import java.util.Scanner;

public class bj20112_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArr = new String[num];
        String[][] str = new String[num][num];
        int cnt = 0;
        for(int i = 0; i < num; i++) {
            strArr[i] = sc.next();
            str[i] = strArr[i].split("");
        }


        for(int i = 0; i < str.length; i++) {
            String text = "";
            for(int j = 0; j < str[i].length; j++) {
                text += str[j][i];
            }
            if(text.equals(strArr[i])) {
                cnt++;
            }
        }
        if(cnt == num) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
