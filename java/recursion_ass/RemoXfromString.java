package recursion_ass;

import java.util.Scanner;

public class RemoXfromString {

	/**
	 * @param args
	 */
	public static String removeX(String str,int pos)
	{
		if(pos==str.length()-1 && str.charAt(pos)!='x')
			return str;
		else if( pos==str.length()-1 && str.charAt(pos)=='x' )
		{
			String change;
			change=str.substring(0, str.length()-1);
			return change;
		}
		if(str.charAt(pos)=='x')
		{
			String change;
			change=str.substring(0, pos);
			change=change.concat(str.substring(pos+1, str.length()));
			return removeX(change, pos);
		}
		else
			return removeX(str, pos+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the string : ");
		str=s.nextLine();
		System.out.println(removeX(str,0));

	}

}
