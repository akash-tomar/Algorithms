package Competitions;

import java.util.Scanner;

public class SecurePassword {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t;
		t=s.nextInt();
		for(int i=0;i<t;i++) {
			int m,M;
			m=s.nextInt();
			M=s.nextInt();
			long count=0;
			for(int j=m;j<=M;j++) {
				count+=Math.pow(10, j);
			}
			if(count<1000000) {
				System.out.println("NO");
			}
			else
				System.out.println("YES");
		}
	}

}
