package java.year_2022_month_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programmers_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (String str : completion) {
            map.put(str, map.get(str) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_완주하지못한선수 p = new Programmers_완주하지못한선수();
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        System.out.println(p.solution(part, comp));

    }
}
