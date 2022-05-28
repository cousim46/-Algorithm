package year_2022_month_5;

public class Programmers_시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                if(s.charAt(i)+n > 90) {
                    answer += Character.toString((s.charAt(i) +n) % 90 + 64);
                }else {
                    answer += Character.toString(s.charAt(i) + n);
                }
            } else if(s.charAt(i) > 96 && s.charAt(i) < 123) {
                if(s.charAt(i)+n > 122) {
                answer += Character.toString((s.charAt(i) +n) % 122 + 96);
                }else {
                    answer += Character.toString(s.charAt(i) + n);
                }
            }else {
                answer += Character.toString(s.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_시저암호 p = new Programmers_시저암호();
        System.out.println(p.solution("a B z", 4));
    }
}
