package year_2022_month_5;

public class Programmers_문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        for(int i = 0; i < s.length(); i++) {
            System.out.println(Character.getNumericValue('A'));
            if(Character.getNumericValue(s.charAt(i)) > 9  || Character.getNumericValue(s.charAt(i)) <0) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_문자열다루기기본 p = new Programmers_문자열다루기기본();
        System.out.println("p.solution(\"1234\") = " + p.solution("5611"));
    }
}
