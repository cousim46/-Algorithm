package codigTest2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 코딩테스트2 {
    public int solution(int p) {
        int answer = 0;

        if(p >= 1000 && p <=10000) {
            for (int i = p + 1; i < 10000; i++) {
                int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                int cnt = 0;
                int calc = i;
                for (int j = 0; j < 4; j++) {
                    int nice = calc % 10;
                    calc = calc / 10;
                    if (num[nice] != -1) {
                        num[nice] = -1;
                        cnt++;
                        if (cnt == 4) {
                            return i;
                        }
                    } else if (num[nice] == -1) {
                        break;
                    }
                }

            }
        }
        return answer;
    }


    public static void main(String[] args) {
        코딩테스트2 p = new 코딩테스트2();
        System.out.println(p.solution(0));
    }
}
