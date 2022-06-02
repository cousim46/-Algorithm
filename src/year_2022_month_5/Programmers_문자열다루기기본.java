package year_2022_month_5;

public class Programmers_문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6) {
            try {
                for(int i = 0; i < s.length(); i++) {
                    Integer.parseInt(s);
                }
                return true;
            }catch (NumberFormatException e) {
                return false;
            }
        }else {

            return false;
        }
    }


    public static void main(String[] args) {
        Programmers_문자열다루기기본 p = new Programmers_문자열다루기기본();
    }
}
