package year_2022_month_3;

import java.util.Scanner;

public class bj10801_jhw {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] aCard = new int[10];
        int[] bCard = new int[10];
        int aWin = 0;
        int bWin = 0;
        for(int i = 0; i < 10; i++) {
            aCard[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            bCard[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            if(aCard[i] > bCard[i]) {
                aWin++;
            }else if(aCard[i] < bCard[i]) {
                bWin++;
            }
        }
        if(aWin > bWin) {
            System.out.println("A");
        }else if(aWin < bWin) {
            System.out.println("B");
        }else {
            System.out.println("D");
        }

    }

}
