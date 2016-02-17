package lectures;

import java.util.Scanner;

public class InputOfChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] arr;
		String string=s.next();
        arr=string.toCharArray();
        

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
