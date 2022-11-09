package year_2022_month_11;

import java.util.Arrays;

public class Programmers_최솟값만들기_jhw {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int bIndex = B.length;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[bIndex - 1];
            bIndex--;
        }

        return answer;
    }
}
