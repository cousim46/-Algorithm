package year_2022_month_3;

public class Programmers_짝수와홀수 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) {
            answer = "Even";
        }else {
            answer = "Odd";
        }
        return answer;
    }
}
