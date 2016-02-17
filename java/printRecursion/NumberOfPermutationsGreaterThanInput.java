package printRecursion;

import java.util.Scanner;

public class NumberOfPermutationsGreaterThanInput {
	public static void permuGreaterThanInput(String str,String soFar,String num) {
		if(str.length()==0) {
			if(Integer.parseInt(soFar)>Integer.parseInt(num)) 
				System.out.println(soFar);
		}
		for(int i=0;i<str.length();i++) {
			String input="";
			for(int j=0;j<str.length();j++) {
				if(j!=i) {
					input=input.concat(str.charAt(j)+"");
				}
			}
			permuGreaterThanInput(input, soFar.concat(str.charAt(i)+""),num);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=s.nextLine();
		permuGreaterThanInput(str, "", str);
	}
}
