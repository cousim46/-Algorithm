package year_2022_month_5;

import java.util.*;

public class Programmers_정수내림차순으로배치하기 {
    public long solution(long n) {
        String answer = "";
        String[] str = Long.toString(n).split("");
        Long[] longs = new Long[str.length];
        for(int i = 0; i < str.length; i++) {
            longs[i] = Long.parseLong(str[i]);
        }
        Arrays.sort(longs,Collections.reverseOrder());
        for(int i = 0; i < longs.length; i++) {
            answer += longs[i];
        }
        return Long.parseLong(answer);
    }
    public static void main(String[] args) {

    }
}
