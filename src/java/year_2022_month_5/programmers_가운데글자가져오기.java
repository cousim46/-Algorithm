package java.year_2022_month_5;

public class programmers_가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0) {
            answer += s.charAt(s.length()/2-1);
            answer +=  s.charAt(s.length()/2);
        }else {
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }

    public static void main(String[] args) {
        programmers_가운데글자가져오기 p = new programmers_가운데글자가져오기();
        System.out.println(p.solution("abcd"));
    }
}
