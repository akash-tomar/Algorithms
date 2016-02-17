package recursion_ass;

import java.util.Scanner;

public class UseStarForIdentical {

	/**
	 * @param args
	 */
	public static String convertedString(String str,int pos){
		if(pos+1>=str.length())
			return str;
		if( str.charAt(pos)==str.charAt(pos+1) )
		{
			String change;
			change=str.substring(0, pos+1);
			change=change.concat("*");
			change=change.concat(str.substring(pos+1, str.length()));
			return convertedString(change, pos+2);
		}
		else
			return convertedString(str, pos+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str;
		System.out.println("Enter the string : ");
		str=s.nextLine();
		System.out.println( convertedString(str,0) );
	}

}
