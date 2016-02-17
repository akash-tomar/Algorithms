package recursion_ass;

import java.util.Scanner;

public class StringToInt {

	/**
	 * @param args
	 */
	
	
	public static int stringToInt(String str,int pos,int sum){
		if(pos>str.length()-1)
			return sum;
		int x=(int)str.charAt(pos);
		System.out.println(x);
		System.out.println((int)Math.pow(10, str.length()-1-pos));
		sum+=((int)str.charAt(pos)*(int) Math.pow(10, str.length()-1-pos));
		return stringToInt(str, pos+1, sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		str=s.nextLine();
		int x=stringToInt(str,0,0);
		System.out.println(x);
			

	}

}
