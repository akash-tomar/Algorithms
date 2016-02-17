package assigments;

import java.util.Scanner;

public class SubStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//int size;
		//System.out.println("Enter the size of string");
		//size=s.nextInt();
		String str;
		//for(int i=0;i<size;i++)
		str=s.nextLine();
		for(int i=1;i<=str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				boolean found=false;
				for(int k=0;k<i;k++)
				{	
					if(j+i <= str.length())
					    System.out.print(str.charAt((j+k) ) );
					else
					{
						found=true;
						break;
					}
				}
				if(!found)
				   System.out.println();
			}
		}
	}

}
