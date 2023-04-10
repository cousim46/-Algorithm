package java.year_2022_month_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class replay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int K = sc.nextInt();
        String str ="";
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        int k = 1;
        int i = 0;
        while (true) {
            if (i > list.size() - 1) {
                i = 0;
                if (k == K) {
                    str += list.get(i);
                    list.remove(i);
                }
            }

            if (k == K) {
                str += list.get(i);
                list.remove(i);
                k = 0;
                i = i - 1;
            }
            k++;
            i++;
            if (str.length() == N) {
                break;
            }

        }
         sb.append("<");
        for(int j =0; j < str.length();j++) {
            if(j == str.length() -1) {
                sb.append(str.charAt(j) + ">" );
            }else {
                sb.append(str.charAt(j) + ",");
            }
        }
        System.out.println(sb);


    }
}
