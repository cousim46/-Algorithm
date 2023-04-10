package java.year_2022_month_6;

import java.util.Stack;

public class Programmers_짝지어제거하기 {
    public int solution(String s) {
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(String.valueOf(s.charAt(i)));
            }else {
                String lastStr = stack.peek();
                String currentStr = String.valueOf(s.charAt(i));
                if(lastStr.equals(currentStr)) {
                    stack.pop();
                }else {
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }
        }
        if(stack.isEmpty()) {
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        Programmers_짝지어제거하기 p = new Programmers_짝지어제거하기();
        System.out.println("p.solution(\"baabaa\") = " + p.solution("bbabba"));
    }
}
