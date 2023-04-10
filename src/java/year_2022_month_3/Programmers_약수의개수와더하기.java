package java.year_2022_month_3;

/**
 * 아아디
 * 신고한사람 신고당한사람
 * m            y
 * m            y
 */
public class Programmers_약수의개수와더하기 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int range = i;
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
