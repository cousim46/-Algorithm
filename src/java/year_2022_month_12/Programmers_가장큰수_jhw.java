package java.year_2022_month_12;

public class Programmers_가장큰수_jhw {
    public static void main(String[] args) {
        Double d1 = 5.24;
        Double d2 = 9.67;
        String dStr1 = Double.toString(d1);
        String dStr2 = Double.toString(d2);
        System.out.println("Math.floor(d2 * 10) / 10.0 = " + Math.floor(d2 * 10) / 10.0);
        System.out.println("Math.floor(d2 * 10) / 10.0 = " + Math.floor(d1 * 10) / 10.0);

    }

    public String solution(int[] numbers) {
        String answer = "";
        int maxIndex = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            String[] number = Integer.toString(numbers[i]).split("");

        }
        return answer;
    }
}
