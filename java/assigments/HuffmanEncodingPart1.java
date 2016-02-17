package assigments;

import java.util.Scanner;

public class HuffmanEncodingPart1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		str=s.nextLine();
		char ch=str.charAt(0);
		System.out.println(ch);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				continue;
			else
			{
				ch=str.charAt(i);
				System.out.println(ch);
			}
				
		}
		
		
		
		
		
		

	}

}
