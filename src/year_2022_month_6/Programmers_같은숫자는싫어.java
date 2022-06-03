package year_2022_month_6;

import java.util.ArrayList;

public class Programmers_같은숫자는싫어 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(arr[0]);
        int index = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[index] != arr[j]) {
                answer.add(arr[j]);
                index = j;
            }
        }
        return answer;
    }
}
