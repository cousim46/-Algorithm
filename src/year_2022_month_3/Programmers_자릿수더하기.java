package year_2022_month_3;

public class Programmers_자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String[] num = Integer.toString(n).split("");
        for(int i = 0; i < num.length; i++) {
            answer += Integer.parseInt(num[i]);
        }
        return answer;
    }
}
