package codigTest2;

import java.util.Iterator;

public class 코딩테스트1 {
    public String solution(String p, int n) {
        String answer = "";
        String[] AMPM_time = p.split(" ");
        String[] time = AMPM_time[1].split(":");


        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);

        if (AMPM_time[0].toUpperCase().equals("PM") && hour < 12) {
            hour += 12;
        } else if (AMPM_time[0].toUpperCase().equals("AM") && hour == 12) {
            hour = 0;
        }
        if (n > 3599) {
            hour += n / 3600;
            n %= 3600;
        }
        if (n <= 3599 && n > 59) {
            minute += n / 60;
            n %= 60;
        }
        if (n <= 59 && n >= 0) {
            second += n;
        }
        if (second >= 60) {
            minute += 1;
            second -= 60;
        }
        if (minute >= 60) {
            minute -= 60;
            hour += 1;
        }
        if (hour >= 24) {
            hour %= 24;
        }


        answer = String.format("%02d:%02d:%02d", hour, minute, second);

        return answer;
    }

    public static void main(String[] args) {
        코딩테스트1 p = new 코딩테스트1();
        System.out.println("p.solution(\"PM 01:00:00\",10) = " + p.solution("AM 6:30:00", 200000));
    }
}
