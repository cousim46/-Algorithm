package year_2022_month_3;

public class Programmers_없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) {
            answer -= number;
        }
        return answer;
    }
}
