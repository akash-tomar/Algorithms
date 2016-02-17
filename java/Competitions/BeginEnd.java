package Competitions;

import java.util.ArrayList;
import java.util.Scanner;

public class BeginEnd {

	/**
	 * @param args
	 */
	
	public static long count=0;
	public static ArrayList<String> Substring(String str) {
		if(str.length()==0) {
			return new ArrayList<String>();
		}
		ArrayList<String> subOutput=Substring(str.substring(1));
		long beginIndex=subOutput.size();
		for(int i=0;i<beginIndex;i++) {
			if((subOutput.get(i)).charAt(0)==str.charAt(1)) {
				subOutput.add(str.charAt(0)+subOutput.get(i));
			}
		}
		subOutput.add(str.charAt(0)+"");
		return subOutput;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1=s.nextLine();
		ArrayList<String> str=Substring(str1);
		int count=0;
		for(int i=0;i<str.size();i++) {
			//if((str.get(i)).charAt(0)==(str.get(i)).charAt((str.get(i)).length()-1))
				System.out.println(str.get(i));
		}
		//System.out.println(count);

	}

}
