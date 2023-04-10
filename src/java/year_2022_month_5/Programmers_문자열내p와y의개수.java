package java.year_2022_month_5;

public class Programmers_문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        for(int i = 0; i < s.length();i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                pCnt++;
            }else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                yCnt++;
            }
        }
        if(pCnt != yCnt) {
            answer = false;
        }

        return answer;
    }
}
