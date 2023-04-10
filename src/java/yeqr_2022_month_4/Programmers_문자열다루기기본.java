package java.yeqr_2022_month_4;

public class Programmers_문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        try {
             Integer.parseInt(s);
        }catch (NumberFormatException e) {
            return false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_문자열다루기기본 p = new Programmers_문자열다루기기본();
        p.solution("asd1");
    }
}
