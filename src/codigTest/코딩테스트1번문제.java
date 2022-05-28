package codigTest;

public class 코딩테스트1번문제 {
    public long solution(long n) {
        long answer = 0;
        for(int i = 1; i <= n-1; i++) {
            answer += (n + 1) * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        코딩테스트1번문제 p = new 코딩테스트1번문제();
        System.out.println("p.solution(3) = " + p.solution(2));
    }
}
