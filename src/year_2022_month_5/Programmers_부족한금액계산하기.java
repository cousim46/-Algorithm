package year_2022_month_5;

public class Programmers_부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        for (int i = 1; i <= count; i++) {
            money -= (price * i);
        }
        if (money >= 0) {
            return 0;
        }

        return answer * money;
    }

    public static void main(String[] args) {
        Programmers_부족한금액계산하기 p = new Programmers_부족한금액계산하기();
        System.out.println(p.solution(10, 20, 2));
    }
}
