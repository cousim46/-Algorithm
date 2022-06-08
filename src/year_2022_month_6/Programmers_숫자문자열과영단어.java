package year_2022_month_6;

public class Programmers_숫자문자열과영단어 {
    public int solution(String s) {
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int answer = 0;
        for(int i = 0; i < str.length; i++) {
            if(s.contains(str[i])) {
                s = s.replaceAll(str[i],Integer.toString(arr[i]));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Programmers_숫자문자열과영단어 p = new Programmers_숫자문자열과영단어();
        System.out.println(p.solution("123"));
    }
}
