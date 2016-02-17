package recursion_ass;

import java.util.Scanner;

public class TwoStringPallindrome {

	/**
	 * @param args
	 */
	
	public static boolean isReverse(String str1,String str2,int begin,int end){
		if(str1.length()!=str2.length())
			return false;
		if(begin==str1.length()-1 && end==0)
			return true;
			
		if(str1.charAt(begin)==str2.charAt(end))
			return isReverse(str1, str2, begin+1, end-1);
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter the first string : ");
		str1=s.nextLine();
		System.out.println("Enter the second string : ");
		str2=s.nextLine();
		if( isReverse(str1,str2,0,str2.length()-1) )
			System.out.println("Yes");
		else
			System.out.println("No");
				

	}

}
