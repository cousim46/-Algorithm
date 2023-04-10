package java.year_2022_month_6;

public class Programmers_나머지1이되는수찾기 {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while (true) {
            if (n % i == 1) {
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}
