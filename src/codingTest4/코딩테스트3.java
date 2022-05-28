package codingTest4;

import java.util.LinkedList;
import java.util.Queue;

public class 코딩테스트3 {
    public int solution(int n, int maxhp, int[] times, int[] effects) {
        int answer = 0;
        int curhp = 0;
        int effectIndex = 0;
        int a = 0;
        for(int i = 1 ; i < n; i++) {
            for(int j = times[i-1] +1; j <= times[i]; j++) {
               curhp+= effects[effectIndex];
               if(curhp > maxhp) {
                   curhp = maxhp;
               }
               if(curhp < 0) {
                   curhp = 0;
               }
               if(curhp == 0 || curhp == maxhp) {
                   answer++;
               }
            }
            effectIndex++;
        }

        return answer;
    }

    public static void main(String[] args) {
        코딩테스트3 p = new 코딩테스트3();
        int[] times = {1, 5, 7, 10, 11};
        int[] effects = {4, -6, -1, 4, 1};
        System.out.println("p.solution(5,10) = " + p.solution(5, 10, times, effects));
    }
}
