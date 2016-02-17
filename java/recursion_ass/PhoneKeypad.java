package recursion_ass;

import java.util.Scanner;

public class PhoneKeypad {

	/**
	 * @param args
	 */
	
	
	public static String values(char c) {
		if(c=='2')
			return "abc";
		else if(c=='3')
			return "def";
		else if(c=='4')
			return "ghi";
		else if(c=='5')
			return "jkl";
		else if(c=='6')
			return "mno";
		else if(c=='7')
			return "pqrs";
		else if(c=='8')
			return "tuv";
		else 
			return "wxyz";
		
	}
	
	public static String[] keyPadComb(String n) {
		if( n.length()==0 ) {
			String[] out=new String[1];
			out[0]="";
			return out;
		}
		
		String[] smallerOutput =keyPadComb(n.substring(1));
		String comb=values(n.charAt(0));
		String[] output= new String[ smallerOutput.length*comb.length() ];
		int k=0;
		for(int i=0;i<comb.length();i++) {
			for(int j=0;j<smallerOutput.length;j++) {
				output[k]=comb.charAt(i)+smallerOutput[j];
				k++;
			}
		}
		return output;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String n;
		System.out.println("Enter the number : ");
		n=s.nextLine();
		String[] out=keyPadComb(n);
		for(int i=0;i<out.length;i++)
			System.out.println(out[i]);

	}

}
