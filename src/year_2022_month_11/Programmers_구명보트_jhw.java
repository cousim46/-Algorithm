package year_2022_month_11;

import java.util.Arrays;

public class Programmers_구명보트_jhw {
    public static void main(String[] args) {
        Programmers_구명보트_jhw p = new Programmers_구명보트_jhw();
        int[] arr = {70, 50, 80, 50};
        System.out.println("p.solution() = " + p.solution(arr, 100));
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        int[] reverse = new int[people.length];
        Arrays.sort(people);
        int index = 0;
        for (int i = people.length - 1; i >= 0; i--) {
            reverse[index] = people[i];
            index++;
        }
        int sum = 0;
        for (int i = 0; i < reverse.length; i++) {
            sum += reverse[i];
            System.out.println("i = " + sum);
            if (sum > limit) {
                break;
            } else {
                sum = 0;
                answer++;
            }

        }
        return answer;
    }
}
