//package Competitions;

import java.util.Scanner;

public class EquidistantString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		char[] arr=new char[str1.length()];
		int count=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i))
				count++;
			else 
				if(str1.charAt(i)==str2.charAt(i))
					arr[i]='0';
		}
		if(count%2!=0) {
			System.out.println("impossible");
			return;
		}
		else {
			boolean first=true;
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)!=str2.charAt(i)) {
					if(first) {
						arr[i]=str1.charAt(i);
						first=false;
					} 
					else
						if(!first) {
							arr[i]=str2.charAt(i);
							first=true;
						}
				}
			}
		}
		for(int i=0;i<str1.length();i++) {
			System.out.print(arr[i]);
		}
	}

}
