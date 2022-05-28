package codigTest;

import java.util.*;

public class 코딩테스트2번문제 {

    public int[] solution(int[][] data) {
        int[] answer = new int[data.length];
        int[][] waitArr = new int[data.length][3];
        answer[0] = data[0][0];
        int time = data[0][2];
        int answerIndex = 1;
        int waitArrIndex = 0;
        int pageMin = 0;
        for (int i = 1; i < data.length; i++) {
            if (time > data[i][1]) {
                waitArr[waitArrIndex] = data[i];
                waitArrIndex++;
            } else if (time == data[i][1]) {
                answer[answerIndex] = data[i][0];
                answerIndex++;
                time += waitArr[i][2];
            }
        }
        for (int i = 0; i < waitArr.length - 1; i++) {
            for (int j = i + 1; j < waitArr.length; j++) {
                if (waitArr[i][2] < waitArr[j][2]) {
                    pageMin = waitArr[i][0];
                    time += waitArr[i][2];
                } else if (waitArr[i][2] == waitArr[j][2]) {
                    if (waitArr[i][0] < waitArr[j][0]) {
                        pageMin = waitArr[i][0];
                        time += waitArr[i][2];
                    } else if (waitArr[i][0] > waitArr[j][0]) {
                        pageMin = waitArr[j][0];
                        time += waitArr[j][2];
                    }

                }
            }
        }
        answer[answerIndex] = pageMin;
        return answer;
    }

    public static void main(String[] args) {
        코딩테스트2번문제 p = new 코딩테스트2번문제();
        int[][] arr = {{1, 0, 5}, {2, 2, 2}, {3, 3, 1}, {4, 4, 1}, {5, 10, 2}};
        int[] solution = p.solution(arr);
        for (int i : solution) {
            System.out.println("i = " + i);
        }

    }
}
