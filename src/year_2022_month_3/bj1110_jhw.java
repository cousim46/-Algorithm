package year_2022_month_3;

import java.util.Scanner;

public class bj1110_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 1;
        String st = str;
        int result = 0;
        while(true) {
            String[] strArr = str.split("");


            if(strArr.length == 1) {
                result = Integer.parseInt(strArr[0]+ strArr[0]);
                str = Integer.toString(result);

            }else {
                result = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);

                if(result >= 10) {
                    result -= 10;
                }
                if(strArr[1].equals("0")) {
                    str = Integer.toString(result);
                }else {
                    str = strArr[1] + result;

                }}
            if(st.equals(str)) {
                System.out.println(cnt);
                break;
            }else {
                cnt++;
            }
        }
    }
}
