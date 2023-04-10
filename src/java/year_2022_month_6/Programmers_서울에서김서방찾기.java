package java.year_2022_month_6;

public class Programmers_서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer += i + "에 있다";
                break;
            }
        }
        return answer;
    }
}
