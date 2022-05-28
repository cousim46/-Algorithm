package codingTest4;

import java.util.ArrayList;
import java.util.List;

public class 코딩테스트1 {
    public int solution(int n, int[] v) {
        int answer = 0;
        int min = 500500;
        for(int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;
            int sub = 0;
            for(int j = 0; j < i; j++) {
                leftSum += v[j];
            }

            for(int k = i; k < n; k++) {
                rightSum += v[k];
            }
            sub = leftSum - rightSum;
            if(sub < 0 ) {
                sub *= -1;
            }
            if(min > sub) {
                min = sub;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        코딩테스트1 p = new 코딩테스트1();
        int arr[] = {3,2,3,4,-1,-2,-3};

        System.out.println((7+1)/2);
        System.out.println("p.solution() = " + p.solution(7,arr));
    }
}
