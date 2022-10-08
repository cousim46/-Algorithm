package year_2022_month_10;

public class Programmers_로또의최고순위와최저순위_jhw {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int grade = 0;
        int zeroCnt = 0;
        int max = 0;
        int[] rank = {6, 5, 4, 3, 2};

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (win_nums[j] == -1) {
                    continue;
                }
                if (lottos[i] == win_nums[j]) {
                    win_nums[j] = -1;
                    grade++;
                    break;
                }
            }
        }
        max = grade + zeroCnt;
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == max) {
                answer[0] = i + 1;
            }
            if (grade > 1) {
                if (rank[i] == grade) {
                    answer[1] = i + 1;
                }
            } else {
                answer[1] = 6;
            }
            if (max == 0) {
                answer[0] = 6;
                answer[1] = 6;
            }
        }
        return answer;
    }
}
