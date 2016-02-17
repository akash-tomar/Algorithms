package Competitions;

import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=1;
		for(int testCase=1;testCase<=t;testCase++) {

			int sMax=s.nextInt();
			String str=s.nextLine();
			char ab = str.charAt(0);
			int x=str.charAt(0)-'0';
			int y = ab-'0';
			int personsRequired=0;
			for(int i=1;i<=sMax+1;i++) {
				if(str.charAt(i)!='0') {
					if(x>=i) {
						x+=str.charAt(i)-'0';
					}
					else {
						personsRequired+=(i-x);
						x+=str.charAt(i)-'0';
					}
				}

			}

			System.out.println("Case #"+testCase+": "+personsRequired);

		}
	}
}
