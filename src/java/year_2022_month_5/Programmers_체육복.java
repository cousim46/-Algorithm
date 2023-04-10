package java.year_2022_month_5;

public class Programmers_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        for(int i = 0; i < lost.length; i++) {
            int sub = 0;
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer--;
                }
                sub = lost[i] - reserve[j];
                if(sub == -1 || sub == 1) {
                    reserve[j] = 0;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers_체육복 p = new Programmers_체육복();
        int[] lost = {2,4};
        int reserve[] = {2,1,5};
        System.out.println("p.solution(3,lost,reserve) = " + p.solution(5,lost,reserve));

    }
}
