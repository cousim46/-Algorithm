package codigTest;

public class 코딩테스트3번문제 {
    public int solution(int[] histogram) {
        int answer = -1;
        int resultMax = 0;
        int result;
        for (int i = histogram.length - 1; i >= 0; i--) {
            for (int j = 0; j < histogram.length; j++) {
                result = i - j - 1;
                if (histogram[i] < histogram[j]) {
                    result *= histogram[i];
                } else {
                    result *= histogram[j];
                }
                if (resultMax < result) {
                    resultMax = result;
                }
            }
        }
        if (resultMax < 0) {
            return answer * resultMax;
        }
        return resultMax;
    }

    public static void main(String[] args) {
        코딩테스트3번문제 p = new 코딩테스트3번문제();
        int[] his = {3, 8, 5, 1, 10, 5};
        System.out.println("p.solution() = " + p.solution(his));
    }
}
