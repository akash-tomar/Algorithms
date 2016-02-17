package printRecursion;

import java.util.Scanner;

public class PermutationOfString {

	/**
	 * @param args
	 */
	
	public static void permutations(String str,String stringSoFar) {
		if(str.length()==0) {
			System.out.println(stringSoFar);
		}
		for(int i=0;i<str.length();i++) {
			//char ch=str.charAt(i);
			String input="";
			
			for(int j=0;j<str.length();j++) {
				if(j!=i) {
					input=input.concat(str.charAt(j)+"");
					
				}
			}
			permutations(input, stringSoFar.concat(str.charAt(i)+""));
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		str=s.nextLine();
		permutations(str,"");

	}

}
