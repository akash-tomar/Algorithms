package printRecursion;

import java.util.Scanner;

public class KeypadComb {

	/**
	 * @param args
	 */
	
	public static String values(char c) {
		if(c=='2')
			return "abc";
		else if(c=='3')
			return "def";
		else if(c=='4')
			return "ghi";
		else if(c=='5')
			return "jkl";
		else if(c=='6')
			return "mno";
		else if(c=='7')
			return "pqrs";
		else if(c=='8')
			return "tuv";
		else 
			return "wxyz";
		
	}
	
	public static void printComb(String str,String stringSoFar) {
		if(str.length()==0) {
			System.out.println(stringSoFar);
			return;
		}
		String comb=values(str.charAt(0));
		for(int i=0;i<comb.length();i++) {
			stringSoFar=stringSoFar.concat(comb.charAt(i)+"");
			printComb(str.substring(1), stringSoFar);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String num;
		System.out.println("Enter the number : ");
		num=s.nextLine();
		printComb(num,"");

	}

}
