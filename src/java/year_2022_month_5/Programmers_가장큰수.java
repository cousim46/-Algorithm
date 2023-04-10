package java.year_2022_month_5;

import java.util.ArrayList;
import java.util.List;

public class Programmers_가장큰수 {
    public String solution(List<Integer> numbers) {
        String answer ="";
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++) {
            list.add(numbers.get(i) % 10);
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_가장큰수 p = new Programmers_가장큰수();
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(10);
        list.add(2);

        String solution = p.solution(list);
        System.out.println("solution = " + solution);
    }
}
