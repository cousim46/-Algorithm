package year_2022_month_6;

public class Programmers_다음큰숫자 {
    public int solution(int n) {
        int nOneCnt = 0;
        int resultOneCnt = 0;
        int result = n + 1;
        int answer = n + 1;

        while (true) {

            if (n % 2 == 1) {
                nOneCnt++;
            } else if (n / 2 == 0) {
                if (n % 2 == 1) {
                    nOneCnt++;
                }
                break;
            }
            n /= 2;
        }
        int i = 0;
        while (i != 10) {
            if (answer % 2 == 1) {
                resultOneCnt++;
            } else if (answer / 2 == 0) {
                if (answer % 2 == 1) {
                    resultOneCnt++;
                }
                if (resultOneCnt == nOneCnt) {
                    answer = result;
                    break;
                } else {
                    result++;
                    answer = result;
                    resultOneCnt = 0;
                    continue;
                }
            }
            answer /= 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_다음큰숫자 p = new Programmers_다음큰숫자();
        System.out.println("p.solution(78) = " + p.solution(78));
    }
}
