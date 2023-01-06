package year_2023_month_1;

import java.util.Arrays;

public class Programmers_과일장수_jhw {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 1, 2, 3,};
        Programmers_과일장수_jhw p = new Programmers_과일장수_jhw();
        System.out.println(p.solution(3, 4, score));
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }


        return answer;
    }

}

