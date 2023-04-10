package year_2023_month_4;

public class Programmers_이진변환반복하기 {
    public static void main(String[] args) {
        Programmers_이진변환반복하기 p = new Programmers_이진변환반복하기();
        System.out.println("change =  " + p.solution("110010101001")[0]);
        System.out.println("removZero = " + p.solution("110010101001")[1]);
        System.out.println("5%1 = " + 5 % 2);
    }

    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int removeZero = 0;
        while (true) {
            if (s.equals("1")) {
                answer[0] = count;
                answer[1] = removeZero;
                return answer;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    removeZero++;
                }
            }
            s = s.replaceAll("0", "");
            int strLength = s.length();
            s = "";
            while (true) {
                if (strLength == 1) {
                    s = strLength + s;
                    break;
                }
                s = strLength % 2 + s;
                strLength /= 2;
            }
            count++;
        }
    }
}
