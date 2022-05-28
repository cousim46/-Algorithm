package codingTest3;

import java.util.Arrays;

public class 코딩테스트1 {
    public int solution(int[] A, int[] B) {
        int scoreB = 0;
        int indexA = 0;
        int indexB = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < B.length; i++) {
            if(A[indexA] < B[indexB]) {
                scoreB++;
                indexA++;
                indexB ++;
            }else if(A[indexA] == B[indexB]) {
                indexA++;
                indexB ++;
            }else {
                indexB++;
            }
        }
        return scoreB;
    }
}
