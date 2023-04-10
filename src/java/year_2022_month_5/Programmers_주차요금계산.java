package java.year_2022_month_5;

import java.util.ArrayList;
import java.util.List;

public class Programmers_주차요금계산 {
    public List<Integer> solution(int[] fees, String[] records) {
        List<Integer> list = new ArrayList<>();


        return list;
    }

    public static void main(String[] args) {
        Programmers_주차요금계산 p = new Programmers_주차요금계산();
        int[] fees = {180, 5000, 10, 600};

        String[] arr = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        List<Integer> solution = p.solution(fees, arr);
        for (Integer object : solution) {
            System.out.println("object = " + object);
        }


    }
}
