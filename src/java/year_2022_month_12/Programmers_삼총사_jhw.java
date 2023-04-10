package java.year_2022_month_12;

public class Programmers_삼총사_jhw {
    public static void main(String[] args) {
        Programmers_삼총사_jhw p = new Programmers_삼총사_jhw();
        int[] arr = {-2, 3, 0, 2, -5};
        System.out.println(p.solution(arr));
    }

    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
