package java.year_2023_month_4;

import java.util.PriorityQueue;

public class Programmers_명예의전당_1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> rank = new PriorityQueue<>();
        answer[0] = score[0];
        rank.add(score[0]);
        for (int i = 1; i < score.length; i++) {

            if (k == rank.size()) {
                if (rank.peek() < score[i]) {
                    answer[i] = rank.peek();
                    rank.poll();
                    rank.add(score[i]);
                }
            } else {
                rank.add(score[i]);
            }
            answer[i] = rank.peek();
        }

        return answer;
    }
}
