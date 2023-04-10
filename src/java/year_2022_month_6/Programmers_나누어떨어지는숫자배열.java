package java.year_2022_month_6;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_나누어떨어지는숫자배열 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        if(answer.size() == 0) {
            answer.add(-1);
            return answer;
        }
        Collections.sort(answer);
        return answer;
    }
}
