package recursion_ass;

import java.util.Scanner;

public class Pallindrome {

	/**
	 * @param args
	 */
	public static boolean isPallindrome(String str,int bIndex,int eIndex)
	{
		if(bIndex==eIndex)
			return true;
		else if(eIndex-bIndex==1 && str.charAt(eIndex)==str.charAt(bIndex))
			return true;
			
		if(str.charAt(bIndex)==str.charAt(eIndex))
			return isPallindrome(str, bIndex+1, eIndex-1);
		else 
			return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		System.out.println("Enter the String : ");
		str=s.nextLine();
		if( isPallindrome(str,0,str.length()-1) )
		   System.out.println("yes");
		else
			System.out.println("No");

	}

}
