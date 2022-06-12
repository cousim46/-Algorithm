package year_2022_month_6;

import java.math.BigInteger;

public class Programmers_피보나치수 {
    public BigInteger solution(int n) {
        BigInteger Fn_1 = BigInteger.ONE;
        BigInteger Fn_2 = BigInteger.ZERO;
        BigInteger answer = BigInteger.ZERO;


        for(int i = 2; i <=n; i++) {
            answer = Fn_1.add(Fn_2);
            Fn_2 = Fn_1;
            Fn_1 = answer;
        }
        return answer.remainder(new BigInteger("1234567"));
    }

    public static void main(String[] args) {
        Programmers_피보나치수 p = new Programmers_피보나치수();
        System.out.println("p.solution(5) = " + p.solution(3));
    }
}
