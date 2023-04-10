package java.year_2022_month_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> objects = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                objects.add(array[j]);
            }
            Collections.sort(objects);
            answer[i] = objects.get(commands[i][2]-1);

        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_K번째수 p = new Programmers_K번째수();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = p.solution(array, commands);
        for (int i : solution) {
            System.out.println("i = " + i);
        }

    }
}
