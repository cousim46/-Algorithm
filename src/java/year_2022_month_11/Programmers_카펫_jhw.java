package java.year_2022_month_11;

public class Programmers_카펫_jhw {
    public static void main(String[] args) {
        Programmers_카펫_jhw p = new Programmers_카펫_jhw();
        System.out.println("p.solution(10, 2) = " + p.solution(24, 24)[0]);
        System.out.println("p.solution(10, 2) = " + p.solution(24, 24)[1]);
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        answer[0] = 5000;
        answer[1] = 1;
        int brownNum = 0;
        int yellowNum = 0;
        for (int i = 1; i < total; i++) {
            if (total % i == 0) {
                brownNum = total / i;
                yellowNum = i;
                if (brownNum < yellowNum) {
                    break;
                }
                if (answer[0] > total / i) {
                    answer[0] = total / i;
                }
                if (answer[1] < i) {
                    answer[1] = i;
                }

            }
        }

        return answer;
    }
}
