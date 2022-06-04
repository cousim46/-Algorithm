package year_2022_month_6;

public class Programmers_이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).equals(" ")) {
                answer += s.charAt(i);
                index = 0;
            }
            else if (index % 2 == 0) {
                answer += Character.toUpperCase(s.charAt(i));
                index++;
            } else {
                answer += Character.toLowerCase(s.charAt(i));
                index++;
            }


        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_이상한문자만들기 p = new Programmers_이상한문자만들기();
        System.out.println("p.solution() = " + p.solution("WWW ASDWFKLAMDLK"));
    }

}
