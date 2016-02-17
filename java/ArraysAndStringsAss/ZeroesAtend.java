package ArraysAndStringsAss;

import java.util.Scanner;

public class ZeroesAtend {

	/**
	 * @param args
	 */
	
	public static String zeroesAtEnd(String str) {
		if(str.length()==0) {
			return str;
		}
		char ch=str.charAt(0);
		String subOutput=zeroesAtEnd(str.substring(1));
		String output;
		if((ch-'0')==0) {
			output=subOutput+""+ch;
		}
		else
			output=ch+""+subOutput;
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		System.out.println("Enter the number : ");
		str=s.nextLine();
		String output=zeroesAtEnd(str);
		System.out.println(output);

	}

}
