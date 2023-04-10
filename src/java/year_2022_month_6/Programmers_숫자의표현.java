package java.year_2022_month_6;

public class Programmers_숫자의표현 {
    public int solution(int n) {
        int answer = 1;
        int cnt = 1;
        while(true) {
            int sum = 0;
            if(cnt == n) {
                break;
            }
            for(int i = cnt; i <n; i++) {
                sum += i;
                if(sum >n) {
                    break;
                }else if(sum == n) {
                    answer++;
                    break;
                }
            }
            cnt++;


        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_숫자의표현 p = new Programmers_숫자의표현();
        System.out.println("p.solution(1) = " + p.solution(3));
    }
}
