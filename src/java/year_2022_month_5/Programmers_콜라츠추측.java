package java.year_2022_month_5;

public class Programmers_콜라츠추측 {
    public int solution(long num) {
        int answer = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            if (answer == 500) {

                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_콜라츠추측 programmers_콜라츠추측 = new Programmers_콜라츠추측();
        System.out.println(programmers_콜라츠추측.solution(626331));
        System.out.println(626331* 3 + 1);
    }
}
