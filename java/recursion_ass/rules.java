package recursion_ass;

import java.util.Scanner;

public class rules {

	/**
	 * @param args
	 */
	
	public static void rulesCheck(String str,int point){
		if( str.charAt(0)!='a' ){
			System.out.println("No");
			return;
		}
		if(point>=str.length()){
			System.out.println("Yes");
			return;// true;
		}
		
		else if(str.charAt(point)=='a')
				rulesCheck(str, point+1);
		else if(str.charAt(point)=='b')
		{
			if(str.charAt(point+1)=='b')
			{	
				if(point+2>str.length()-1){
					System.out.println("Yes");
					return;
				}
				else if(str.charAt(point+2)=='a')
					rulesCheck(str, point+3);
				else
					System.out.println("No");
				
			}
		}
		else{ 
			System.out.println("No");
			return;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str;
		System.out.println("Enter the string : ");
		str=s.nextLine();
		rulesCheck(str,0);/* )
			System.out.println("No");
		else
			System.out.println("Yes");*/

	}

}
