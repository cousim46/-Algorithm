package year_2022_month_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_짝지어제거하기 {
    public int solution(String s) {
        String[] str = new String[26];
        int index = 0;
        String answer = s;
        for(char c ='a'; c <='z'; c++) {
            str[index] = c+""+c;
            index++;
        }
        for(int i=0,j = 0; i < s.length(); i++, j++) {
            if(j ==26) {
                j = 0;
            }
            answer = answer.replace(str[j], "");
            if(answer.equals("")) {
                return 1;
            }


        }
        return 0;
    }

    public static void main(String[] args) {
        Programmers_짝지어제거하기 p = new Programmers_짝지어제거하기();
          System.out.println("p.solution(\"baabaa\") = " + p.solution("bbabbac"));
    }
}
