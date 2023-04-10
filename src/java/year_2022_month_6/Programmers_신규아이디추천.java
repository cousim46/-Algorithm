package java.year_2022_month_6;

import java.util.ArrayList;
import java.util.List;

public class Programmers_신규아이디추천 {
    public String solution(String new_id) {
        String result = "";
        char[] chars = new_id.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] >= 97 && chars[i] <= 122) &&
                    chars[i] != '-' &&
                    chars[i] != '_' &&
                    chars[i] != '.' &&
                    !Character.isDigit(chars[i])) {
                continue;
            }
            list.add(chars[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                if (list.get(i) == '.') {
                    list.remove(i);
                    i = -1;
                    continue;
                }
            }
            if (list.get(list.size() - 1) == '.') {
                list.remove(list.size() - 1);
            }
            if (list.get(i) == '.') {
                if (list.get(i - 1) == '.') {
                    list.remove(i - 1);
                    i -= 1;
                }
            }

        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(list.size() - 1) != '.') {
                break;
            } else {
                list.remove(list.size() - 1);
            }
        }
        if (list.size() == 0) {
            return "aaa";
        } else if (list.size() >= 1 && list.size() < 3) {
            for (int i = 0; i < list.size(); i++) {
                result += list.get(i);
            }
            int count = 3 - list.size();
            for (int i = 0; i < count; i++) {
                result += list.get(list.size() - 1);
            }
            return result;
        } else if (list.size() > 15) {
            for (int i = 0; i < 15; i++) {
                if (list.get(i) == '.') {
                    if (list.get(i - 1) == '.') {
                        continue;
                    }
                }
                if (i == 14) {
                    if (list.get(i) == '.') {
                        continue;
                    }
                }
                result += list.get(i);
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                result += list.get(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Programmers_신규아이디추천 p = new Programmers_신규아이디추천();
        System.out.println(p.solution("+"));
    }
}
