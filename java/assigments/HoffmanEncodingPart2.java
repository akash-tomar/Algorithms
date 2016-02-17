package assigments;
import java.util.Scanner;

public class HoffmanEncodingPart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		str=s.nextLine();
		char ch=str.charAt(0);
		int count=1;
		System.out.print(ch);
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
				continue;
			}
			else
			{
				System.out.print(count);
				count=1;
				ch=str.charAt(i);
				System.out.print(ch);
			}
		}
		System.out.print(count);
		
	}

}
