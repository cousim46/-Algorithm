package java.year_2022_month_11;

public class Programmers_콜라문제_jhw {
    public static void main(String[] args) {
        Programmers_콜라문제_jhw p = new Programmers_콜라문제_jhw();
        System.out.println(p.solution(3, 1, 20));
    }

    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n / a != 0) {
            int newBottle = 0;
            newBottle = n / a * a;

            answer += newBottle / a * b;
            n = n - newBottle + newBottle / a * b;

        }
        return answer;
    }
}
