package printRecursion;

import java.util.Scanner;

public class SubsequencesOfString {

	/**
	 * @param args
	 */
	
	public static void subsequence(String input,String stringSoFar) {
		if(input.length()==0) {
			System.out.println(stringSoFar);
			return;
		}
		subsequence(input.substring(1), stringSoFar);
		subsequence(input.substring(1), stringSoFar+""+input.charAt(0));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		System.out.println("Enter the string : ");
		str=s.nextLine();
		subsequence(str,"");
		
	}

}
