package year_2022_month_5;

public class Programmers_하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        String[] str = Integer.toString(x).split("");
        int sum = 0;
        for (String s : str) {
            sum += Integer.parseInt(s);
        }
        if(x % sum != 0) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
