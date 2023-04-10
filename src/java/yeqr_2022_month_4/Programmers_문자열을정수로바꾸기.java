package java.yeqr_2022_month_4;

public class Programmers_문자열을정수로바꾸기 {
    public int solution(String s) {
        int answer = 0;
        if (s.contains("-")) {
            answer = -Integer.parseInt(s.substring(1, s.length()));
        } else if (s.contains("+")) {
            answer = Integer.parseInt(s.substring(1, s.length()));
        }else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_문자열을정수로바꾸기 p = new Programmers_문자열을정수로바꾸기();
        System.out.println(p.solution("+2234"));
    }
}
