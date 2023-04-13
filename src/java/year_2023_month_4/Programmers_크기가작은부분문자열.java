package java.year_2023_month_4;

public class Programmers_크기가작은부분문자열 {

    public int solution(String t, String p) {
        int pLength = p.length();
        long pNum = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tNum = Long.parseLong(t.substring(i, i + pLength));
            if (tNum <= pNum)
                answer++;
        }
        return answer;
    }
}
