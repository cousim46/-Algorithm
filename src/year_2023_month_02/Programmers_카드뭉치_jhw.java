package year_2023_month_02;

public class Programmers_카드뭉치_jhw {
    public static void main(String[] args) {
        Programmers_카드뭉치_jhw p = new Programmers_카드뭉치_jhw();
        String[] card1 = {"i", "water", "drink"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println("p.solution() = " + p.solution(card1, card2, goal));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Index = 0;
        int card2Index = 0;
        for (String word : goal) {
            for (int i = 0; i < cards1.length; i++) {
                if (cards1[i].equals(word)) {
                    if (i != card1Index) {
                        return "No";
                    } else {
                        card1Index++;
                        break;
                    }
                }
            }

            for (int j = 0; j < cards2.length; j++) {
                if (cards2[j].equals(word)) {
                    if (j != card2Index) {
                        return "No";
                    } else {
                        card2Index++;
                        break;
                    }
                }
            }
        }
        return "Yes";
    }
}
