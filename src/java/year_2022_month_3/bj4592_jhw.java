package java.year_2022_month_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bj4592_jhw {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (true) {
            List<String> list = new ArrayList<>();
            int num = sc.nextInt();
            if (num == 0) {
                return;
            }
            String temp = "";
            for (int i = 0; i < num; i++) {
                String str = sc.next();
                list.add(str);
                if (i > 0) {
                    if (list.get(i - 1).equals(list.get(i))) {
                        temp = list.get(i);
                        list.remove(i);
                        list.add(i, "");
                    } else if (temp.equals(list.get(i))) {
                        list.remove(i);
                        list.add(i, "");
                    } else {
                        temp = "";
                    }
                }
                if (!list.get(i).equals("")) {
                    System.out.print(list.get(i) + " ");
                }
            }

            System.out.println("$");
        }
    }
}