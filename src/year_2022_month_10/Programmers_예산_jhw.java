package year_2022_month_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_예산_jhw {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int i = 0; i < d.length; i++) {
            if(budget < d[i]) {
                break;
            }
            budget -= d[i];
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_예산_jhw p = new Programmers_예산_jhw();
        int arr[] = {2,2,3,3};
        System.out.println(p.solution(arr,10));
    }
}
