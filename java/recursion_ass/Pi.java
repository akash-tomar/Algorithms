package recursion_ass;

import java.util.Scanner;

public class Pi {

	/**
	 * @param args
	 */
	public static String changePi(String str, int pos)
	{
		if(str.charAt(pos)=='p')
		{
			if(str.charAt(pos+1)=='i')
		
			{
				String change;
				change=(str.substring(0, pos));
				change=change.concat("3.14");
				change=change.concat(str.substring(pos+2, str.length()));
				return changePi(change, pos+4);
			}
		}
		else
		{
			return changePi(str, pos+1);
		}
			
		if(pos>=str.length()-1)
			return str;
		else
			return "no";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		str=s.nextLine();
		//System.out.println(str.charAt(0));
		String change=changePi(str,0);
		System.out.println(change);

	}

}
