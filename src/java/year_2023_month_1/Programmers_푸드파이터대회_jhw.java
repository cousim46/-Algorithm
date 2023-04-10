package java.year_2023_month_1;

public class Programmers_푸드파이터대회_jhw {
    public static void main(String[] args) {
        Programmers_푸드파이터대회_jhw p = new Programmers_푸드파이터대회_jhw();
        int[] food = {1, 3, 4, 6};
        System.out.println("p = " + p.solution(food));
    }

    public String solution(int[] food) {
        String answer = "0";
        StringBuilder leftUser = new StringBuilder();
        StringBuilder rightUser = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                leftUser.append(i);
                rightUser.append(i);
            }
        }
        return leftUser + answer + rightUser.reverse();
    }
}
