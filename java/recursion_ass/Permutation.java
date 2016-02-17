package recursion_ass;

import java.util.Scanner;

public class Permutation {

	/**
	 * @param args
	 */
	public static String[] permutations(String str) {
		if( str.length()==2 ) {
			String[] out=new String[2];
			out[0]=str.charAt(0)+""+str.charAt(1);
			out[1]=str.charAt(1)+""+str.charAt(0);
			return out;
			
		}
		char c=str.charAt(0);
		String[] output=permutations(str.substring(1));
		String[] cOutput=new String[output.length*(output[0].length()+1)];
		int k=0;
		for(int i=0;i<output.length;i++) {
			int l=output[i].length()+1;
			int pos=0;
			int count=0; 
			while(count<l) {
				cOutput[k]="";
				int point=0;
				int j;
				for(j=0;j<l;j++) {
					if(pos==j)
						cOutput[k]=cOutput[k].concat(""+c);
					else {
						cOutput[k]=cOutput[k].concat(""+output[i].charAt(point));
						point++;
					}
				}
				pos++;
				k++;
				count++;
			}
		}
		return cOutput;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n;
		System.out.println("Enter the string : ");
		n=s.nextLine();
		String[] str=permutations(n);
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);

	}

}
