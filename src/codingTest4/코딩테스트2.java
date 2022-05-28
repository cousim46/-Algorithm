package codingTest4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 코딩테스트2 {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        List<String> list = new ArrayList<>();
        for(int i = 0; i < split.length; i++) {
            String word = split[i];
            for(int j = 0; j < split.length; j++) {
                if(i != j) {
                    word += split[j];
                }
            }
            list.add(word);
        }
        Collections.sort(list);
        answer = list.get(list.size()-1);
        return answer;
    }

    public static void main(String[] args) {
        코딩테스트2 p = new 코딩테스트2();
        System.out.println("p.solution(\"baba\") = " + p.solution("baba"));
    }
}
