package java.year_2023_month_1;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_숫자짝꿍_jhw {
    public static void main(String[] args) {
        Programmers_숫자짝꿍_jhw p = new Programmers_숫자짝꿍_jhw();
        // System.out.println(p.solution("5525", "1255"));

    }

    public String solution(String X, String Y) {
        String answer = "";
        String[] xStrList = X.split("");
        String[] yStrList = Y.split("");

        for (int i = 0; i < xStrList.length; i++) {
            for (int j = 0; j < yStrList.length; j++) {
                if (xStrList[i].equals(yStrList[j])) {
                    answer += xStrList[i];
                    xStrList[i] = "";
                    yStrList[j] = "";
                    break;
                }
            }
        }
        String[] resultList = answer.split("");
        Arrays.sort(resultList, Comparator.reverseOrder());
        String result = "";
        for (int i = 0; i < resultList.length; i++) {
            result += resultList[i];
        }
        if (result.equals("")) {
            return "-1";
        } else if (Integer.parseInt(result) == 0) {
            return "0";
        }


        return result;
    }
}
