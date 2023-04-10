package java.year_2022_month_2;

import java.util.Scanner;

public class bj4344_jhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num;i++) {
            int studentNum = sc.nextInt();
            int studentScore[] = new int[studentNum];
            int sum = 0;
            int cnt = 0;
            for(int j = 0; j < studentScore.length; j++) {
                studentScore[j] = sc.nextInt();
                sum += studentScore[j];
            }
            double avg = sum/(double)studentScore.length;
            for(int j = 0; j < studentScore.length; j++) {
                if(studentScore[j] > avg) {
                    cnt++;
                }
            }
            double rate = 100*cnt/(double)studentNum;


            System.out.printf("%.3f%s\n",(double)Math.round(rate*1000)/1000,"%");
        }

    }
}
