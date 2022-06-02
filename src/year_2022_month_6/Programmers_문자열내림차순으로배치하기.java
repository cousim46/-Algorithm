package year_2022_month_6;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());
        for(int i = 0; i < split.length; i++) {
            answer += split[i];
        }
        return answer;
    }
}
