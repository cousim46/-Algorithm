package java.year_2022_month_3;

import java.util.Arrays;

public class Programmers_x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int sum = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sum;
            sum += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_x만큼간격이있는n개의숫자 p = new Programmers_x만큼간격이있는n개의숫자();
        System.out.println("Arrays.toString(p.solution(4,3)) = " + Arrays.toString(p.solution(4,3)));
    }


}
