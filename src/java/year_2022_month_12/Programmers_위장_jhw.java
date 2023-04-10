package java.year_2022_month_12;


import java.util.HashMap;
import java.util.Map;

public class Programmers_위장_jhw {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Programmers_위장_jhw p = new Programmers_위장_jhw();
        System.out.println(p.solution(clothes));
    }

    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], clothes[i][1] == null ? 1 : map.get(clothes[i][1]) + 1);
        }
        answer = map.get("headgear");


        return answer;
    }
}
