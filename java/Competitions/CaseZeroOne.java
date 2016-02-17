package Competitions;

import java.util.Scanner;

public class CaseZeroOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		String str;
		str=s.next();
		int len=str.length();
		//int temp=len;
		//System.out.println(len);
		int i=0;
		while(i<str.length()-1) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				String temp1=str.substring(0, i);
				if(i+2<str.length())
					temp1=temp1.concat(str.substring(i+2));
				str=temp1;
				len-=2;
				if(i!=0)
					i--;
			} else {
				i++;
			}
		}
		System.out.println(len);
	}

}
