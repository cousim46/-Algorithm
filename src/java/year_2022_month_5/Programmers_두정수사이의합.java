package java.year_2022_month_5;

public class Programmers_두정수사이의합 {
    public long solution(long a, long b) {
        long answer = 0;
        long temp = 0;
        if(a == b) {
            return a;
        }
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        for(long i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
