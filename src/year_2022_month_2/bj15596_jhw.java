package year_2022_month_2;

public class bj15596_jhw {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
