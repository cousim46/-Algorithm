package year_2021_month_11;

import java.util.Scanner;

public class bj2875_jhw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int women = sc.nextInt();
		int men = sc.nextInt();
		int intership = sc.nextInt();
		int cnt = 0;
		
		if(women > intership && women > men) {
			women -= intership;
		}else if(men > intership && men > women){
			men -= intership;
		}else {
			System.out.println(cnt);
			return;
		}
		while(true) {
			if(women < 2||men < 1) {
				break;
			}else {
				women -= 2;
				men -= 1;
				cnt ++;
			}
		}
		System.out.println(cnt);

	}

}
