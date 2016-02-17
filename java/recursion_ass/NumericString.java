package recursion_ass;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NumericString {

	/**
	 * @param args
	 */
	
	public static char alphabets(int c) {
		if(c==1)
			return 'a';
		else if(c==2)
			return 'b';
		else if(c==3)
			return 'c';
		else if(c==4)
			return 'd';
		else if(c==5)
			return 'e';
		else if(c==6)
			return 'f';
		else if(c==7)
			return 'g';
		else if(c==8)
			return 'h';
		else if(c==9)
			return 'i';
		else if(c==10)
			return 'j';
		else if(c==11)
			return 'k';
		else if(c==12)
			return 'l';
		else if(c==13)
			return 'm';
		else if(c==14)
			return 'n';
		else if(c==15)
			return 'o';
		else if(c==16)
			return 'p';
		else if(c==17)
			return 'q';
		else if(c==18)
			return 'r';
		else if(c==19)
			return 's';
		else if(c==20)
			return 't';
		else if(c==21)
			return 'u';
		else if(c==22)
			return 'v';
		else if(c==23)
			return 'w';
		else if(c==24)
			return 'x';
		else if(c==25)
			return 'y';
		else
			return 'z';
	}
	
	public static String[] numericString(String str) {
		if(str.length()==2) {
			String[] out = new String[2] ;
			char a=str.charAt(0);
			char b=str.charAt(1);
			out[0]=alphabets(a-'0')+" "+alphabets(b-'0');
			if( (str.charAt(0)-'0')*10+(str.charAt(1)-'0')<=26 )
				out[1]=alphabets( (str.charAt(0)-'0')*10+(str.charAt(1)-'0') )+"";
			return out;
		}
		char c=str.charAt(0);
		String[] subOutput=numericString(str.substring(1));
		String[] output=new String[subOutput.length*2];
		int nextWord=0;
		for(int currentWord=0;currentWord<subOutput.length;currentWord++) {
			char d=subOutput[currentWord].charAt(0);
			output[nextWord]=alphabets(c)+" "+subOutput[currentWord].substring(1);
			nextWord++;
			if( (c-'0')*10+(d-'0')<=26 ) {
				output[nextWord]=alphabets( (c-'0')*10+(d-'0') )+""+subOutput[currentWord].substring(2);
				nextWord++;
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
		String[] combinations=numericString(n);
		for(int i=0;i<combinations.length;i++)
			System.out.println(combinations[i]);

	}

}
