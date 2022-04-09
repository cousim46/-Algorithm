package yeqr_2022_month_4;

import java.util.Arrays;

public class Programmers_제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(answer.length == 1) {
            answer = new int[arr.length];
            answer[0] = -1;
            return answer;
        }
        answer = new int[arr.length-1];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[j] = arr[i];
            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_제일작은수제거하기 p = new Programmers_제일작은수제거하기();
        int[] arr = {7, 2, 4, 3, 6, 8};
        int[] arr2 = {10};
        System.out.println(Arrays.toString(p.solution(arr)));
    }
}
