package java.year_2022_month_6;

public class Programmers_주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[answer.length-1] = 0;
        for(int i = 0; i < answer.length-1; i++) {
            int notFall = 0;
            for(int j = i+1;  j < answer.length; j++) {
                notFall++;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = notFall;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_주식가격 p = new Programmers_주식가격();
        int[] arr = {1,2,3,2,3};
        int[] solution = p.solution(arr);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
