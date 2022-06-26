package year_2022_month_6;

public class Programmers_약수의합 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_약수의합 p = new Programmers_약수의합();
        System.out.println("p.solution(\"3people unFollowed me\") = " + p.solution(12));
    }
}
