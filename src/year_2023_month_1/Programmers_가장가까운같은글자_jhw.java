package year_2023_month_1;

public class Programmers_가장가까운같은글자_jhw {
    public static void main(String[] args) {
        Programmers_가장가까운같은글자_jhw p = new Programmers_가장가까운같은글자_jhw();
        System.out.println("p.solution(\"banana\") = " + p.solution("banana"));
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        String[] split = s.split("");
        for (int i = 1; i < split.length; i++) {
            for (int j = 0; j < i; j++) {
                if (split[j].equals(split[i])) {
                    split[j] = "";
                    answer[i] = i - j;
                }
            }
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
