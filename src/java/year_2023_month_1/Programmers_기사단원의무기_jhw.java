package java.year_2023_month_1;


public class Programmers_기사단원의무기_jhw {

    public static void main(String[] args) {
        Programmers_기사단원의무기_jhw p = new Programmers_기사단원의무기_jhw();
        System.out.println("p.solution() = " + p.solution(100000, 100, 2));
    }

    public int solution(int number, int limit, int power) {
        int answer = 1;
        for (int i = 2; i <= number; i++) {
            int cnt = 2;
            int value = i / 2;
            for (int j = 2; j <= value; j++) {
                if (i % j == 0) {
                    cnt++;

                }
                if (cnt > limit) {
                    answer += power;
                    break;
                }
            }
            if (cnt <= limit) {
                answer += cnt;
            }

        }
        return answer;
    }
}
