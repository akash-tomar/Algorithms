package lectures;

import java.util.Scanner;

public class string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		str = s.nextLine();
		for(int i=0; i<str.length();i++)
		{
			char ith = str.charAt(i);
			System.out.println(ith);
			// System.out.println("This is not valid : str[2] : "+ str[2]);
		}
		String s1 = str.substring(0,str.length());  // returns till (end_index-1).
		System.out.println(s1);
		System.out.println(str.concat("abc"));
		//System.out.println(str.);
		int k = str.indexOf("abc"); // returns the index of substring to be searched in the string.
		System.out.println(k);
		System.out.println(str.startsWith("abc")); // returns true if the string starts with this substring
		System.out.println(str.replace("abc","def"));
		//    string are immutable
		// in java strings cannot be updated. i.e if String s = "abc";  s[0]=b; <-This is not valid in java.
		// Since in java if there are two stings s1 and s2 and both have exactly the same strings then in some cases compiler is smart enough to 
		// save the memory by pointing both the strings to the same memory address.
		
		
		int[] arr =new  int[3];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		int[] arr1 = new int[3];
		arr1=arr;
		System.out.println(arr1[0]+" "+arr[1]+" "+arr[2]);
		
		
		
		
		
		
		
		}

}
