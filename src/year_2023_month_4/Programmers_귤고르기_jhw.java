package year_2023_month_4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Programmers_귤고르기_jhw {
    public static void main(String[] args) {
        Programmers_귤고르기_jhw p = new Programmers_귤고르기_jhw();
        int[] arr = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println("p = " + p.solution(4, arr));
    }

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            } else {
                map.put(tangerine[i], +1);
            }
        }
        List<Map.Entry<Integer, Integer>> sortMap = new LinkedList<>(map.entrySet());
        sortMap.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        for (Map.Entry<Integer, Integer> integerIntegerEntry : sortMap) {
            if (k - integerIntegerEntry.getValue() <= 0) {
                answer++;
                break;
            } else if (k - integerIntegerEntry.getValue() > 0) {
                k = k - integerIntegerEntry.getValue();
                answer++;
            }
        }
        return answer;
    }
}
