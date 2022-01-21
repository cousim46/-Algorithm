package year_2021_month_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bj3062_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<String> list = new ArrayList<>();
		for(int i = 0; i < T; i++) {
			String str = sc.next();
			String reStr = "";
			for(int j = str.length()-1; j >=0; j--) {
				reStr += str.charAt(j);
			}
			String yesOrNo = Integer.toString(Integer.parseInt(reStr) + Integer.parseInt(str));
			String reYesOrNo = "";
			for(int j = yesOrNo.length()- 1; j >=0; j--) {
				reYesOrNo += yesOrNo.charAt(j);
			}
			if(yesOrNo.equals(reYesOrNo)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}

}
