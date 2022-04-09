package yeqr_2022_month_4;

public class Programmers_자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String[] splitNum = Long.toString(n).split("");
        int[] answer = new int[splitNum.length];
        for(int i = answer.length-1; i >=0; i--) {
            answer[answer.length-i -1] = Integer.parseInt(splitNum[i]);
        }
        
        return answer;
    }
}
