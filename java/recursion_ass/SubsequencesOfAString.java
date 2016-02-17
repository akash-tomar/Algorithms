package recursion_ass;

import java.util.Scanner;

public class SubsequencesOfAString {

	/**
	 * @param args
	 */
	
	public static String[] subSequence(String str) {
		if( str.length()==1 ) {
			String[] out=new String[2];
			out[0]="";
			out[1]=str.charAt(0)+"";
			return out;
			
		}
		char c=str.charAt(0);
		String[] output=subSequence(str.substring(1));
		String[] cOutput=new String[2*output.length];
		for(int i=0;i<output.length;i++)
			cOutput[i]=output[i];
		int j=0;
		for(int i=output.length;i<2*output.length;i++){
			cOutput[i]=c+output[j];
			j++;
		}
		return cOutput;
			
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		System.out.println("Enter the string : ");
		str=s.nextLine();
		String[] out=subSequence(str);
		for(int i=0;i<out.length;i++)
			System.out.println(out[i]);

	}

}
