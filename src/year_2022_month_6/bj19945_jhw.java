package year_2022_month_6;

import java.io.*;

public class bj19945_jhw {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        if(N  < 0 ) {
            System.out.println(32);
            return;
        }
        int cnt = 0;
        do {
            N = N / 2 ;
            cnt++;

        }while(N != 0 );
        System.out.println(cnt);

    }
}
