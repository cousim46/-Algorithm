package year_2023_month_1;

public class Programmers_중복된숫자개수_jhw {
    public int solution(int[] array, int n) {
        int cnt = 0;
        for (int num : array) {
            if (num == n) {
                cnt++;
            }
        }
        return cnt;
    }
}
