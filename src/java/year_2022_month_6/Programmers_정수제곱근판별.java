package java.year_2022_month_6;

public class Programmers_정수제곱근판별 {
    public long solution(long n) {
        long answer = (long)Math.sqrt(n);
        if(n / answer != answer || n % answer != 0) {
            return -1;
        }
        answer = (answer+1) * (answer+1) ;
        return answer;
    }

    public static void main(String[] args) {
        Programmers_정수제곱근판별 p = new Programmers_정수제곱근판별();
        System.out.println(p.solution(5));
    }
}
